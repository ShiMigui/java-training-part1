package util;

public final class Formatter {
    public final static String currency(Double amount, String Symbol) {
        return Symbol + String.format("%.2f", amount);
    }

    public final static String currency(Double amount) {
        return currency(amount, "$");
    }

    public static Object percentage(Double tax) {
        return "%" + tax * 100;
    }
}
