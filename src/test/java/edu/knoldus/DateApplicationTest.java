package edu.knoldus;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import static java.time.DayOfWeek.*;
import static junit.framework.TestCase.assertEquals;

public class DateApplicationTest {

    String mybirthday = "1994-10-11";
    String zone = "America/New_York";
    List<DayOfWeek> expecteddays = Arrays.asList(TUESDAY, WEDNESDAY, FRIDAY, SATURDAY, SUNDAY, MONDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, SATURDAY, SUNDAY, MONDAY, TUESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, TUESDAY, WEDNESDAY);
    Long expectedlife = 2471731200L;
    List<Integer> expectedlist = Arrays.asList(1992, 1996, 2000, 2004, 2008, 2012, 2016);
    ZonedDateTime expectedtime = ZonedDateTime.now(ZoneId.of("America/New_York"));

    @Test
    public final void Test() {

        List<DayOfWeek> actualdays = DateApplication.getDaysOfBirthday(mybirthday);
        List<Integer> actuallist = DateApplication.findingLeapYear();
        Long actuallife = DateApplication.mahtmaGandhiLivedInSeconds();
        ZonedDateTime actualtime = DateApplication.getTimeZonevalue(zone);
        assertEquals("It should return list of days", expecteddays, actualdays);
        assertEquals("It should return List of Leapyear", expectedlist, actuallist);
        assertEquals("It should return the life of Mahtma Gandhi in second", expectedlife, actuallife);
        assertEquals("It should return the time", expectedtime, actualtime);
    }

}
