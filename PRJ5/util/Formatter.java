package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatter {
    public static final String patternDate = "dd/MM/yyyy";

    public static final String currency(Double price){
        return String.format("$%.2f", price);
    }

    public static final String fromDate(LocalDate date, String pattern){
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static final String fromDate(LocalDate date){
        return fromDate(date, patternDate);
    }

    public static final LocalDate toDate(String date, String pattern){
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
    }

    public static final LocalDate toDate(String date){
        return toDate(date, patternDate);
    }
}
