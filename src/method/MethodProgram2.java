package method;

public class MethodProgram2   // return type and non return type
{
        // non return type method
	public static void method1()
	{
		System.out.println("Method 1");
	}
	
	//  retuen type method with int datatype
	public static int method2()
	{
		int a=3;
		int b=4;
		int c=a+b;
		System.out.println(c);
		return a;
	}
	
	// retuen type method with char datatype
	public static char methodChar()
	{
		char z='a';
		char x='b';
		return z;
	}
	
	
	public static void main(String[] args)
	{
		method1();
		method2();
		System.out.println(MethodProgram2.methodChar());
	}
}
