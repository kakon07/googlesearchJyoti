package google_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC001 {
	WebDriver driver = new FirefoxDriver();
	
	@BeforeMethod
	public void openBrowser(){
		System.out.println("this is open browser");
		driver.get("https://www.google.com/");
	}
    @Test
    public void Tesst_1() throws InterruptedException{
    	System.out.println("this is test 001 ");
    	driver.findElement(By.name("q")).sendKeys("dhaka university");
    	driver.findElement(By.name("btnK")).submit();
    	Thread.sleep(5000);
    	
    }
    @AfterTest
    public void closingBrowser(){
    	driver.close();
    }
}

