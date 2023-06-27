package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DupicateLead {

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
         driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sumy");
         driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
         driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("UI-Testing");
         driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sumath97@gmail.com");
         driver.findElement(By.name("submitButton")).click();
         System.out.println(driver.getTitle());
         driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();

         WebElement wb = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
         wb.clear();
         wb.sendKeys("Zoho");
         WebElement wb1 = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
         wb1.clear();
         wb1.sendKeys("Sumy");	
         driver.findElement(By.name("submitButton")).click();
         System.out.println(driver.getTitle());

       






	}

}
