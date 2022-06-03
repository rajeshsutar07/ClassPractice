package package1;

public class StringTP 
{
 public static void main(String[] args) 
 {
	String a = "Hello";
	String b = "";
	b = b.concat(a.substring(0, 1));
	System.out.println(b);
 }
}
