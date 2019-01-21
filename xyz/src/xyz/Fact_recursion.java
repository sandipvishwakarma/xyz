package xyz;

public class Fact_recursion {
	public static int factorial(int a)
	{
		if (a<=1)
		return 1;
		else return(a*factorial(a-1));
	}

	public static void main(String[] args) {

		int fact= factorial(5);
		System.out.println("Factorial of a number= "+fact);
	}

}
