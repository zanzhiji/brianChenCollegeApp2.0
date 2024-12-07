package model;

import java.io.Serializable;

public class Instructor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Section[] sectionsTaught;
	private double credits;
	private Name name;
	private String id;
	private Section[] prefSection;
	private DayOfWeek[] prefDOW;
	private TimeRange[] prefTime;

	
	
	//add other parameters later major/gender/contact info?/etc
	public Instructor(Name name) {
		this.name = name;
	}
}
