package xyz;

public class DaysOfEnum {
	public enum days
	{
		sunday,monday,tuesday,wednesday
	}
public static void main(String[] args) {
	System.out.println(days.sunday);
	days[] ds = days.values();
	for(Object dy:ds)
	{
		System.out.println(dy);
	}
}
	

}
