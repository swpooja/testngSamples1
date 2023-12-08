package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Annotations {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
	}

  @Test
  public void javaSearchTest() {
	  
		driver.get("https://www.google.com/");
		System.out.println("Main title.."+driver.getTitle());
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.getTitle(), "Google1");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java Tutorial ");
		srcBox.submit();
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
		driver.close();
		
		
  }
//  @Test
//  public void CucumberSearchTest() {
//  
//	driver.navigate().to("https://www.google.com/");
//	System.out.println("Main title.."+driver.getTitle());
//	WebElement srcBox = driver.findElement(By.id("APjFqb"));
//	srcBox.sendKeys("Cucumber Tutorial ");
//	srcBox.submit();
//	System.out.println("cucumber : "+driver.getTitle());
//	Assert.assertEquals(driver.getTitle(), "Cucumber Tutorial - Google Search");
//	driver.close();
//}
//  @AfterMethod
//  public void Test() {
//	  //driver.navigate().to("https://www.google.com/");
//	  driver.close();
//  }
}
