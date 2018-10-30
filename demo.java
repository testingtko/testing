package Automaion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo {
WebDriver driver;
	
	@Test(priority=1,description="Assert")
	public void TitlePAgeValidation() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		
		driver.get("http://learn-automation.com/");
		
		Thread.sleep(2000);
		
		//Actual Title
		
		//String page_Title=driver.getTitle();
		
		String page_Title=driver.getPageSource();
		
		System.out.println("Title of the page is "+ page_Title);
		
		//Expected Title
		
		String Expected_title="Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step";
		
		//Assert.assertEquals(page_Title, Expected_title);
		
		Assert.assertTrue(page_Title.contains("Selenium WebDriver tutorial"));

		System.out.println("Test Sucessfull");
		 
		 
		Thread.sleep(2000);

		
		
		/*driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		
		
		Thread.sleep(5000);
		
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("identifierId")).sendKeys("mailtotripurari1991@gmail.com");
	    
	    driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	    
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ojhaji@1991");
	    
	    driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	    
	    Thread.sleep(20000);
	    
	    
	    
	    System.out.println("gmail logged in successfully");
*/
		driver.quit();
		
	}
}
