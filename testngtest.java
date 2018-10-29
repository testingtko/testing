package Automaion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testngtest {
	WebDriver driver;
	
	@Test
	public void validateerrormessage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
	 
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(2000);
		
		String actual_result=driver.findElement(By.xpath(".//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]")).getText();
	    
		String expected_result="Enter an email or phone number";
		
		Assert.assertEquals(actual_result, expected_result);
		
		Thread.sleep(1000);
		
		driver.quit();
		


	}
	
}
