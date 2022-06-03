package constructor;

public class AllConcept1 
{

 static String batchName = "12 feb morning";
  
  AllConcept1(String name,int rollNumber,int mobileNumber,char bloodGroup)
  {

	  System.out.println("Name-"+name+"-rollNumber-"+rollNumber+"-mobileNumber-"+mobileNumber+"-bloodGroup-"+bloodGroup+"-batchname-"+batchName);
	  
  }
    public static void main(String[] args) 
    {
    	AllConcept1 a = new AllConcept1 ("Rahul",101,123456,'A');
    	AllConcept1 b = new AllConcept1 ("abc",102,123465,'B');
	}
    
    //  Also see smart programming ocnstructor 34 - 40
}
