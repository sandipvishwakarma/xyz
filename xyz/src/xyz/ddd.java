package xyz;

public class ddd extends Call {
	
	void  callMethod()
	{
		int a =10;
		System.out.println(a);
		//return a;
		
		
	}
	ddd()
	{
		super();
	}
	void display()
	{
	    callMethod();	
		super.callMethod();
	}
	

	public static void main(String[] args) {
		
		
		Call c = new ddd();
        
		
		

		
	}

}
class Call
{
	Call()
	{
		System.out.println("i am a constructor");
	}
	void callMethod()
	{
		System.out.println("call by value ");
	}
}
