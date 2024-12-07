package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Course implements Comparable<Course>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String couTitle;
	private String couID;
	private int couCode;
	private String couDsc;
	private double couCredits;
	private Major maj;
	private ArrayList<Major> reqMaj;
	private ArrayList<Section> sections;

	public Course(String couTitle, String couDsc, int couCode, double couCredits, Major maj) {
		this.couTitle = couTitle;
		this.couCode = couCode;
		this.couDsc = couDsc;
		this.couCredits = couCredits;
		this.maj = maj;
		this.couID = idGen();
		reqMaj = new ArrayList<>();
		sections = new ArrayList<>();
		addReqMaj(maj);
	}
	
	//Random course id
//	public Course(String couTitle, String couDsc, double couCredits, Major maj) {
//		this.couTitle = couTitle;
//		this.couCode = 100 + (int) (Math.random() * 900);
//		this.couDsc = couDsc;
//		this.couCredits = couCredits;
//		this.maj = maj;
//		this.couID = idGen();
//		reqMaj = new ArrayList<>();
//		addReqMaj(maj);
//
//	}

	public String getCouTitle() {
		return couTitle;
	}

	public void setCouTitle(String couTitle) {
		this.couTitle = couTitle;
	}

	public String getCouID() {
		return couID;
	}

	public void setCouID(String couID) {
		this.couID = couID;
	}

	public String getCouDsc() {
		return couDsc;
	}

	public void setCouDsc(String couDsc) {
		this.couDsc = couDsc;
	}

	public double getCouCredits() {
		return couCredits;
	}

	public void setCouCredits(double couCredits) {
		this.couCredits = couCredits;
	}

	public ArrayList<Major> getReqMaj() {
		return reqMaj;
	}

	public void addReqMaj(Major maj) {
		if (reqMaj == null || !reqMaj.contains(maj)) {
			reqMaj.add(maj);
		}
	}

	public ArrayList<Section> getSections() {
		return sections;
	}

	public void addSections(Section sec) {
		if (!sections.contains(sec)) {
			sections.add(sec);
		}
	}

	public String idGen() {
		return maj.getAbbreviation() + couCode;
	}

	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Course [couTitle=" + couTitle + ", couID=" + couID + ", couCode=" + couCode + ", couDsc=" + couDsc
				+ ", couCredits=" + couCredits + ", maj=" + maj + ", reqMaj=" + reqMaj + ", sections=" + sections + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(couCode, couCredits, couDsc, couID, couTitle, maj, reqMaj, sections);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Course))
			return false;
		Course other = (Course) obj;
		return couCode == other.couCode
				&& Double.doubleToLongBits(couCredits) == Double.doubleToLongBits(other.couCredits)
				&& Objects.equals(couDsc, other.couDsc) && Objects.equals(couTitle, other.couTitle) && maj == other.maj
				&& Objects.equals(reqMaj, other.reqMaj) && Objects.equals(sections, other.sections);
	}

}
