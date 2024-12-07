package model;

import java.io.Serializable;

public class SectionContainer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GenericBag<Section> secCon; 
	
	public SectionContainer() {
		this.secCon = new GenericBag<Section>(Section.class, Settings.MAX_SECTION_SIZE.getMaxSize());
	}
	
	public void add(Section sec) {
		String secCrn = sec.getCrn();
		
		if (secCon.search(Section.class, s -> s.getCrn().equals(secCrn)).length == 0) {
			secCon.add(sec);
			System.out.println("Added " + secCrn + " (" + sec.getCourse().getCouTitle() + ")");
		} else {
			System.out.println("Already exists");
		}
	}
	
	public void remove(String crn) {
		if (secCon.search(Section.class, s -> s.getCrn().equals(crn)).length != 0) {
			secCon.removeCopy(Section.class, s -> (s.getCrn().equals(crn)));
			System.out.println("Removed " + crn);
		} else {
			System.out.println("Section does not exist");
		}
	}
	
	public Section getCou(String crn) {
		Section[] check = secCon.search(Section.class, s -> s.getCrn().equals(crn));
		if (check.length == 1) {
			return check[0];
		}
		System.out.println("Section not found");
		return null;
	}

	public void display() {
		secCon.display();
	}
}
