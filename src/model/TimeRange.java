package model;

import java.io.Serializable;
import java.time.LocalTime;

public class TimeRange implements Serializable{
	private LocalTime startTime;
	private LocalTime endTime;	
	
	public TimeRange(LocalTime startTime) {
		this.startTime = startTime;
		this.endTime = startTime.plusMinutes(100);
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
}
