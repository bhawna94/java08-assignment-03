package edu.knoldus;


import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class DateApplication {

    public static void main(String[] args) {

        System.out.println(getDaysOfBirthday("1994-10-11"));
        System.out.println(getTimeZoneValue("America/New_York"));
        System.out.println(mahtmaGandhiLivedInSeconds());
        System.out.println(findingLeapYear());
    }

    /**
     * Returning The list of all days of my birthday.
     * @param myFirstBirthDate:.
     * @return List of Days
     */
    public static List<DayOfWeek> getDaysOfBirthday(String myFirstBirthDate) {
        List<DayOfWeek> days = new ArrayList<>();
        LocalDate firstDate = LocalDate.parse(myFirstBirthDate);
        while (firstDate.getYear() <= LocalDate.now().getYear()) {
            days.add(firstDate.getDayOfWeek());
            firstDate = firstDate.plusYears(1);
        }
        return days;
    }

    /**
     * Finding Time Zone Value.
     * @param timeZone
     * @return: Finding the zone time.
     */
    public static ZonedDateTime getTimeZoneValue(String timeZone) {
        return ZonedDateTime.now(ZoneId.of(timeZone));
    }

    /**
     * Finding the life of Mahatma Gandhi in second.
     * @return time in second.
     */
    public static Long mahtmaGandhiLivedInSeconds() {

        LocalDateTime birthDate = LocalDateTime.of(1869, 10, 2, 0, 0);
        LocalDateTime deathDate = LocalDateTime.of(1948, 1, 30, 0, 0);
        return ChronoUnit.SECONDS.between(birthDate, deathDate);
    }

    /**
     * Finding Leap Year.
     * @return list of leap year.
     */
    public static List<Integer> findingLeapYear() {


        LocalDate startingYear = LocalDate.parse("1991-01-01");
        List<Integer> lisOfLeapYears = new ArrayList<>();
        while (startingYear.getYear() <= LocalDate.now().getYear()) {
            if (startingYear.isLeapYear()) {
                lisOfLeapYears.add(startingYear.getYear());
            }
            startingYear = startingYear.plusYears(1);

        }
        return lisOfLeapYears;
    }
}
