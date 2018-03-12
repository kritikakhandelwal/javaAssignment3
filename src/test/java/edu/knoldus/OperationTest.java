package edu.knoldus;

import org.junit.Test;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OperationTest {

        Operation obj = new Operation();


    @Test
    public void getDayOfBirthTest() {
        String birthDate = "2017-03-11";
        List<DayOfWeek> yearList = obj.getDayOfBirth(birthDate);
        List<DayOfWeek> expectedOutput = new ArrayList();
        expectedOutput.add(DayOfWeek.SATURDAY);
        expectedOutput.add(DayOfWeek.SUNDAY);
        assertEquals(expectedOutput, yearList);
    }

    @Test
    public void getTimeOfZoneTest() {
        LocalDateTime localtDateAndTime = LocalDateTime.now();
        ZonedDateTime actualOutput = obj.getTimeOfZone("UTC");
        ZonedDateTime expectedOutput = ZonedDateTime.of(localtDateAndTime, ZoneId.of("UTC"));
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void getLeapYearTest() {
        LocalDate todayDate = LocalDate.now();
        List<Integer> actualOutput = obj.getLeapYear(todayDate,2016);
        List<Integer> expectedOutput = new ArrayList<Integer>();
        expectedOutput.add(2016);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void getSecondsTest() {
        LocalDateTime dob = LocalDateTime.of(2016, 03, 10, 0, 0, 0);
        LocalDateTime dod = LocalDateTime.of(2018, 03, 10, 0, 0, 0);
        Long expectedOutput = Duration.ofDays(1).getSeconds() * 365 * 2;
        Duration duration = Duration.between(dob, dod);
        Long actualOutput = duration.getSeconds();


        assertEquals(expectedOutput, actualOutput);
    }
}
