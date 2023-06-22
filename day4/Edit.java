package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) throws InterruptedException {
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
          driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sumathy");
          driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Natarajan");
          driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
          driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
          driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9488034524");
          driver.findElement(By.name("submitButton")).click();
          driver.findElement(By.linkText("Edit")).click();
          driver.findElement(By.id("updateLeadForm_companyName")).clear();
          driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Zoho");
          driver.findElement(By.name("submitButton")).click();





          

         
         

	}

}
