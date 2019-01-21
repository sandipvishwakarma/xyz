package xyz;

public class CommonElementFromThreeArray {
	

	public static void main(String[] args) {
		FindCommon fc = new FindCommon();
		
		int[] ar1= {5,10,15,20,25};
		int[] ar2= {15,20,21,23,45};
		int[] ar3= {1,2,5,15,20};
		System.out.println("Common Element");
		fc.findCommon(ar1, ar2, ar3);
	}

}
class FindCommon
{
	void findCommon(int ar1[],int ar2[], int ar3[])
	{
		int i=0,j=0,k=0;
		
		while(i<ar1.length && j<ar2.length && k<ar3.length)
		{
			if (ar1[i]==ar2[j]&&ar2[j]==ar3[k])
			{
				System.out.print(ar1[i]+","+" ");
				i++;
				j++;
				k++;
			}
			else if (ar1[i]<ar2[j])
			{
				i++;
			}
			else if (ar2[j]<ar3[k])
			{
				j++;
			}
			else
				k++;
		}
	}
}