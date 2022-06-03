package package1;

public class NumberProgram 
{
public static void main(String[] args)
{
	// program 1 ----number is positive,negative or zero
//	int number = -0;
//	if (number>0)
//	{
//		System.out.println("The number is positive");
//	}
//	else if(number<0)
//	{
//		System.out.println("The number is negative");
//	}
//	else
//	{
//		System.out.println("The number is zero");
//	}

	
	
	// program 2 -----number is odd or even
//	int number=0;
//	if (number%2==0)
//	{
//		System.out.println("The number is even");
//	}
//	else
//	{
//		System.out.println("The number is odd");
//	}
	
	
	
	//program 3------even numbers from 1-100
//	for (int i=2;i<=100;i=i+2) 
//	{
//		System.out.println(i);
//	}
	
	
	// program 4------odd numbers 1-100
//	for(int a=1;a<=100;a=a+2)
//	{
//		System.out.println(a);
//	}
	
	
     // program 5--- largest of two numbers
//	int a,b;
//	a=4;
//	b=6;
//	System.out.println("a="+a +" and"+" b="+b);
//	if (a>b)
//	{
//		System.out.println("a is greater than b");
//	}
//	else
//	{
//		System.out.println("b is greater than a");
//	}
	
	
	
	// program 6----sum of first 10 natural numbers
//	int sum,n;
//	n=10 ;
//	sum=n*(n+1)/2;
//	System.out.println(sum);
	
	// OR
//	int sum=0;
//	for(int i=1;i<=10;i++)
//	{
//		sum=sum+i;
//	}
//	System.out.println(sum);
	
	
	
	// program 7-----largest of three number
//	int a,b,c;
//	a=102;
//	b=23;
//	c=41;
//	if (a>b && a>c)
//	{
//		System.out.println("a is largest");
//	}
//	else if(b>a && b>c)
//	{
//		System.out.println("b is largest");
//	}
//	else
//	{
//		System.out.println("c is largest");
//	}
	
	
	
	// program 8----smallest of threer number
//	int a,b,c;
//	a=-550;
//	b=0;
//	c=-55;
//	if (a<b && a<c)
//		{
//			System.out.println("a is smallest");
//		}
//		else if(b<a && b<c)
//		{
//			System.out.println("b is smallest");
//		}
//		else
//		{
//			System.out.println("c is smallest");
//		}
	
	
	
	// program 9 ----square and square root
	// square
//	int n,sq;
//	n=5;
//	sq=n*n;
//	System.out.println(sq);
	
	
	
	// square by another way
//	int num = 45;
//	int temp,sq;
//	temp = num *1;
//	sq = temp * num;
//	System.out.println("square is = "+sq);
	
	
	
	// square root
//	double num=37.5;
//	double temp;
//	double sr=num/2;
//	do 
//	{
//	temp=sr;
//	sr=(temp+(num/temp))/2;
//	}
//	while((temp-sr)!=0);
//	System.out.println(sr);
//	
	
	
	// program 10----GCD/HCF of two numbers
//	int a,b;
//	a=36;
//	b=48;
//	int c=0;
//	for(int i=1;i<=a;i++)
//	{
//		if(a%i==0 && b%i==0)
//		{
//			c=i;
//		}
//	}
//	System.out.println(c);
	
	
	
	// program 11----LCM of two numbers
//	int a,b;
//	a=8;
//	b=12;
//	int c=0;
//	for(int i=1;i<=a;i++)
//	{
//		if(a%i==0 && b%i==0)
//		{
//			c=i;
//		}
//	}
//	System.out.println((a*b)/c);
	
	
	
	// program 12-----fibonacci serires 1 - 10
//     int a=0,b=1;
//     int c;
//     System.out.print(a+","+b+",");
//     for (int i=1;i<=10;i++)
//     {
//    	 c=a+b;
//    	 System.out.print(c+",");
//    	 a=b;
//    	 b=c;
//     }
	
	
	
	// program 13 ----palindrome number
//	int no=232;
//	int temp=no;
//	int rev=0;
//	int rem;
//	while (temp != 0)
//	{
//		rem=temp%10;
//		rev=rev*10+rem;
//		temp=temp/10;
//	}
//	if(no==rev)
//	{
//		System.out.println("Number is Palindrome number");
//	}
//	else
//	{
//		System.out.println("Number is not Palindrome number");
//	}
	
	
	
	// program 14----factorial
//	int num=5;
//	int fact=1;
//	for(int i=1;i<=5;i++)
//	{
//		fact=fact*i;
//	}
//	System.out.println(fact);
	
	
	
	
	// program 15----Armstrong number
//	int no=374;
//	int t1=no;
//	int length=0;
//	while(t1 !=0)
//	{
//		t1=t1/10;
//		length=length+1;
//	}
//	 
//	int t2=no;
//	int rem;
//	int arm=0;
//	while(t2 !=0)
//	{
//		rem=t2%10;
//		int mult=1;
//		for(int i=1;i<=length;i++)
//		{
//			mult=mult*rem;
//		}
//		arm=arm+mult;
//		t2=t2/10;
//	}
//	if (no==arm)
//	{
//		System.out.println("Number is Armstrong number");
//	}
//	else
//	{
//		System.out.println("Number is not Armstrong number");
//	}

	
	
	// program 16----ASCII value
//	char ch='a';
//	int a=ch;
//	System.out.println(a);
	
	
	
	// program 17----swap two numbers
	// with variable
//	int a=20;
//	int b=85;
//	int c;
//	c=a;
//	a=b;
//	b=c;
//	System.out.println("a="+a+" and "+"b="+b);
	
	//without variable
//	int a=35;
//	int b=85;
//	a=a+b;
//	b=a-b;
//	a=a-b;
//	System.out.println("a="+a+" and "+"b="+b);
	
	
	
	// program 18----largest of four numbers
//	int a,b,c,d;
//	a=259;
//    b=54;
//    c=436;
//    d=215;
//    if (a>b && a>c && a>d)
//    {
//    	System.out.println("a is largest");
//    }
//    else if  (b>a && b>c && b>d)
//    {
//    	System.out.println("b is largest");
//    }
//    else if (c>a && c>b && c>d)	
//    {
//    	System.out.println("c is largest");
//    }
//    else
//    {
//    	System.out.println("d is largest");
//    }
    
	
	
	// program 19----display prime number
//	int no=7;
//    int temp=0;
//    for(int j=2;j<=no-1;j++)
//    {
//    	if (no%j==0)
//    	{
//    		temp=temp+1;
//    	}
//    }
//    if (temp>1)
//    {
//    	System.out.println("not a prime number");
//    }
//    else
//    {
//    	System.out.println("prime number");
//    }
    
	
	
	// program 20-----alternate prime number (1-100)
//	int i,j,count=0,k=0;
//	for( i=1;i<=100;i++)
//	{
//		for(j=1;j<=i;j++)
//		{
//			if(i%j==0)
//			{
//				count++;
//			}
//		}
//		if(count==2)
//		{
//			if(k%2==0)
//			{
//				System.out.println(i);
//			}
//			k++;
//		}
//		count=0;
//	}
	
	
    
	// program 21------ prime numbers 1-100
//	int temp=0;
//	for(int i=1;i<=100;i++)
//	{
//		for(int j=2;j<=(i-1);j++)
//		{
//			if(i%j==0)
//			{
//				temp=temp+1;
//			}
//		}
//		if(temp==0)
//		{
//			System.out.println(i);
//		}
//		else
//		{
//			temp=0;
//		}
//	}
	
	
	

	
	
	
}
}
