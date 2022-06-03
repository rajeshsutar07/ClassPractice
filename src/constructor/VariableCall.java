package constructor;

public class VariableCall 
{
  public static int a = 45;   // static variable
  public        char b = 'A';  // non static variable
  
  public static void main(String[] args) 
{
     // calling static
	  System.out.println(a);                // direct
	  System.out.println(VariableCall.a);    // with class name
	  
	  // calling non static
	  VariableCall x = new VariableCall();
	  System.out.println(x.b);
	  System.out.println(x.b);
	   
	  //  call static variable with object also
	  System.out.println(x.a);
	  
}
  
}
