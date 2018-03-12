package edu.knoldus;


import java.time.*;


public class Application {

    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();
        LocalDateTime time = LocalDateTime.now();
        Operation obj = new Operation();
        String dob = "1993-10-07";
        System.out.println("Birthday days");
        System.out.println(obj.getDayOfBirth(dob));
        System.out.println("Number of seconds Mahatma Gandhi lived");
        System.out.println(obj.getSeconds());
        System.out.println("Current time of the given Time Zone.");
        System.out.println(obj.getTimeOfZone("UTC"));
        System.out.println("All the leap years from 1900 till date.");
        System.out.println(obj.getLeapYear(todayDate,1900));
    }
}


