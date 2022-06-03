package constructor;

public class AllConcept 
{
  // program of Student data
	String studentName;
	int rollNumber;
	int mobileNumber;
	char bloodGroup;
	static String batchName = "12 feb morning";
	
	// 1
	public AllConcept()
	{
		studentName = "Rahul";
		rollNumber = 101;
		mobileNumber = 123123;
		bloodGroup = 'B';
		//System.out.println("studentName-"+studentName+"-rollNumber-"+rollNumber+"-mobileNumber"+mobileNumber+"-bloodGroup-"+bloodGroup);		
	}
	public AllConcept(int a)
	{
		studentName = "abc";
		rollNumber = 102;
		mobileNumber = 123122;
		bloodGroup = 'A';
		//System.out.println("studentName-"+studentName+"-rollNumber-"+rollNumber+"-mobileNumber"+mobileNumber+"-bloodGroup-"+bloodGroup);		
	}
	public void printData()
	{
		System.out.println("studentName-"+studentName+"-rollNumber-"+rollNumber+"-mobileNumber"+mobileNumber+"-bloodGroup-"+bloodGroup+"-batchName-"+batchName);
	}
	public static void main(String[] args) 
	{
		AllConcept x = new AllConcept();
		x.printData();
		AllConcept y = new AllConcept(2);
		y.printData();
		
		      // or create one method for only printing statement and hide from constructor
		   
		// for more easy see AllConcept1
	}
	}
