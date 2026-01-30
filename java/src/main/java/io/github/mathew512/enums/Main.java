package io.github.mathew512.enums;

public class Main {

    public static void main(String[] args) {
        // days of a week

        System.out.println(Days.MONDAY);
        System.out.println(Days.SATURDAY);

        Days day= Days.MONDAY;

            switch (day) {
                case MONDAY:
                    
                    break;
            
                default:
                    break;
            }
        System.out.println(matches("Saturday", "Saturday"));
    }

    public static boolean matches(String day, String anotherDay){
        return day.equals(anotherDay);
    }
    
}
