package model;

import java.io.Serializable;
import java.util.function.Predicate;

public class CourseContainer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GenericBag<Course> couCon;

	public CourseContainer() {
		couCon = new GenericBag<>(Course.class, Settings.MAX_COURSE_SIZE.getMaxSize());
	}

	public void add(Course cou) {
		String couTitle = cou.getCouTitle();
		
		if (couCon.search(Course.class, c -> c.getCouTitle().equals(couTitle)).length == 0) {
			couCon.add(cou);
			System.out.println("Added " + cou.getCouID() + " (" + couTitle + ")");
		} else {
			System.out.println("Already exists");
		}
	}

	public void remove(String couID) {
		if (couCon.search(Course.class, c -> c.getCouID().equals(couID)).length != 0) {
			couCon.removeCopy(Course.class, c -> (c.getCouID().equals(couID)));
			System.out.println("Removed " + couID);
		} else {
			System.out.println("Course does not exist");
		}

	}

	public Course getCou(String couID) {
		Course[] check = couCon.search(Course.class, c -> c.getCouID().equals(couID));
		if (check.length == 1) {
			return check[0];
		}
		System.out.println("Course not found");
		return null;
	}

	public void display() {
		couCon.display();
	}
}
