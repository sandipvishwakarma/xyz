
package xyz;

import java.util.Scanner;
public class DeciToBi {

	public static void main(String[] args) {

		int num, i=0;
		int binary[]=new int[1000];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number");
		num=sc.nextInt();
		while(num!=0)
		{
			binary[i]=num%2;
			num=num/2;
			i++;
		}
		System.out.println("Binary number");
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(""+binary[j]);
		}
	}

}
