package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioPractice1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\icon\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
	   
	   // 1. get URL 
//		 String expectedURL  = "https://www.google.com/";
//		 String actualURL = driver.getCurrentUrl();
//		 
//		 if (actualURL.equals(expectedURL))
//		 {
//			 System.out.println("Test Case is Passed");
//		 }
//		 else
//		 {
//			 System.out.println("Test Case is failed");
//		 }
		 
		 // 2. get title
	   String expectedTitle = "Google";
		 String actualTitle = driver.getTitle();
		 System.out.println(actualTitle);
		  if (expectedTitle.equals(actualTitle))
		  {
			  System.out.println("Passed");
		  }
		  else
		  {
			  System.out.println("failed");
		  }
}
}
