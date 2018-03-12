package edu.knoldus;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Operation {

    /**
     * @param birthDate - my date of birth.
     * @return birthday days.
     */
    public List<DayOfWeek> getDayOfBirth(String birthDate) {
        LocalDate birthDay = LocalDate.parse(birthDate);
        LocalDate today = LocalDate.now();
        List<DayOfWeek> listOfDay = new ArrayList<DayOfWeek>();
        LocalDate nextYear = birthDay;
        Integer year = today.getYear() + 1;
        while (!year.equals(nextYear.getYear())) {
            listOfDay.add(nextYear.getDayOfWeek());
            birthDay = birthDay.plusYears(1);
            nextYear = nextYear.plusYears(1);
        }
        return listOfDay;
    }

    /**
     * @param zoneId - ZONE id.
     * @return time of particular time zone.
     */
    public ZonedDateTime getTimeOfZone(String zoneId) {
        ZonedDateTime timestampAtZone = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of(zoneId));
        return timestampAtZone;
    }

    /**
     * @return seconds Mahatma Gandhi lived.
     */
    public Long getSeconds() {
        LocalDateTime dob = LocalDateTime.of(1869, Month.OCTOBER, 02, 0, 0, 0);
        LocalDateTime dod = LocalDateTime.of(1948, Month.JANUARY, 30, 0, 0, 0);
        //count seconds between dates
        Duration duration = Duration.between(dob, dod);
        Long seconds = duration.getSeconds();
        return seconds;
    }

    /**
     * @param today Date.
     * @return leap years till current year
     */
    public List<Integer> getLeapYear(LocalDate today, int startYear) {
        List<Integer> yearList = new ArrayList<>();

        int year = today.getYear();
        for (int i = startYear; i < year; i++) {
            if (i % 4 == 0) {
                if (i % 100 == 0) {
                    if (i % 400 == 0) {
                        yearList.add(i);
                    }

                } else {
                    yearList.add(i);
                }

            }
        }
        return yearList;
    }
}
