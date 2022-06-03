package AutomationPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseSizeAndPosition 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\icon\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
	   
	   // Set size of browser
	   Dimension d = new Dimension(500,50);
	   driver.manage().window().setSize(d);
	   Thread.sleep(2000);
	   
	   // Set position of browser
	   Point p = new Point(300,500);
	   driver.manage().window().setPosition(p);
   }
}
