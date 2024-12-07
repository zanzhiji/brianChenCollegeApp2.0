package model;

public class Classroom implements Comparable<Classroom>{
	private String room;
	private String building;
	private int capacity;
	private boolean hasProjector;
	
	public Classroom(String room, String building, int capacity, boolean hasProjector) {
		this.room = room;
		this.building = building;
		this.capacity = capacity;
		this.hasProjector = hasProjector;
	}
	
	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isHasProjector() {
		return hasProjector;
	}

	public void setHasProjector(boolean hasProjector) {
		this.hasProjector = hasProjector;
	}

	@Override
	public int compareTo(Classroom o) {
		// TODO Auto-generated method stub
		return 0;
	}

}