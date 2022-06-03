package package1;

public class BreakContinue 
{
   public static void main(String[] args) 
   {
	   // break
//	for (int i= 1; i<=10; i++)
//	{
//		if (i==5)
//		{
//			break;
//		}
//		System.out.println(i);
//	}
	
	
	   // continue (odd number)
	for (int a = 1; a<=10 ; a++)
	{
		if (a%2==0)
		{
			continue ; 
		}
		System.out.println(a);
	}
   }
}
