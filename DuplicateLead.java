package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Swapna New");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String capname = driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getAttribute("text");
        System.out.println(capname);
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		Thread.sleep(1000);
		String dupname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		Thread.sleep(1000);
        System.out.println(dupname);
		
    if(dupname.equals(capname)){
        System.out.println("Pass");
    }
        else {
            System.out.println("Fail");
        }
		driver.close();
	}

}
