
public class Time {
	private int hour;
	private int min;
	private double sec;
	private String amPm;

	public Time()// default constructor
	{
		this.hour = 0;
		this.min = 0;
		this.sec = 0.0;
		this.amPm = "am";
	}

	public Time(int hour, int min, double sec, String amPm) {// value constructor

		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		this.amPm = amPm;
	}

	public boolean equals(Time that)//compare two times to see if they are the same.
	{
		final double DELTA = 0.001;
		return this.hour == that.hour && this.min == that.min
				&& Math.abs(this.sec - that.sec)<DELTA;//this is necessary because of 
														//imperfections in floating point numbers 
	}

	public static Time add( Time t1, Time t2)
	{
		Time sum = new Time();
		sum.hour = t1.hour + t2.hour;
		sum.sec = t1.sec + t2.sec;
		if(sum.sec >= 60) 
		{
			sum.min += 1;
			sum.sec -= 60;
		}
		sum.min += (t1.min + t2.min);
		if(sum.min >= 60) 
		{
			sum.hour += 1;
			sum.min -= 60;
		}
		
		
		return sum;
	}

	public Time add(Time t2)
	{
		Time sum = new Time();
		sum.hour = this.hour + t2.hour;
		sum.sec = this.sec + t2.sec;
		if(sum.sec >= 60) 
		{
			sum.min += 1;
			sum.sec -= 60;
		}
		sum.min += (this.min + t2.min);
		if(sum.min >= 60) 
		{
			sum.hour += 1;
			sum.min -= 60;
		}
		return sum;
	}

	public Time convert()
	{
		if(this.hour > 12)
		{
			
		}
	}
	
	//getters and setters
	public int getHour() {
		return this.hour;
	}

	public int getMin() {
		return this.min;
	}

	public double getSec() {
		return this.sec;
	}

	public void setHour(int hour) {
		if (hour > 12) {
			this.hour = 12;
		}
		else
		{
			this.hour = hour;
		}
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void setSec(double sec) {
		this.sec = sec;
	}

	@Override
	public String toString() {
		return hour + ":" + min + ":" + sec;
	}

}
