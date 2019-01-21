package xyz;

public class RefVeriable {
	void disp()
	{
		System.out.println("disp() method in super class");
	}
	

}
 class one extends RefVeriable
{
void disp()
{
	System.out.println("disp() method in sub class");
}
	
	 public static void main(String[] args) {
		 
		 RefVeriable ref= new one();
		 ref.disp();
	}
}
