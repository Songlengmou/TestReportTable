package com.example.testreporttable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.kelin.scrollablepanel.library.ScrollablePanel;

/**
 * @author admin
 * <p>
 * 上下滑动，上面固定
 * 左右滑动，左面固定
 */
public class MainActivity extends AppCompatActivity {
    private ScrollablePanel smartTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartTable = findViewById(R.id.table);

        InOutStockReportData();
    }

    private void InOutStockReportData() {
        String result = "{\"In\":[{\"DateMonth\":1,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":2,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":3,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":4,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":5,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":6,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":7,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":8,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":9,\"QSum\":45000,\"DateYear\":2018},{\"DateMonth\":10,\"QSum\":12000,\"DateYear\":2018},{\"DateMonth\":11,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":12,\"QSum\":12000,\"DateYear\":2018},{\"DateMonth\":1,\"QSum\":24000,\"DateYear\":2019},{\"DateMonth\":2,\"QSum\":94794,\"DateYear\":2019},{\"DateMonth\":3,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":4,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":5,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":6,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":7,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":8,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":9,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":10,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":11,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":12,\"QSum\":0,\"DateYear\":2019}],\"Out\":[{\"DateMonth\":1,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":2,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":3,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":4,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":5,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":6,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":7,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":8,\"QSum\":0,\"DateYear\":2018},{\"DateMonth\":9,\"QSum\":27600,\"DateYear\":2018},{\"DateMonth\":10,\"QSum\":15600,\"DateYear\":2018},{\"DateMonth\":11,\"QSum\":11400,\"DateYear\":2018},{\"DateMonth\":12,\"QSum\":10200,\"DateYear\":2018},{\"DateMonth\":1,\"QSum\":15600,\"DateYear\":2019},{\"DateMonth\":2,\"QSum\":50394,\"DateYear\":2019},{\"DateMonth\":3,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":4,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":5,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":6,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":7,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":8,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":9,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":10,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":11,\"QSum\":0,\"DateYear\":2019},{\"DateMonth\":12,\"QSum\":0,\"DateYear\":2019}],\"Stock\":[{\"stock\":0,\"DateYear\":2018,\"DateMonth\":1},{\"stock\":0,\"DateYear\":2018,\"DateMonth\":2},{\"stock\":0,\"DateYear\":2018,\"DateMonth\":3},{\"stock\":0,\"DateYear\":2018,\"DateMonth\":4},{\"stock\":0,\"DateYear\":2018,\"DateMonth\":5},{\"stock\":0,\"DateYear\":2018,\"DateMonth\":6},{\"stock\":0,\"DateYear\":2018,\"DateMonth\":7},{\"stock\":0,\"DateYear\":2018,\"DateMonth\":8},{\"stock\":17400,\"DateYear\":2018,\"DateMonth\":9},{\"stock\":13800,\"DateYear\":2018,\"DateMonth\":10},{\"stock\":2400,\"DateYear\":2018,\"DateMonth\":11},{\"stock\":4200,\"DateYear\":2018,\"DateMonth\":12},{\"stock\":12600,\"DateYear\":2019,\"DateMonth\":1},{\"stock\":57000,\"DateYear\":2019,\"DateMonth\":2},{\"stock\":57000,\"DateYear\":2019,\"DateMonth\":3},{\"stock\":57000,\"DateYear\":2019,\"DateMonth\":4},{\"stock\":57000,\"DateYear\":2019,\"DateMonth\":5},{\"stock\":57000,\"DateYear\":2019,\"DateMonth\":6},{\"stock\":57000,\"DateYear\":2019,\"DateMonth\":7},{\"stock\":57000,\"DateYear\":2019,\"DateMonth\":8},{\"stock\":57000,\"DateYear\":2019,\"DateMonth\":9},{\"stock\":57000,\"DateYear\":2019,\"DateMonth\":10},{\"stock\":57000,\"DateYear\":2019,\"DateMonth\":11},{\"stock\":57000,\"DateYear\":2019,\"DateMonth\":12}]}";

        InOutStockReportBean bean = new Gson().fromJson(result, InOutStockReportBean.class);

        InOutStockReportAdapter adapter = new InOutStockReportAdapter(this, bean);

        smartTable.setPanelAdapter(adapter);
    }
}
