package com.example.testreporttable;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kelin.scrollablepanel.library.PanelAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * author : Song
 * date   : 2019/5/3016:37
 * desc   :
 */
public class InOutStockReportAdapter extends PanelAdapter {
    private Context context;
    private InOutStockReportBean data;

    private List<Integer> yearList;
    private Map<Integer, Integer> total = new HashMap<>();

    public InOutStockReportAdapter(Context context, InOutStockReportBean data) {
        this.context = context;
        this.data = data;

        getYear(data);
    }

    private int getYear(InOutStockReportBean data) {
        Set<Integer> year = new HashSet<>();
        for (InOutStockReportBean.InBean in : data.getIn()) {
            year.add(in.getDateYear());
        }
        for (InOutStockReportBean.OutBean in :
                data.getOut()) {
            year.add(in.getDateYear());
        }
        for (InOutStockReportBean.StockBean in :
                data.getStock()) {
            year.add(in.getDateYear());
        }
        yearList = new ArrayList<>(year);
        Collections.sort(yearList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return yearList.size();
    }


    @Override
    public int getRowCount() {
        return 14;
    }

    @Override
    public int getColumnCount() {
        return getYear(data) * 3 + 1;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int row, int column) {
        DateViewHolder dateViewHolder = (DateViewHolder) holder;

        String str = getData(row, column);

        dateViewHolder.setTitleBG(context, row == 0);
        dateViewHolder.setDateTextView(str);
    }

    private String getData(int row, int column) {
        String str = "";
        if (column == 0) {
            if (row != 0 && row <= 12) {
                str = row + "月";
            } else if (row > 12) {
                str = "合计";
            } else {
                str = "(码)";
            }
        } else if (row == 0 && column > 0) {
            switch ((column - 1) % 3) {
                case 0:
                    for (InOutStockReportBean.OutBean in : data.getOut()) {
                        str = yearList.get((column - 1) / 3) + "年";
                    }
                    break;
                case 1:
                    str = "入库";
                    break;
                case 2:
                    str = "库存";
                    break;
                default:
                    break;
            }

        } else if (column > 0 && row > 0) {
            switch ((column - 1) % 3) {
                case 0:
                    for (InOutStockReportBean.OutBean in : data.getOut()) {
                        if (row <= 12 && in.getDateYear() == yearList.get((column - 1) / 3) && in.getDateMonth() == row) {
                            str = String.valueOf(in.getQSum());
                        }
                    }

                    if (row == 13) {
                        str = String.valueOf(total.get(column));
                    } else {
                        total.put(column, total.get(column) != null ? total.get(column) + Integer.parseInt(str) : Integer.parseInt(str));
                    }
                    break;
                case 1:
                    for (InOutStockReportBean.InBean in : data.getIn()) {
                        if (row <= 12 && in.getDateYear() == yearList.get((column - 1) / 3) && in.getDateMonth() == row) {
                            str = String.valueOf(in.getQSum());
                        }
                    }
                    if (row == 13) {
                        str = String.valueOf(total.get(column));
                    } else {
                        total.put(column, total.get(column) != null ? total.get(column) + Integer.parseInt(str) : Integer.parseInt(str));
                    }
                    break;
                case 2:
                    for (InOutStockReportBean.StockBean in : data.getStock()) {
                        if (row <= 12 && in.getDateYear() == yearList.get((column - 1) / 3) && in.getDateMonth() == row) {
                            str = String.valueOf(in.getStock());
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return str;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DateViewHolder(LayoutInflater.from(context).inflate(R.layout.adapter_in_ouu_report, parent, false));
    }

    private static class DateViewHolder extends RecyclerView.ViewHolder {
        private TextView dateTextView;

        private DateViewHolder(View itemView) {
            super(itemView);
            this.dateTextView = itemView.findViewById(R.id.data);

        }

        private void setDateTextView(String dateTextView) {
            this.dateTextView.setText(dateTextView);
        }

        private void setTitleBG(Context context, boolean isBG) {
            TextPaint paint = this.dateTextView.getPaint();
            if (isBG) {
                this.dateTextView.setBackgroundColor(context.getResources().getColor(R.color.title_bg));
                this.dateTextView.setTextColor(context.getResources().getColor(R.color.content_bg));
                paint.setFakeBoldText(true);
            } else {
                this.dateTextView.setBackgroundColor(context.getResources().getColor(R.color.content_bg));
                this.dateTextView.setTextColor(context.getResources().getColor(R.color.content_text_bg));
                paint.setFakeBoldText(false);
            }
        }
    }
}
