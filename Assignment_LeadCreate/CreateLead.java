package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		WebElement userName= driver.findElement(By.id("username"));
		userName.sendKeys("demosalesManager");

		WebElement passWord= driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");

		WebElement subMit= driver.findElement(By.className("decorativeSubmit"));
		subMit.click();
		
		WebElement CRM_Click= driver.findElement(By.xpath("//*[@id=\"button\"]/a"));
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
		
		//select function
		
		WebElement stateSelection= driver.findElement(By.name("generalStateProvinceGeoId"));
		Select select =new Select(stateSelection);
		
		select.selectByVisibleText("New York");
		

		WebElement finalsubMit= driver.findElement(By.name("submitButton"));
		finalsubMit.click();

		Thread.sleep(8000);
		
		//Assignment2
		//click edit option
		
		
		WebElement clickEdit= driver.findElement(By.partialLinkText("Edit"));
		clickEdit.click();
		
		Thread.sleep(5000);
		
		//descripTion.clear();
			
		System.out.println("cleared");
		
		WebElement importantField= driver.findElement(By.name("importantNote"));
		importantField.sendKeys("Cleared the description and updated the important field");
		
		WebElement upDate= driver.findElement(By.className("smallSubmit"));
		upDate.click();
		
		Thread.sleep(5000);
		
		System.out.println("Successfully passsed all testcases");
	}
}
