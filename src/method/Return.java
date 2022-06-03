package method;

public class Return 
{
    static int sum(int a, int b)
    {
    	return a+b;
    }
    static int sum(int a, int b, int c)
    {
    	return a+b+c;
    }
    public static void main(String[] args) 
    {
    	// ways to print return value
    	// 1.
    	int x= sum(10,20);
	     System.out.println(x);
	     // or
	      int y = Return.sum(10, 20);
	      System.out.println(y);
	      
	      // or 
	      System.out.println(sum(10,30));
	      
	     // 2.
	      System.out.println(Return.sum(10, 20, 30));
	     
	}
}
