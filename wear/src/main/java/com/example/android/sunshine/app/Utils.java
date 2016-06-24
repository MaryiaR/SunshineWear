package com.example.android.sunshine.app;

import java.text.SimpleDateFormat;

/**
 * Created by mrasulava on 6/24/2016.
 */
public class Utils {

    private static SimpleDateFormat shortenedDateFormat = new SimpleDateFormat("EEE, MMM dd yyyy");

    public static String getShortDayString(long dateInMillis) {
        return shortenedDateFormat.format(dateInMillis);
    }
}
