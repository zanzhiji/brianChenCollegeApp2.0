package model;

import java.io.Serializable;

public enum DayOfWeek implements Serializable{
	SUNDAY("SUN"), 
	MONDAY("MON"), 
	TUESDAY("TUE"), 
	WEDNESDAY("WED"), 
	THURSDAY("THU"), 
	FRIDAY("FRI"), 
	SATURDAY("SAT");
	
	private String day;
	
	DayOfWeek(String day) {
		this.day = day;
	}
	
	public String getAbbr() {
		return day;
	}
}