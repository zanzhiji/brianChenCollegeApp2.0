package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Section implements Comparable<Section>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String crn;
	private Course course;
	private ArrayList<DayOfWeek> classDays;
	private Instructor inst;
	private String courseNum;
	private TimeOfDay range;
	private Student[] students;
	private Textbook[] books;
	private Classroom room;

	public Section(String crn, Course course, ArrayList<DayOfWeek> classDays, Instructor inst, TimeOfDay range, Textbook[] books, Classroom room) {
		this.crn = crn;
		this.course = course;
		this.classDays = classDays;
		this.range = range;
		this.books = books;
		this.room = room;
		this.courseNum = course.getCouID();
	}

//	public Section(Course course, ArrayList<DayOfWeek> classDays, Instructor inst, TimeRange range, Textbook[] books, Classroom room) {
//		this.crn = Integer.toString((int) (Math.random() * 90000) + 10000);
//		this.course = course;
//		this.classDays = classDays;
//		this.range = range;
//		this.books = books;
//		this.room = room;
//		this.courseNum = course.getCouID();
//	}

	@Override
	public int compareTo(Section o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public ArrayList<DayOfWeek> getClassDays() {
		return classDays;
	}

	public void setClassDays(ArrayList<DayOfWeek> classDays) {
		this.classDays = classDays;
	}

	public Instructor getInst() {
		return inst;
	}

	public void setInst(Instructor inst) {
		this.inst = inst;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public TimeOfDay getRange() {
		return range;
	}

	public void setRange(TimeOfDay range) {
		this.range = range;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Textbook[] getBooks() {
		return books;
	}

	public void setBooks(Textbook[] books) {
		this.books = books;
	}

	public Classroom getRoom() {
		return room;
	}

	public void setRoom(Classroom room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Section [crn=" + crn + ", course=" + course.getCouTitle() + ", classDays=" + classDays + ", inst=" + inst
				+ ", courseNum=" + courseNum + ", range=" + range + ", students=" + Arrays.toString(students)
				+ ", books=" + Arrays.toString(books) + ", room=" + room + "]";
	}


}
