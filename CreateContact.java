package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("SwapnaRavi");
		driver.findElement(By.id("lastNameField")).sendKeys("MT");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("SwapFN");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("RaviLN");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing Selenium");
		driver.findElement(By.id("createContactForm_description")).sendKeys("TestAccount Creation");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("swaps@gmail.com");
		WebElement eleDropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(eleDropdown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("TestAccount cleared Successfully");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("The title is: " + driver.getTitle());
		//driver.close();
		
	}

}
