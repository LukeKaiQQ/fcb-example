package tw.com.fcb.example;

public enum Currency {
//    USD, GBP, HKD, JPY, EUR, ZAR

//    USD("01"), GBP("02"), HKD("03"), JPY("11"), EUR("21");
//
//    private  String currencyName;
//    private String currencyCode;
//
//    Currency(String currencyCode) {
//        this.currencyCode = currencyCode;
//    }
//
//    public String getCurrencyCode() {
//        return currencyCode;
//    }

    USD("01", "美元"),
    GBP("02", "英鎊"),
    HKD("03", "港幣"),
    JPY("11", "日幣"),
    EUR("21", "EUR");

    private String currencyName;
    private String currencyCode;

    Currency(String currencyCode, String currencyName) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }
}
