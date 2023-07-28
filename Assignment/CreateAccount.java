package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	driver.manage().window().maximize();
	
	WebElement userName= driver.findElement(By.id("username"));
	userName.sendKeys("demosalesManager");

	WebElement passWord= driver.findElement(By.id("password"));
	passWord.sendKeys("crmsfa");
	
	WebElement subMit= driver.findElement(By.className("decorativeSubmit"));
	subMit.click();
	
	WebElement CRM_Click= driver.findElement(By.linkText("CRM/SFA"));
	CRM_Click.click();
	
	
	driver.findElement(By.linkText("Accounts")).click();
	
	driver.findElement(By.linkText("Create Account")).click();
	
	
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	
	driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Magesh");
	
	driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
	
	WebElement industry= driver.findElement(By.name("industryEnumId"));
	Select select1= new Select(industry);
	select1.selectByValue("IND_SOFTWARE");
	
	WebElement ownerShip= driver.findElement(By.name("ownershipEnumId"));
	Select select2= new Select(ownerShip);
	select2.selectByVisibleText("S-Corporation");
	
	WebElement source= driver.findElement(By.name("dataSourceId"));
	Select select3= new Select(source);
	select3.selectByValue("LEAD_EMPLOYEE");
	
	WebElement Marketing= driver.findElement(By.name("dataSourceId"));
	Select select4= new Select(Marketing);
	select4.selectByIndex(5);
	
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	
	
}
}
//9. Enter LocalName Field Using Xpath Locator
//
//10. Enter SiteName Field Using Xpath Locator
//
//11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
//
//12. Select Industry as ComputerSoftware
//
//13. Select OwnerShip as S-Corporation using SelectByVisibletext
//
//14. Select Source as Employee using SelectByValue
//
//15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
//
//16. Select State/Province as Texas using SelectByValue 
//
//17. Click on Create Account using Xpath Locator