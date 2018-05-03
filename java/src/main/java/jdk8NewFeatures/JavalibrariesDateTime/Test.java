package jdk8NewFeatures.JavalibrariesDateTime;

import java.time.*;

public class Test {
    public static void main(String[] args) {
        final Clock clock = Clock.systemUTC();
        System.out.println("zone: "+clock.getZone());
        System.out.println("instant: "+clock.instant());
        System.out.println("millis: "+clock.millis());

        final LocalDate date = LocalDate.now();
        System.out.println("date: "+date);
        final LocalDate dateFromClock = LocalDate.now(clock);
        System.out.println("date from clock: "+dateFromClock);

        final LocalTime time = LocalTime.now();
        System.out.println("time: "+time);
        final LocalTime timeFromClock = LocalTime.now(clock);
        System.out.println("time from clock: "+timeFromClock);

        final LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime: "+dateTime);

        final ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: "+zonedDateTime);

        final LocalDateTime from = LocalDateTime.of(2018, Month.MARCH, 29, 12, 0);
        final LocalDateTime to = LocalDateTime.of(2018, Month.APRIL, 3, 12, 0);
        final Duration duration = Duration.between(from, to);
        System.out.println("Duration in days: " + duration.toDays());
        System.out.println("Duration in hours: " + duration.toHours());
    }
}
