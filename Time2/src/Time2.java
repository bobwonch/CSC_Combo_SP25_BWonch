
public class Time2 {
	private int hour;
	private int min;
	private double sec;
	
	public Time2()//default constructor
	{
		this.hour = 0;
		this.min = 0;
		this.sec = 0.0;
	}	
	public Time2(int hour, int min, double sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}


	public boolean equals(Time2 that)
	{
		final double DELTA = 0.001;
		return this.hour == that.hour && 
				this.min == that.min &&
				Math.abs(this.sec - that.sec) < DELTA;
				
	}

	public static Time2 add(Time2 t1, Time2 t2)
	{
		Time2 sum = new Time2();
		sum.hour = t1.hour + t2.hour;
		sum.min = t1.min + t2.min;
		sum.sec = t1.sec + t2.sec;
		
		if(sum.sec >= 60)
		{
			sum.sec -= 60;
			sum.min += 1;
		}
		if(sum.min >= 60)
		{
			sum.min -= 60;
			sum.hour += 1;
		}
		
		return sum;
	}
	
	public Time2 add(Time2 t2)
	{
		Time2 sum = new Time2();
		
		sum.hour = this.hour + t2.hour;
		sum.min = this.min + t2.min;
		sum.sec = this.sec + t2.sec;
		
		if(sum.sec >= 60)
		{
			sum.sec -= 60;
			sum.min += 1;
		}
		if(sum.min >= 60)
		{
			sum.min -= 60;
			sum.hour += 1;
		}
		return sum;
	}
	

	public void setHour(int hour)
	{
		this.hour = hour;
	}
	public void setMin(int min)
	{
		this.min = min;
	}
	public void setSec(double sec)
	{
		this.sec = sec;
	}

	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public double getSec() {
		return sec;
	}


	@Override
	public String toString() {
		return String.format("The time is %d:%d:%.2f", this.hour,this.min, this.sec);
	}
	
	
}
