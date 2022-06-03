package inheritance1;

public class ClassB extends ClassA
{
        public static void main(String[] args) 
        {
			 // 1. by creating object of class A
        	//ClassA x = new ClassB();
        	//System.out.println(x.a);
        	//x.method1();
        	
        	// 2. inheritance
        	ClassB y = new ClassB();
        	System.out.println(y.a);
        	y.method1();
		}
}
