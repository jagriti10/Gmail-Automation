package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class gmail2 {
	static WebDriver driver;
	 public static void main(String[] args ) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:/Users/jagriti.sharma/selenium/chromedriver/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://accounts.google.com/signin");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("identifierId")).sendKeys("jagritisharma");
		 Thread.sleep(3000);
		 driver.findElement(By.className("CwaK9")).click();
		 driver.close();
		 }
}
