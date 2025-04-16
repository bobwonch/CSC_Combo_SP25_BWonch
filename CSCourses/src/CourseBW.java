
public class CourseBW {
	private String courseNum;
	private int numStudents;
	private int maxStudents;
	private String roomNum;
	private int credits;
	public CourseBW() {
		super();
		this.courseNum = null;
		this.numStudents = 0;
		this.maxStudents = 0;
		this.roomNum = null;
		this.credits = 0;
	}
	
	
	public CourseBW(String courseNum, int numStudents, int maxStudents, String roomNum, int credits) {
		super();
		this.courseNum = courseNum;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.roomNum = roomNum;
		this.credits = credits;
	}


	public String getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	public int getNumStudents() {
		return numStudents;
	}
	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	@Override
	public String toString() {
		return "Course Num: " + courseNum + "\nNumer of students: " + numStudents + 
				"\nMax Number of Students: " + maxStudents
				+ "\nRoom Number: " + roomNum + "\nCredits: " + credits;
	}
	
	
}
