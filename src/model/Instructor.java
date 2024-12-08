package model;

import java.io.Serializable;

public class Instructor implements Serializable, Comparable<Instructor>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Section[] sections;
	private DateOfEmployment hireDate;
	private Name name;
	private String id;
	private Section[] prefSection;
	private DayOfWeek[] prefDOW;
	private TimeOfDay[] prefTime;
	private double prefCredits;
	private double curCredits;

	
	
	//add other parameters later major/gender/contact info?/etc
	public Instructor(Name name) {
		this.name = name;
	}


	public DateOfEmployment getHireDate() {
		return hireDate;
	}
	@Override
	public int compareTo(Instructor o) {
		// TODO Auto-generated method stub
		// negative number means more senior
		return this.hireDate.compareTo(o.hireDate);
	}
}
