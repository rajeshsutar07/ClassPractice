package multiLevelInheritance;

public class Parent extends Grand 
{
	public void method2()
	{
		System.out.println("Parent");
	}
   public static void main(String[] args) 
   {
	  Parent y = new Parent();
	  System.out.println(y.x);
	  y.method1();
   }
}
