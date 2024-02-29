package OrangeHRM.miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Report{
  @Test
  public void reportmethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
	  		
	  	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	  		
	  	  driver.manage().window().maximize();
	  	  
	  	  Thread.sleep(500);
	  	  
	  	  WebElement usernameinput = driver.findElement(By.xpath("//input[@name = 'username']"));
	  	  
	        WebElement passwordinput = driver.findElement(By.xpath("//input[@name = 'password']"));
	        
	        WebElement loginbutton = driver.findElement(By.xpath("//button[@type = 'submit']"));
	        
	        usernameinput.sendKeys("Admin");
	        
	        Thread.sleep(500);
	  	  
	        passwordinput.sendKeys("admin123");
	        
	        Thread.sleep(500);
	  	  
	        loginbutton.click();
	        
	        Thread.sleep(500);
	        
	         navigateToAnotherPage("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
	  	  
	  	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
	  	  
	        driver.manage().window().maximize();
	        
	  	  
	  	  Thread.sleep(500);
	  	  
	  	  WebElement MyInfo = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]/span[1]"));
	  	  
	  	   MyInfo.click();
	  	  
	        navigateToAnotherPage("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewReportToDetails/empNumber/7");
	        
	        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewReportToDetails/empNumber/7");
	        
	        driver.manage().window().maximize();
	  	  
	  	  Thread.sleep(500);
	  	  
  }

private void navigateToAnotherPage(String string) {
	// TODO Auto-generated method stub
	
}
}