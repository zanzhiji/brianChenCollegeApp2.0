package model;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataCenter implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ClassroomContainer claCon;
	private CourseContainer couCon;
	private SectionContainer secCon;
	private TextbookContainer texCon;
	private InstructorContainer inCon;

	private static DataCenter instance = null; 
	
	private DataCenter() {
		claCon = new ClassroomContainer();
		couCon = new CourseContainer();
		secCon = new SectionContainer();
		texCon = new TextbookContainer(3);
		inCon = new InstructorContainer();
	}
	
	public static DataCenter getInstance() {
		if(instance == null) {
			instance = loadData();
			if(instance == null) {
				instance = new DataCenter();
			}
		}
		
		return instance;
	}
	
	private static DataCenter loadData() {
		
		try(ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(new File("data.dat")))){
			DataCenter.instance = (DataCenter) ois.readObject();
		} catch (Exception e){
			e.printStackTrace();
		};
		
		return instance;
	}
	
	public boolean saveData() {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("data.dat")))){
			oos.writeObject(instance);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	public ClassroomContainer getClaCon() {
		return claCon;
	}

	public void setClaCon(ClassroomContainer claCon) {
		this.claCon = claCon;
	}

	public CourseContainer getCouCon() {
		return couCon;
	}

	public void setCouCon(CourseContainer couCon) {
		this.couCon = couCon;
	}

	public SectionContainer getSecCon() {
		return secCon;
	}

	public void setSecCon(SectionContainer secCon) {
		this.secCon = secCon;
	}

	public TextbookContainer getTexCon() {
		return texCon;
	}

	public void setTexCon(TextbookContainer texCon) {
		this.texCon = texCon;
	}
	
	public InstructorContainer getInCon() {
		return inCon;
	}
	
}
