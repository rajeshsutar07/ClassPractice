package package1;

public class ArrayProgram 
{
	public static void main(String[] args)
	{
		// program 1----print elements of array
//		int a[]= {55,52,87,98,452,45};
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+",");
//		}
	
		
		
		// program 2----print elements in reverse order
//		int a[]= {55,52,87,98,452,45};
//		for (int i=a.length-1;i>=0;i--)
//			{
//			System.out.print(a[i]+",");
//			}
		
		
		// program 3-----print elements on even position
//		int a[]= {55,52,87,98,452,45};
//		for (int i=0;i<a.length;i++)
//		{
//			if (i%2==0)
//			{
//				System.out.print(a[i]+",");
//			}
//		}
		
		
		//program 4---print elements on odd position
//		int a[]= {55,52,87,98,452,45};
//		for (int i=0;i<a.length;i++)
//		{
//			if (i%2==1)
//			{
//				System.out.print(a[i]+",");
//			}
//		}
		
		
		
		//program 5----print largest element in array
//		int a[]= {540,84,521,45,78,95};
//		int max=a[0];
//		for (int i=1;i<a.length;i++)        // i=0   or i=1 also    
//		{
//			if (a[i]>max)
//			{
//				max=a[i];
//			}
//		}
//		System.out.println("largest number = "+max);
		
		
		
		// program 6-----smallest element in array
//		int a[]= {540,84,521,45,78,95,41};
//		int min=a[0];
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]<min)
//			{
//				min=a[i];
//			}
//		}
//		System.out.println("smallest number = "+min);
		
		
		
		// program 7--print odd and even number from array
//		int a[]= {52,89,7,8,5,4,2};
//		System.out.print("Even numbers = ");
//		for(int i=0;i<a.length;i++)
//		{
//			if (a[i]%2==0)
//			{
//				System.out.print(a[i]+",");
//			}
//			
//		}
//		System.out.println();
//		System.out.print("Odd numbers = ");
//		for(int i=0;i<a.length;i++)
//		{
//			if (a[i]%2==1)
//			{
//				System.out.print(a[i]+",");
//			}
//			
//		}
		
		
		// program 8----copy array to another array
//		int a[]= {540,84,521,45,78,95};
//		int copy[]= new int [a.length];
//		for(int i=0;i<a.length;i++)
//		{
//			copy[i]=a[i];
//		}
//		System.out.print("Original array = ");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+",");
//		}
//		System.out.println();
//		System.out.print("Copied array = ");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(copy[i]+",");
//		}
		
		
		
		// program 9---ascending order
//		int a[]= {4,5,11,2,1,99,44,12,5};
//	    int temp=0;
//	    for(int i=0;i<a.length;i++)
//	    {
//	    	for(int j=i+1;j<a.length;j++)
//	    	{
//	    		if (a[i]>a[j])
//	    		{
//	    			temp=a[i];
//	    			a[i]=a[j];
//	    			a[j]=temp;
//	    		}
//	    	}
//	    }
//	    System.out.print("ascending order = ");
//	    for(int i=0;i<a.length;i++)
//	    {
//	    	System.out.print(a[i]+",");
//	    	
//	    }
		
		
		
		
		// program 10-----descending order
		int a[]= {540,84,521,45,78,95};
		int temp=0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		
		
		
		// program 11----frequency of each element in array
//		int a[]= {1,2,4,5,10,2,10,10,4,5,5};
//		int visitedArr[]=new int [a.length];
//		int visited=-1;
//		for(int i=0;i<a.length;i++)
//		{
//			int count=1;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if (a[i]==a[j])
//				{
//					count++;
//					visitedArr[j]=visited;
//				}
//			}
//			if (visitedArr[i]!=visited)
//			{
//				visitedArr[i]=count;
//			}
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			if (visitedArr[i]!=visited)
//			{
//				System.out.println("frequency of "+a[i]+" = "+visitedArr[i]);
//			}
//		}
		
		
		
		// program 12----print duplicate element
//		int a[]= {1,2,1,4,5,10,2,10,10,4,5,5,2,2,11};
//		int visitedArr[]=new int [a.length];
//		int visited=-1;
//		System.out.print("duplicate elements are = ");
//		for(int i=0;i<a.length;i++)
//		{
//			int count=1;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if (a[i]==a[j])
//				{
//					count++;
//					visitedArr[j]=visited;
//				}
//			}
//			if (visitedArr[i]!=visited)
//			{
//				visitedArr[i]=count;
//			}
//		}
//		for(int i=0;i<a.length;i++)
//			{
//				if (visitedArr[i]!=visited)
//				{
//					if (visitedArr[i]>1)
//					{
//					System.out.print(a[i]+",");
//					}
//				}
//			}
		
		
		// program 13------2nd largest element
//		int a[]= {540,84,521,45,78,95,539};
//		int temp=0;
//		for (int i=0;i<a.length;i++)
//		{
//			for (int j=i+1;j<a.length;j++)
//			{
//				if (a[i]<a[j])
//				{
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		for (int i=0;i==0;i++)
//			{
//				for (int j=i+1;j<a.length;j++)
//				{
//					if(a[i]>a[j])
//					{
//						System.out.println("2nd largest number = "+a[j]);
//						break;
//					}
//				}
//			}
   }

}
