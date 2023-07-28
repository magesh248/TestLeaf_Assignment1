package week2.day2.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Lead {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();

		WebElement userName= driver.findElement(By.id("username"));
		userName.sendKeys("demosalesManager");

		WebElement passWord= driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");

		WebElement subMit= driver.findElement(By.className("decorativeSubmit"));
		subMit.click();

		WebElement CRM_Click= driver.findElement(By.linkText("CRM/SFA"));
		CRM_Click.click();
		
		driver.findElement(By.partialLinkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();

		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("mageshwar3724@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		WebElement link=driver.findElement(By.partialLinkText("Mageshwar"));
				link.click();
		
		driver.findElement(By.linkText("Delete")).click();
		
		System.out.println("Data is deleted");
	
	}

}
