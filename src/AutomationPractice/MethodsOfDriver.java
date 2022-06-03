package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfDriver 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\icon\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
    	   WebDriver driver = new ChromeDriver();
    	   
    	   driver.get("https://www.google.com/");
    		Thread.sleep(2000); 
    		
    		driver.navigate().to("https://www.facebook.com/");
    		Thread.sleep(2000);
    		
    		driver.navigate().back();
    		Thread.sleep(2000);
    		
    		driver.navigate().forward();
    		Thread.sleep(2000);
    		
    		driver.navigate().refresh();
    		Thread.sleep(2000);
    		
    		driver.manage().window().maximize();
    		Thread.sleep(2000);
    		
    		driver.close();   
    		Thread.sleep(2000);
    		
    		driver.quit();
	}
}

