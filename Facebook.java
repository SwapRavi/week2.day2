package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("TestFB");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("3124567890");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Testaccount@123");
		WebElement eleDropdown = driver.findElement(By.id("day"));
		Select dd1 = new Select(eleDropdown);
		dd1.selectByVisibleText("5");
		
		WebElement eleDropdown1 = driver.findElement(By.id("month"));
		Select dd2 = new Select(eleDropdown1);
		dd2.selectByVisibleText("Jun");
		
		WebElement eleDropdown2 = driver.findElement(By.id("year"));
		Select dd3 = new Select(eleDropdown2);
		dd3.selectByVisibleText("2001");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
