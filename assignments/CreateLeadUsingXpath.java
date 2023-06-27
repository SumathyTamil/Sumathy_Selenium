package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadUsingXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  WebDriver driver = new ChromeDriver();
		  driver.get("http://leaftaps.com/opentaps/control/login");
		  driver.manage().window().maximize();
          driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
          driver.findElement(By.id("password")).sendKeys("crmsfa");
          driver.findElement(By.className("decorativeSubmit")).click();
          driver.findElement(By.linkText("CRM/SFA")).click();
          driver.findElement(By.linkText("Leads")).click();
          driver.findElement(By.linkText("Create Lead")).click();
          driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sumathy");
          driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Natarajan");
          driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Accenture");
          WebElement wb =driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
          Select sc=new Select(wb);
          sc.selectByVisibleText("Employee");
          WebElement wb1 =driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
          Select sc1=new Select(wb1);
          sc1.selectByValue("9001");
          WebElement wb2 =driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
          Select sc2=new Select(wb2);
          sc2.selectByIndex(5);
          WebElement wb3 =driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
          Select sc3=new Select(wb3);
          sc3.selectByVisibleText("India");
          driver.findElement(By.name("submitButton")).click();
          System.out.println(driver.getTitle());

          
          
          
          
          
	}

}
