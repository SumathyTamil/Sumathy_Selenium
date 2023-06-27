package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountUsingXpath {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

         driver.get("http://leaftaps.com/opentaps/control/login");
         driver.manage().window().maximize();
          driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
          driver.findElement(By.id("password")).sendKeys("crmsfa");
          driver.findElement(By.className("decorativeSubmit")).click();
          driver.findElement(By.linkText("CRM/SFA")).click();
          driver.findElement(By.linkText("Accounts")).click();
          driver.findElement(By.linkText("Create Account")).click();
          driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	  	    driver.findElement(By.xpath("//textarea[contains(@name,'descrip')]")).sendKeys("Selenium Automation Tester");
	  	    driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Sumathy");
	  	    driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("Mannargudi");
	  	    driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("100000");
	  	    WebElement wb = driver.findElement(By.name("industryEnumId"));
	  	    Select sc =new Select(wb);
	  	    sc.selectByVisibleText("Computer Software");
	  	    WebElement wb1 = driver.findElement(By.name("ownershipEnumId"));
	  	    Select sc1 =new Select(wb1);
	  	    sc1.selectByVisibleText("S-Corporation");
	  	    WebElement wb2 = driver.findElement(By.id("dataSourceId"));
	  	    Select sc2 =new Select(wb2);
	  	    sc2.selectByValue("LEAD_EMPLOYEE");
	  	    WebElement wb3 = driver.findElement(By.id("marketingCampaignId"));
	  	    Select sc3 =new Select(wb3);
	  	    sc3.selectByIndex(6);
	  	   WebElement wb4 = driver.findElement(By.id("generalStateProvinceGeoId"));
	  	    Select sc4 =new Select(wb4);
	  	    sc4.selectByValue("TX");
	  	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	  	    
          
          
	}
}
