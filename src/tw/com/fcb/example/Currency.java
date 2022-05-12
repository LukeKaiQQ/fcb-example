package tw.com.fcb.example;

public enum Currency {
//    USD, GBP, HKD, JPY, EUR,


    USD("01"), GBP("02"), HKD("03"), JPY("11"), EUR("21");

    private String currencyCode;

    Currency(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}
