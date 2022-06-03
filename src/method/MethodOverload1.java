package method;

public class MethodOverload1 
{
     public static void add(int a,int b)
     {
    	 int x = a;
    	 int y = b;
    	 int z = x+y;
    	 System.out.println(z);
     }
     public static void add(int a,int b,int c)
     {
    	 int d = a+b+c;
    	 System.out.println(d);
     }
     public static void main(String[] args)
    {
		add(12,14);
		add(12,13,14);
	}
}
