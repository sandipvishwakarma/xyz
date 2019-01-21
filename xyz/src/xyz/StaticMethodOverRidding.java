package xyz;

public class StaticMethodOverRidding {
	

		 static void add()
		{
		 System.out.print("Addition of number in super class");
		}
		}

class RideStaticMethod extends StaticMethodOverRidding
		{
	static void add(int a)
		{
		 System.out.print("Addition of number in subclass");
		}
		public static void main(String[] args)
		{
			int a;
		StaticMethodOverRidding smo = new RideStaticMethod();
		smo.add();
		
	}

}
