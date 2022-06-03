package superKeyword1;

public class Super2 extends Super1
{
	String name = "ABC";
   public void print()
   {
	   System.out.println(name);
	   System.out.println(super.name);
   }
   public static void main(String[] args) 
   {
	   Super2 x = new Super2();
	   x.print();
   }
}
