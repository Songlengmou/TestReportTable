package com.example.testreporttable;

import java.util.List;

/**
 * @author : Song
 * date   : 2019/5/30 003009:49
 * desc   :
 */


/**
 * {"In":[{"DateMonth":1,"QSum":0,"DateYear":2018},{"DateMonth":2,"QSum":0,"DateYear":2018},{"DateMonth":3,"QSum":0,"DateYear":2018},{"DateMonth":4,"QSum":0,"DateYear":2018},{"DateMonth":5,"QSum":0,"DateYear":2018},{"DateMonth":6,"QSum":0,"DateYear":2018},{"DateMonth":7,"QSum":0,"DateYear":2018},{"DateMonth":8,"QSum":0,"DateYear":2018},{"DateMonth":9,"QSum":45000,"DateYear":2018},{"DateMonth":10,"QSum":12000,"DateYear":2018},{"DateMonth":11,"QSum":0,"DateYear":2018},{"DateMonth":12,"QSum":12000,"DateYear":2018},{"DateMonth":1,"QSum":24000,"DateYear":2019},{"DateMonth":2,"QSum":94794,"DateYear":2019},{"DateMonth":3,"QSum":0,"DateYear":2019},{"DateMonth":4,"QSum":0,"DateYear":2019},{"DateMonth":5,"QSum":0,"DateYear":2019},{"DateMonth":6,"QSum":0,"DateYear":2019},{"DateMonth":7,"QSum":0,"DateYear":2019},{"DateMonth":8,"QSum":0,"DateYear":2019},{"DateMonth":9,"QSum":0,"DateYear":2019},{"DateMonth":10,"QSum":0,"DateYear":2019},{"DateMonth":11,"QSum":0,"DateYear":2019},{"DateMonth":12,"QSum":0,"DateYear":2019}],"Out":[{"DateMonth":1,"QSum":0,"DateYear":2018},{"DateMonth":2,"QSum":0,"DateYear":2018},{"DateMonth":3,"QSum":0,"DateYear":2018},{"DateMonth":4,"QSum":0,"DateYear":2018},{"DateMonth":5,"QSum":0,"DateYear":2018},{"DateMonth":6,"QSum":0,"DateYear":2018},{"DateMonth":7,"QSum":0,"DateYear":2018},{"DateMonth":8,"QSum":0,"DateYear":2018},{"DateMonth":9,"QSum":27600,"DateYear":2018},{"DateMonth":10,"QSum":15600,"DateYear":2018},{"DateMonth":11,"QSum":11400,"DateYear":2018},{"DateMonth":12,"QSum":10200,"DateYear":2018},{"DateMonth":1,"QSum":15600,"DateYear":2019},{"DateMonth":2,"QSum":50394,"DateYear":2019},{"DateMonth":3,"QSum":0,"DateYear":2019},{"DateMonth":4,"QSum":0,"DateYear":2019},{"DateMonth":5,"QSum":0,"DateYear":2019},{"DateMonth":6,"QSum":0,"DateYear":2019},{"DateMonth":7,"QSum":0,"DateYear":2019},{"DateMonth":8,"QSum":0,"DateYear":2019},{"DateMonth":9,"QSum":0,"DateYear":2019},{"DateMonth":10,"QSum":0,"DateYear":2019},{"DateMonth":11,"QSum":0,"DateYear":2019},{"DateMonth":12,"QSum":0,"DateYear":2019}],"Stock":[{"stock":0,"DateYear":2018,"DateMonth":1},{"stock":0,"DateYear":2018,"DateMonth":2},{"stock":0,"DateYear":2018,"DateMonth":3},{"stock":0,"DateYear":2018,"DateMonth":4},{"stock":0,"DateYear":2018,"DateMonth":5},{"stock":0,"DateYear":2018,"DateMonth":6},{"stock":0,"DateYear":2018,"DateMonth":7},{"stock":0,"DateYear":2018,"DateMonth":8},{"stock":17400,"DateYear":2018,"DateMonth":9},{"stock":13800,"DateYear":2018,"DateMonth":10},{"stock":2400,"DateYear":2018,"DateMonth":11},{"stock":4200,"DateYear":2018,"DateMonth":12},{"stock":12600,"DateYear":2019,"DateMonth":1},{"stock":57000,"DateYear":2019,"DateMonth":2},{"stock":57000,"DateYear":2019,"DateMonth":3},{"stock":57000,"DateYear":2019,"DateMonth":4},{"stock":57000,"DateYear":2019,"DateMonth":5},{"stock":57000,"DateYear":2019,"DateMonth":6},{"stock":57000,"DateYear":2019,"DateMonth":7},{"stock":57000,"DateYear":2019,"DateMonth":8},{"stock":57000,"DateYear":2019,"DateMonth":9},{"stock":57000,"DateYear":2019,"DateMonth":10},{"stock":57000,"DateYear":2019,"DateMonth":11},{"stock":57000,"DateYear":2019,"DateMonth":12}]}
 */

public class InOutStockReportBean {
    private List<InBean> In;
    private List<OutBean> Out;
    private List<StockBean> Stock;

    public List<InBean> getIn() {
        return In;
    }

    public void setIn(List<InBean> In) {
        this.In = In;
    }

    public List<OutBean> getOut() {
        return Out;
    }

    public void setOut(List<OutBean> Out) {
        this.Out = Out;
    }

    public List<StockBean> getStock() {
        return Stock;
    }

    public void setStock(List<StockBean> Stock) {
        this.Stock = Stock;
    }

    public static class InBean {
        /**
         * DateMonth : 1
         * QSum : 0
         * DateYear : 2018
         */

        private int DateMonth;
        private int QSum;
        private int DateYear;

        public int getDateMonth() {
            return DateMonth;
        }

        public void setDateMonth(int DateMonth) {
            this.DateMonth = DateMonth;
        }

        public int getQSum() {
            return QSum;
        }

        public void setQSum(int QSum) {
            this.QSum = QSum;
        }

        public int getDateYear() {
            return DateYear;
        }

        public void setDateYear(int DateYear) {
            this.DateYear = DateYear;
        }
    }

    public static class OutBean {
        /**
         * DateMonth : 1
         * QSum : 0
         * DateYear : 2018
         */

        private int DateMonth;
        private int QSum;
        private int DateYear;

        public int getDateMonth() {
            return DateMonth;
        }

        public void setDateMonth(int DateMonth) {
            this.DateMonth = DateMonth;
        }

        public int getQSum() {
            return QSum;
        }

        public void setQSum(int QSum) {
            this.QSum = QSum;
        }

        public int getDateYear() {
            return DateYear;
        }

        public void setDateYear(int DateYear) {
            this.DateYear = DateYear;
        }
    }

    public static class StockBean {
        /**
         * stock : 0
         * DateYear : 2018
         * DateMonth : 1
         */

        private int stock;
        private int DateYear;
        private int DateMonth;

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public int getDateYear() {
            return DateYear;
        }

        public void setDateYear(int DateYear) {
            this.DateYear = DateYear;
        }

        public int getDateMonth() {
            return DateMonth;
        }

        public void setDateMonth(int DateMonth) {
            this.DateMonth = DateMonth;
        }
    }
}
