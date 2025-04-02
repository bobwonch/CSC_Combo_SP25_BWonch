
public class TimeDriver {

	public static void main(String[] args) {
		Time2 myTime = new Time2();
		
		myTime.setHour(11);
		myTime.setMin(19);
		myTime.setSec(32.0);
		
		System.out.println(myTime.getHour() +":"+ myTime.getMin() +":" +myTime.getSec());
		System.out.println(myTime);
		
		Time2 yourTime = new Time2(11,37,45); 
		
		Time2 differentTime = new Time2(11,37,45);
		
		System.out.println(yourTime);
		
		System.out.println(Time2.add(yourTime, differentTime));
		System.out.println(myTime.add(differentTime));
		
		System.out.println(differentTime.equals(yourTime));
	}

}
