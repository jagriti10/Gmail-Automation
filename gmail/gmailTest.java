package gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailTest {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/jagriti.sharma/Downloads/selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("jagritisharma.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        driver.findElement(By.xpath("//[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("1a2b3c4d");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
	}

}
