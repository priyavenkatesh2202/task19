package task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GuviRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//open the browser
		
		WebDriver driver = new ChromeDriver();
		
		//launch the URL
		
		driver.get("https://www.guvi.in/register");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
				//possible locators for FullName
				
		
		driver.findElement(By.id("name")).sendKeys("Priya Venkatesh");
		//driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("mithra");
		
		
		
		
				// possible locators for Email ID
		
		//driver.findElement(By.id("email")).sendKeys("priyavenkatesh2202@gmail.com");
		//driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("priyavenkatesh2202@gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("praveen12@gmail.com");
		
		
				//possible locators for password
		
		driver.findElement(By.id("password")).sendKeys("space12");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("space123");
		//driver.findElement(By.xpath("//input[contains(text(),'form-control password-err')]")).sendKeys("space1234");
		
		
				//possible locators for mobile number
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9566700270");
		//driver.findElement(By.cssSelector("#mobileNumber")).sendKeys("9566700270");
		//driver.findElement(By.xpath("//input[@class='form-control countrycode-left']")).sendKeys("9566700270");
		
		
		
				//possible locators for sign up button
		
		driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'btn signup-btn')]")).click();
		
		//driver.findElement(By.linkText("Sign Up")).click();
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		
				// possible locators to select current profile field
		
		
		Select fil = new Select (driver.findElement(By.id("profileDrpDwn")));
		fil.selectByVisibleText("Looking for a career");
		
		//driver.findElement(By.xpath("//select[@class='form-control']")).click();
		//option[contains(text(),'Looking for a career')]
		
		
		
				// possible locators to select the your degree field
		
		Select file = new Select (driver.findElement(By.id("degreeDrpDwn")));
		file.selectByVisibleText("B.E. / B.Tech. EEE");
		//driver.findElement(By.xpath("(//select[@class='form-control'])[2]")).click();
		//option[contains(text(),'B.E. / B.Tech. EEE')]
		
		
		
				//possible locators to enter the passed out year
		
		driver.findElement(By.id("year")).click();
		//driver.findElement(By.xpath("//input[@type='text']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Enter year']")).click();
		//driver.findElement(By.xpath("//input[@class='form-control']")).click();
		
		Thread.sleep(15000);
		
		
				// possible locators to click on submit button
		
		
		driver.findElement(By.id("details-btn")).click();
		//driver.findElement(By.xpath("//a[@class='btn details-btn']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'btn signup-btn')]")).click();
		//driver.findElement(By.linkText("Submit")).click();
		
		
		System.out.println("signed up successfully");
	
		
		
	}

}
