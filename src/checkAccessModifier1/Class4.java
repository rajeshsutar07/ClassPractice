package checkAccessModifier1;

import checkAccessModifier.Class1;

public class Class4 
{
	public static void main(String[] args) 
	{
		System.out.println(Class1.a);
		
		Class1 x = new Class1();
        System.out.println(x.b);
        
        Class1.method();
        
        x.method2();
	}

}
