package week2.day2.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) {
		/*
		 * Assignment 2:Duplicate Lead 1. Launch URL
		 * "http://leaftaps.com/opentaps/control/login" 2. Enter UserName and Password
		 * Using Id Locator 3. Click on Login Button using Class Locator 4. Click on
		 * CRM/SFA Link 5. Click on Leads Button 6. Click on Create Lead 7. Enter
		 * CompanyName Field Using id Locator 8. Enter FirstName Field Using id Locator
		 * 9. Enter LastName Field Using id Locator 10. Enter FirstName(Local) Field
		 * Using id Locator 11. Enter Department Field Using any Locator of Your Choice
		 * 12. Enter Description Field Using any Locator of your choice 13. Enter your
		 * email in the E-mail address Field using the locator of your choice 14. Click
		 * on Create Button 15. Get the Title of Resulting Page using driver.getTitle()
		 * 16. Click on Duplicate button 17. Clear the CompanyName Field using .clear()
		 * And Enter new CompanyName 18.Clear the FirstName Field using .clear() And
		 * Enter new FirstName 19.Click on Create Lead Button 20. Get the Title of
		 * Resulting Page using driver.getTitle()
		 * 
		 * -----------------------------------------------------------------------------
		 * ------
		 */       
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

		WebElement Lead_Click= driver.findElement(By.partialLinkText("Leads"));
		Lead_Click.click();
		
		WebElement CreateLead= driver.findElement(By.partialLinkText("Create"));
		CreateLead.click();
		
		WebElement companyName= driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Tata consultancy service");
		
		WebElement firstName= driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Mageshwar");
		
		WebElement lasttName= driver.findElement(By.id("createLeadForm_lastName"));
		lasttName.sendKeys("Velu");
		
		WebElement firstNameLocal= driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Magesh");
		
		
		WebElement departMent= driver.findElement(By.name("departmentName"));
		departMent.sendKeys("Application support");
		
		WebElement descripTion= driver.findElement(By.name("description"));
		descripTion.sendKeys("Working as application support in airline domain as supporting more than 20 application");
		
		WebElement gMail= driver.findElement(By.id("createLeadForm_primaryEmail"));
		gMail.sendKeys("mageshwar3724@gmail.com");
		
		WebElement finalsubMit= driver.findElement(By.name("submitButton"));
		finalsubMit.click();
		
		String getTitle =driver.getTitle();
		
		System.out.println(getTitle);
		
		driver.findElement(By.partialLinkText("Duplicate")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String endPage=driver.getTitle();
		
		System.out.println(endPage);
		
		
		
		
	}

}
