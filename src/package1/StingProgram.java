package package1;

import java.util.Scanner;

public class StingProgram 
{
public static void main(String[] args) 
{
	// 1.replace lower to upper and vice versa
//	String s = "RaJe";
//char ch[] = s.toCharArray();
//for(int i= 0;i<s.length();i++)
//{
//if(ch[i]>64 && ch[i]<91)	
//{
//	ch[i]=Character.toLowerCase(ch[i]);
//}
//else
//{
//	ch[i]=Character.toUpperCase(ch[i]);
//}
//}
//System.out.println(new String (ch));	
	
	
	// 2.remove white spaces in sttring
//	String s = " R A J E ";
//	char ch[] =s.toCharArray();
//	for(int i= 0;i<s.length();i++)
//	{
//		if(ch[i]==' ')
//		{
//			ch[i]='-';
//		}
//		if(ch[i]!='-')
//		{
//		System.out.print(ch[i]);
//		}
//	}
	
	
	//3.count total number of character
//	String s=" Raje sh";
//	int count= 0;
//	for(int i=0;i<s.length();i++)
//	{
//		if(s.charAt(i)!=' ')
//		{
//			count++;
//		}
//	}
//	System.out.println(count);
	
	
	// 4.count vowels and consonant
//	String s = "abcdefghi";
//	int countv=0,countc=0;
//	for(int i=0;i<s.length();i++)
//	{
//		if((s.charAt(i)=='a')|| (s.charAt(i)=='e' )|| (s.charAt(i)=='i') || (s.charAt(i)=='o') || (s.charAt(i)=='u'))
//		{
//			countv++;
//	    }
//		else
//		{
//			countc++;
//		}
//	}
//	System.out.println(countv);
//	System.out.println(countc);
	
	
	//5.replace spaces by a special character
//	String  s = "R J ";
//	
//	char arr[] = s.toCharArray();
//	for (int i =0;i<s.length();i++)
//	{
//		if(arr[i]==' ')
//		{
//		arr[i]='@';	
//		}
//	}
//	System.out.println(new String (arr));
	
	
	// 6. reverse string char bt char
//	String s ="RAJESH";
//	char a[] = s.toCharArray();
//	for(int i=s.length()-1;i>=0;i--)
//	{
//	      System.out.print(a[i]);
//	}
	
	
//////7. FIND DUPLICATE CAHRACTER IN STRING
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter Word Containing Duplicate");
//	String s = sc.nextLine();
//	char arr[]=s.toCharArray();
//	for(int i=0;i<arr.length;i++)
//	{
//		int count = 0;
//		for(int j=i+1;j<arr.length;j++)
//		{
//			if(arr[i]==arr[j])
//			{
//				count++;
//				arr[j]='0';
//			}
//		}
//		if(count>0 && arr[i]!='0')
//		{
//			System.out.println(arr[i]);
//		}
//	}
	
	
	
	///// 8.frequency of character
	
	
	
	// 10.Reverse string word by word
	
	// use trim for any tariling and leading spaces
 // String a = "All is Well";
//  String ans = "";
//  int k;
//  int count = 0;
//
//  for(int j=a.length()-1;j>0;j--)
//  {
//	  for(int i = j-1;i>0;i--)
//	  {
//		  if(a.charAt(i)==' ')
//		  {
//			  count++;
//			  if(ans.isEmpty())
//			  {
//			ans= ans.concat(a.substring(i+1, j+1));
//		
//			  }
//			  else if (count==1)
//			  {
//				 ans= ans.concat(" "+a.substring(i+1, j+1));
//				break;
//			  }
//		  }
//	  }
// k=j;
// j=i;
//  }
//  System.out.println(ans);
	
	
	////// a. remove duplicate character from string
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter Word Containing Duplicate");
//	String s = sc.nextLine();
//	char arr [] = s.toCharArray();
//	StringBuilder sb = new StringBuilder();
//	for(int i =0;i<arr.length;i++)
//	{
//		int count = 0;
//		for(int j=i+1;j<arr.length;j++)
//		{
//			if (arr[i]==arr[j])
//			{
//				count++;
//				break;	
//			}
//		}
//		if(count==0)
//		{
//			sb.append(arr[i]);     //// sb=sb+arr[i]; if we take string class instead of stringbuilder
//		}
//	}
//	System.out.println(sb);
	
	
	
	//////b. remove special character from string
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter Word Containing special character:");
//	String s = sc.nextLine();
//	String result = "";
//	for(int i = 0;i<s.length();i++)
//	{
//		if (s.charAt(i)>64 && s.charAt(i)<123)
//		{
//			result = result + s.charAt(i);
//		}
//	}
//	System.out.println(result);
	
	
	////// c. sorting string on alphabetical order
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter Word Containing Duplicate");
//	String s = sc.nextLine();
//	char arr[]=s.toCharArray();
//	char temp;
//	for(int i=0;i<arr.length;i++)
//	{
//		for(int j=i+1;j<arr.length;j++)
//		{
//			if(arr[i]>arr[j])
//			{
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//	}
//	System.out.println(new String(arr));
	
	
	
	//////7. FIND DUPLICATE CAHRACTER IN STRING
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter Word Containing Duplicate");
//	String s = sc.nextLine();
//	char arr[]=s.toCharArray();
//	for(int i=0;i<arr.length;i++)
//	{
//		int count = 0;
//		for(int j=i+1;j<arr.length;j++)
//		{
//			if(arr[i]==arr[j])
//			{
//				count++;
//				arr[j]='0';
//			}
//		}
//		if(count>0 && arr[i]!='0')
//		{
//			System.out.println(arr[i]);
//		}
//	}
	
	
	
}
}
