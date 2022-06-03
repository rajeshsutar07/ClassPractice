package package1;

public class ThisKeyword 
{
  int rollNo;
  String name;
  ThisKeyword(int rollNo,String name)
  {
	  this.rollNo = rollNo;
	  this.name = name;
	  System.out.println(rollNo+"    "+name);
  }
  public static void main(String[] args) 
  {
	  ThisKeyword x = new ThisKeyword(7,"RAJE");
  }
}
