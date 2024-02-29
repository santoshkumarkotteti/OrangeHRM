package OrangeHRM.miniproject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Immigration {
  @Test
  public void Immigrationmethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
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
	  
	  WebElement ImmmigrationMyInfo = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]/span[1]"));
	  
	  ImmmigrationMyInfo.click();
	  
	  Thread.sleep(500);
	  
      navigateToAnotherPage("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewImmigration/empNumber/7");
      
      driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewImmigration/empNumber/7");
      
      driver.manage().window().maximize();
	  
	  Thread.sleep(500);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  WebElement ImmigrationInput = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
	  
	  ImmigrationInput.click();
	  
	  Thread.sleep(500);
	  
	  WebElement addbutton = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
		addbutton.click();
		System.out.println("Button Clicked");
		
		Thread.sleep(500);
		
		//select passport or visa
		WebElement radio1 = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]"));
		radio1.click();
		System.out.println("Radio Button Clicked");
		Thread.sleep(500);
		
		//enter number
		WebElement number1 = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		number1.click();
		number1.sendKeys("123456");
		System.out.println("Number Button Clicked");		
		Thread.sleep(500);
		
		//issued date
		WebElement issdate = driver.findElement(By.xpath("(//input[@placeholder=\'yyyy-dd-mm\'])[1]"));
		issdate.click();
		issdate.sendKeys("2023-28-02");
		System.out.println("Issue Date Selected");
		Thread.sleep(500);
		
		//expirydate
		WebElement expdate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
		expdate.click();
		expdate.sendKeys("2025-28-02");
		System.out.println("Expiry Date Selected");		
		Thread.sleep(500);

		
		//eligiblestatus
		WebElement eligiblestatus = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[4]"));
		eligiblestatus.click();
		eligiblestatus.sendKeys("yes");
		System.out.println("Eligible Button Clicked");		
		Thread.sleep(500);

		//comments
		WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
		comments.click();
		comments.sendKeys("Hello Comments");
		System.out.println("Comments Button Clicked");		
		Thread.sleep(500);
		
		//savebutton
		WebElement savebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		savebutton.click();		
		System.out.println("Data Saved");
		
		Thread.sleep(500);
		
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1200)", "");
		
		js.executeScript("window.scrollBy(0,-400)", "");
		
		//click add to attach file
		WebElement Addattach = driver.findElement(By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"])[2]"));
		Addattach.click();
		System.out.println("Clicked on Add Attachemnts");
		
		//upload file 
		WebElement Browse = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		Browse.sendKeys("C:\\Users\\DELL\\Documents\\Assignment Day - 12.pdf");

		//comment
	    WebElement comment = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
		comment.click();
		comment.sendKeys("File Uploaded");
		System.out.println("Box");
		
		//save file

//	driver.quit();
	  	
  }

private void navigateToAnotherPage(String string) {
	// TODO Auto-generated method stub
	
}
}