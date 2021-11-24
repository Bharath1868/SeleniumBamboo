package TestSelenium.TestSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest 
{
	public String baseUrl = "https://wac.das.myatos.net/portal/pki.jsp";  
	String driverPath = "resources\\chromedriver.exe";  
	public WebDriver driver ;   
	@Test             
	public void sample() {   
		
	System.setProperty("webdriver.chrome.driver", driverPath);  
	driver = new ChromeDriver();
	 
	driver.manage().window().maximize();  
	driver.get(baseUrl);  
	driver.findElement(By.xpath("//button[text()='AUTH']")).click();
	driver.findElement(By.name("com.siemens.dxa.applications.web.authn.challenging.username")).sendKeys("A123456");
	driver.findElement(By.name("com.siemens.dxa.applications.web.authn.challenging.response")).sendKeys("abcde");
	driver.findElement(By.name("com.siemens.dxa.applications.web.authn.challenging.response2")).sendKeys("123456");
	}     
	@BeforeTest  
	public void beforeTest() {    
	System.out.println("before test");  
	}     
	@AfterTest  
	public void afterTest() {  
	driver.quit();  
	System.out.println("after test");  
	}

}

