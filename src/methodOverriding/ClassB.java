package methodOverriding;

public class ClassB extends ClassA
{
//	public void method1()
//    {
//    	System.out.println("ClassB method1");
//    }
	public static void main(String[] args) 
	{
		ClassB x = new ClassB();
	//	x.method1();                 // Child class method executed
		
		// if child class method is absent then parent class method executed
		x.method1();
		
	}
}
