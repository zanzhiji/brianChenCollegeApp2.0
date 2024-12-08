package model;

import java.io.Serializable;

public class Instructor implements Serializable, Comparable<Instructor>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Section[] sectionsTaught;
	private DateOfEmployment hireDate;
	private double credits;
	private Name name;
	private String id;
	private Section[] prefSection;
	private DayOfWeek[] prefDOW;
	private TimeRange[] prefTime;
	private double prefCredits;
	private double curCredits;

	
	
	//add other parameters later major/gender/contact info?/etc
	public Instructor(Name name) {
		this.name = name;
	}



	@Override
	public int compareTo(Instructor o) {
		// TODO Auto-generated method stub
		// negative number means more senior
		return this.hireDate.compareTo(o.hireDate);
	}
}
