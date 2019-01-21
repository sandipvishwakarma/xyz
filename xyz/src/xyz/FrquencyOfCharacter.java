package xyz;

public class FrquencyOfCharacter {

	public static void main(String[] args) {

		int[] a1 =new int[] {1,8,9,4,8,9,1,5,6,3};
		int[] fr = new int[a1.length];
		int count=0;
		int temp=0;
		
		for(int i=0; i<a1.length;i++)
		{
			for(int j=i+1; j<a1.length;j++)
			{
				if (a1[i]> a1[j])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
				
			}
			
		}
		for(int i=0; i<a1.length;i++)
		{
			System.out.print(a1[i]);
		}
		System.out.println("----------------");
				
		for(int i=0; i<a1.length;i++)
		{
			for(int j=i+1; j<a1.length;j++)
			{
				if (a1[i] == a1[j])
				{
					count++;
				}
				
			}
			fr[i]=count;
			
		}
		
		for(int i=0;i<fr.length;i++ )
		{
			System.out.print(fr[i]);
		}
	}

}
