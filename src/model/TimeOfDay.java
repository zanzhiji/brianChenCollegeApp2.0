package model;

import java.io.Serializable;
import java.time.LocalTime;

import java.time.LocalTime;

public enum TimeOfDay implements Serializable{
    EARLY_MORNING(LocalTime.of(7, 0), LocalTime.of(8, 40)), // 7:00 AM to 8:40 AM
    MORNING(LocalTime.of(9, 0), LocalTime.of(10, 40)),    // 9:00 AM to 10:40 AM
    MIDDAY(LocalTime.of(11, 0), LocalTime.of(12, 40)),    // 11:00 AM to 12:40 PM
    AFTERNOON(LocalTime.of(13, 0), LocalTime.of(14, 40)), // 1:00 PM to 2:40 PM
    LATE_AFTERNOON(LocalTime.of(15, 0), LocalTime.of(16, 40)), // 3:00 PM to 4:40 PM
    EVENING(LocalTime.of(17, 0), LocalTime.of(18, 40));  // 5:00 PM to 6:40 PM

    private final LocalTime startTime;
    private final LocalTime endTime;

    TimeOfDay(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    // Method to check if two time ranges conflict
    public static boolean conflict(TimeOfDay range1, TimeOfDay range2) {
        return !(range1.endTime.isBefore(range2.startTime) || range1.startTime.isAfter(range2.endTime));
    }
}
