package io.github.mathew512.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Demonstrating legacy Date/Calendar API
        oldDateSystem();

        // Demonstrating modern Java Time API
        newDateSystem();


    }

    /**
     * Demonstrates the old Java date/time system using Date, Calendar, and SimpleDateFormat.
     */
    private static void oldDateSystem() {
        // Create a Date object representing the current moment
        Date todayDate = new Date();
        System.out.println("Date (old API): " + todayDate);

        // Use Calendar to manipulate dates (e.g., add months)
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 3); // Add 3 months to current date
        System.out.println("3 months later (old API): " + calendar.getTime());

        // Format the Date into a readable string
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted today (old API): " + sdf.format(todayDate));
    }

    /**
     * Demonstrates the modern Java Time API using LocalDate, LocalTime, LocalDateTime, and ChronoUnit.
     */
    private static void newDateSystem() {

        System.out.println("========NEW DATE SYSTEM========");
        // LocalDate represents a date without time
        LocalDate date = LocalDate.now();
        System.out.println("Date (new API): " + date);

        // LocalDateTime represents both date and time
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("DateTime (new API): " + dt);

        // Add 1 hour to the current LocalDateTime
        dt = dt.plusHours(1);
        System.out.println("DateTime after adding 1 hour: " + dt);

        // LocalTime represents only the time (no date)
        LocalTime time = LocalTime.now();
        System.out.println("Time (new API): " + time);

        // Add 10 days using ChronoUnit
        dt = dt.plus(10, ChronoUnit.DAYS);
        System.out.println("DateTime after adding 10 days: " + dt);

        // Create a specific date (e.g., 23rd February 2026)
        LocalDate specificDate = LocalDate.of(2026, Month.FEBRUARY, 23);
        System.out.println("Specific date: " + specificDate);

        // Calculate next week’s date
        LocalDate nextWeek = date.plusWeeks(1);
        System.out.println("Next week: " + nextWeek);

        // Calculate difference between two dates
        long daysBetween = ChronoUnit.DAYS.between(date, nextWeek);
        System.out.println("Days between today and next week: " + daysBetween);
    }
}
