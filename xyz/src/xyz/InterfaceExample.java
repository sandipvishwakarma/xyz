package xyz;

public class InterfaceExample implements newinterface,add  {
	int a,b;
	public static void main(String[] args) {
		
		InterfaceExample InEx = new InterfaceExample();
		newinterface.hello();
		System.out.println(InEx.helloa(10, 102));
		InEx.ram();
		
	}
	public float helloa(float a , int b)
	{
		float c= a+b;
		return c;
	}
	
	
	public void ram()
	{
		System.out.println("methos implementation");
	}
	

}
interface add
{
 float helloa(float a, int b);
}
interface newinterface
{
	static void hello()
	{
		System.out.println("this is static method");
	}
	void ram();
}
