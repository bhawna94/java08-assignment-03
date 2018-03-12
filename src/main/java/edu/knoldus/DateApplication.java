package edu.knoldus;


import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class DateApplication {

    public static void main(String args[]) {

        System.out.println(getDaysOfBirthday("1994-10-11"));
        System.out.println(getTimeZonevalue("America/New_York"));
        System.out.println(mahtmaGandhiLivedInSeconds());
        System.out.println(findingLeapYear());
    }

    /**
     * Returning The list of all days of my birthday
     *
     * @param myFirstBirthdate
     * @return
     */
    public static List<DayOfWeek> getDaysOfBirthday(String myFirstBirthdate) {
        List<DayOfWeek> days = new ArrayList<>();
        LocalDate firstDate = LocalDate.parse(myFirstBirthdate);
        while (firstDate.getYear() < LocalDate.now().getYear()) {
            days.add(firstDate.getDayOfWeek());
            firstDate = firstDate.plusYears(1);
        }
        return days;
    }

    /**
     * Finding Time Zone Value
     *
     * @param timeZone
     * @return
     */
    public static ZonedDateTime getTimeZonevalue(String timeZone) {
        return ZonedDateTime.now(ZoneId.of(timeZone));
    }

    public static Long mahtmaGandhiLivedInSeconds() {

        LocalDateTime birthdate = LocalDateTime.of(1869, 10, 2, 0, 0);
        LocalDateTime deathdate = LocalDateTime.of(1948, 1, 30, 0, 0);
        return ChronoUnit.SECONDS.between(birthdate, deathdate);
    }

    public static List<Integer> findingLeapYear() {


        LocalDate startingyear = LocalDate.parse("1991-01-01");
        List<Integer> lisOfLeapYears = new ArrayList<>();
        while (startingyear.getYear() <= LocalDate.now().getYear()) {
            if (startingyear.isLeapYear()) {
                lisOfLeapYears.add(startingyear.getYear());
            }
            startingyear = startingyear.plusYears(1);

        }
        return lisOfLeapYears;
    }
}
