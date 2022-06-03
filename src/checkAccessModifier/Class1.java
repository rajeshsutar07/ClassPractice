package checkAccessModifier;

public class Class1 
{
     // here we only declare and initialise and dont write main method
	// 1. for public
	  public static int a = 50;
	  public    int b = 100;
	 
	  public static void method()
	 {
		 System.out.println("static method 1");
	 }
	  public     void method2()
	 {
		 System.out.println("non static method 2");
	 }
	 
	 // similar to constructor also
	 
	 
	 // check same for other access modifier
	 
	 // in class 2, class 3 and class 4 we only call differnent access modifier throuigh main method
}
