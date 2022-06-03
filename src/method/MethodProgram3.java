package method;

public class MethodProgram3    //with argument and without argument
{
	// without argument
public static void method1()
{
	System.out.println("method 1");
}

     // with argument
public static void method2(int x)  
{
	System.out.println("method 2");
}
public static void method3(char a)
{
	System.out.println("method 3");
}
public static void method4(String z)
{
	System.out.println("method 4");
}
public static void method5(int x,int y)
{
	System.out.println("method 5");
}
public static void method6(int x,char y) 
{
	System.out.println("method 6");
	
}

	public static void main(String[] args) 
	{
	method1();
		method2(154);
		method3('g');
		method4("raje");
		method5(15,78);
		method6(11,'a');
		
	}
	

}
