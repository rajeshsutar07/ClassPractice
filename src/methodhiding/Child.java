package methodhiding;

public class Child extends Parent 
{
//	public static void method1() 
//    {
//    System.out.println("Child method1");	
//    }
	public static void main(String[] args) 
	{
	 Child x = new Child();
	//  x.method1();             // child method executes
          x.method1();      // child class method absent then paarent class method executes
	}
}
