package method;

public class MethodCall 
{
 public static void method1()
 {
	 System.out.println("method 1");
 }
 public void method2()
 {
	 System.out.println("method 2");
 }
 public static void main(String[] args) 
{
	// call static
	 method1();                // direct
	 MethodCall.method1();     // with class name
	 
	 
	 // call non static
	 MethodCall x = new MethodCall();
	 x.method2();                        // with object
	 
	 // call static method with object also
	 x.method1();
} 
}
