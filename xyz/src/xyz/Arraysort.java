package xyz;

import java.util.Arrays;


public class Arraysort {

	public static void main(String[] args) {

		int[] a= {5,6,4,30,20};
		/*for(int i=0;i<a.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		Arrays.sort(a);
		for(int w:a)
		{
			System.out.println(w);
		}
		}
	}


