package com.automation.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayTimeUtilities {
    public static String getTodaysDate(String format){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy"));

    }
}
