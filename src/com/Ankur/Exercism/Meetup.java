package com.Ankur.Exercism;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Meetup {
    private final int month;
    private final int year;

    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public LocalDate day(DayOfWeek d, MeetupSchedule m) {
        LocalDate meetup = LocalDate.of(year, month, 1);
        while (!d.equals(meetup.getDayOfWeek())) {
            meetup = meetup.plusDays(1);
        }
        switch (m) {
            case FIRST:
                return meetup;
            case SECOND:
                return meetup.plusWeeks(1);
            case THIRD:
                return meetup.plusWeeks(2);
            case FOURTH:
                return meetup.plusWeeks(3);
            case LAST:
                if (meetup.plusWeeks(4).getMonthValue() != month) {
                    return meetup.plusWeeks(3);
                }
                return meetup.plusWeeks(4);
            case TEENTH:
                LocalDate teenth = meetup.plusWeeks(1);
                if (teenth.getDayOfMonth() > 12 && teenth.getDayOfMonth() < 20) {
                    return teenth;
                }
                return teenth.plusWeeks(1);
            default:
                return null;
        }
    }
}

enum MeetupSchedule {
    FIRST,
    SECOND,
    THIRD,
    FOURTH,
    LAST,
    TEENTH
}
