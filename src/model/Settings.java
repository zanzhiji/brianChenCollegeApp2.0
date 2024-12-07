package model;

public enum Settings {
	MAX_COURSE_SIZE(200),
	MAX_SECTION_SIZE(1000),
	MAX_CLASSROOM_SIZE(30);
	
	private int maxSize;
	
	Settings(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public int getMaxSize() {
		return maxSize;
	}
	
}