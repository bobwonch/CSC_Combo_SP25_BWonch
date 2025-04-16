import java.util.Scanner;

public class ClassesCSBW {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		CourseBW myCourse = new CourseBW();
		CourseBW yourCourse = new CourseBW("CSC1001", 6,26,"BP119", 3);
		setData(myCourse);
		printCourse(yourCourse);
		System.out.println(myCourse);

	}

	private static void printCourse(CourseBW myCourse) {
		System.out.println("Course: " + myCourse.getCourseNum());
		System.out.println("Number of students: " + myCourse.getNumStudents());
		System.out.println("Maximum number of students: " + myCourse.getMaxStudents());
		System.out.println("Room: " + myCourse.getRoomNum());
		System.out.println("Credits: " + myCourse.getCredits());
		
	}

	private static void setData(CourseBW myCourse) {
		System.out.println("What is the course number?");
		String cNum = input.next();
		System.out.println("Number of students?");
		int numStudents = input.nextInt();
		System.out.println("Max number of students?");
		int maxStudents = input.nextInt();
		System.out.println("Room number?");
		String roomNum = input.next();
		System.out.println("Number of credits?");
		int credits = input.nextInt();		
		
		myCourse.setCourseNum(cNum);
		myCourse.setCredits(credits);
		myCourse.setCourseNum(cNum);
		myCourse.setNumStudents(numStudents);
		myCourse.setMaxStudents(maxStudents);		
	}

	

}
