package constructor;

public class ConstructorByDefault 
{
   public static int a;
   public static char b;
   public static String c;
   public        int d;
    public static void main(String[] args) 
    {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		ConstructorByDefault x = new ConstructorByDefault();
		System.out.println(x.d);
	}
}
