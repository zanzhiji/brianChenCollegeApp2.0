package model;

import java.io.Serializable;

public class ClassroomContainer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GenericBag<Classroom> classroomBag;
	
	public ClassroomContainer() {
		this.classroomBag = new GenericBag<>(Classroom.class, Settings.MAX_CLASSROOM_SIZE.getMaxSize());
	}
	
	
}