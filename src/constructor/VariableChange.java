package constructor;

public class VariableChange 
{
     public static int a = 50;
     public        int b = 60;
     public static void main(String[] args) 
    {
    	 // static variable changes
    	 
		int m = VariableChange.a;
		System.out.println(m);
		
		VariableChange.a=100;
		System.out.println(VariableChange.a);
		
		int n = 200;
		System.out.println(VariableChange.a+n);
		
		// non static variable changes
		VariableChange x = new VariableChange();
		System.out.println(x.b);
		
		int a = x.b;
		System.out.println(a);
		
		x.b = 80;
		System.out.println(x.b);
		
		// new object 
		VariableChange y = new VariableChange();
		System.out.println(y.b);
		
	}
    		 
}