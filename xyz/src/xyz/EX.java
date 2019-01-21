package xyz;

public class EX {
/*
	Copy array to other array
	
*/	public static void main(String[] args) {

		int[] a = new int[] {1,2,6,8,9};
		int[] a2 =new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			a2[i]=a[i];
		}
		System.out.print("a2=");
		for(int i=0;i<a2.length;i++)
		{
			System.out.print(a2[i]+" ");
		}
	}

}
