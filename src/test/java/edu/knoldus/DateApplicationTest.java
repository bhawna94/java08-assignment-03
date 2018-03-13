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

    String myBirthDay = "1994-10-11";
    //String zone = "America/New_York";
    List<DayOfWeek> expectedDays = Arrays.asList(TUESDAY, WEDNESDAY, FRIDAY, SATURDAY, SUNDAY, MONDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, SATURDAY, SUNDAY, MONDAY, TUESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, TUESDAY, WEDNESDAY);
    Long expectedLife = 2471731200L;
    List<Integer> expectedList = Arrays.asList(1992, 1996, 2000, 2004, 2008, 2012, 2016);
    //ZonedDateTime expectedtime = ZonedDateTime.now(ZoneId.of("America/New_York"));

    @Test
    public final void Test() {

        List<DayOfWeek> actualDays = DateApplication.getDaysOfBirthday(myBirthDay);
        List<Integer> actualList = DateApplication.findingLeapYear();
        Long actuallife = DateApplication.mahtmaGandhiLivedInSeconds();
       // ZonedDateTime actualtime = DateApplication.getTimeZoneValue(zone);
        assertEquals("It should return list of days", expectedDays, actualDays);
        assertEquals("It should return List of Leapyear", expectedList, actualList);
        assertEquals("It should return the life of Mahtma Gandhi in second", expectedLife, actuallife);
        //assertEquals("It should return the time", expectedtime, actualtime);
    }

}
