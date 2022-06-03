package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelProgram 
{
 public static void main(String[] args) 
 {
	 
	 // opening google on chrome
   System.setProperty("webdriver.chrome.driver","C:\\Users\\icon\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.google.com/");
	 
	 // opening google on firefox
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\icon\\Downloads\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	 WebDriver driver1 = new FirefoxDriver();
	 driver1.get("https://www.google.com/");
 }
}
