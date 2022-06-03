package constructor;

public class Constructor1
{
	  static int a;
	  // 1
	  public Constructor1()
	  {
		  a=56;
		  System.out.println(a);
	  }
	  // 2
	  public Constructor1(int a)
	  {
		  a=87;
		  System.out.println(a);
	  }
	  // 3
	  public Constructor1(int a,int b)
	  {
		  a=90;
		  System.out.println(a);
	  }
	  
	  public static void main(String[] args) 
	{
		  Constructor1 x = new Constructor1();
		  Constructor1 y = new Constructor1(4);
		  Constructor1 z = new Constructor1(4,1); 
		  System.out.println(z.a);
	}
}
