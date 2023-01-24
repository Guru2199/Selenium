package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 //login
		 driver.findElement(By.id("username")).sendKeys("DemoCsr");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestGuruprasad");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Guru prasad");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("GP");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("gettingoutput");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gpm@gmail.com");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("testing");
		 driver.findElement(By.className("smallSubmit")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 
	}

}
