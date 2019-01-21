package xyz;

import java.util.Scanner;

public class AddUserTest {
	
	int fab(int a)
	{
		int prv=0;
		int nxt=1;
		int result=0;
		while(a>0)
		{
			result=prv+nxt;
			prv=nxt;
			nxt=result;
		
			return result;
			
		}
		if (a==result)
		{
			System.out.println("number is fabbonic");
			return 0;
		}
		else {
			System.out.println("number is not fabbonic");
			return 1;
		}
		
	}
	int prime(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("number is prime");
			return 0;
		}
		else
		{
			System.out.println("number is not prime");
			return 1;
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		AddUserTest adt =new AddUserTest();
		int f=adt.fab(a);
		int p=adt.prime(a);
		System.out.println(f);
		System.out.println(p);
		
		if (f==0 && p==0)
		{
			System.out.println("0");
		}
		else if(f==1 &&p==0)
		{
			System.out.println("1");
		}
		
		
	}

}
