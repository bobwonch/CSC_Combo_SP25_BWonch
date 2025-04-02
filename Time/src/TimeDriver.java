
public class TimeDriver {

	public static void main(String[] args) {
		
		Time myTime = new Time();
		myTime.setHour(10);
		myTime.setMin(0);
		myTime.setSec(59.0);
		System.out.println(myTime.getHour() + ":" + myTime.getMin() + ":" + myTime.getSec());
		
		Time yourTime = new Time(9,59,59);
		System.out.println(yourTime);
		
		System.out.println(myTime.equals(yourTime));
		
		System.out.println(Time.add(myTime, yourTime));//static
		System.out.println(myTime.add(yourTime));//non-static
	}
}
