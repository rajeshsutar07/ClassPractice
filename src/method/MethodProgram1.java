package method;

public class MethodProgram1  
{
	public static void printPattern()
	{
		for (int i=1;i<=3;i++)
		{
			System.out.println(i);
		}
	}
   public static void main(String[] args) 
   {
	   MethodProgram1.printPattern();     //calling with class name
	   System.out.println("AA");
	   printPattern();                    // direct call or calling with method name
	   System.out.println("BB");
	   printPattern();
	   System.out.println("CC");
	   
	   
   }   
}
