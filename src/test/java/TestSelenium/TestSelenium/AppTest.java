package TestSelenium.TestSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest 
{
	public String baseUrl = "https://www.javatpoint.com/";  
	String driverPath = "resources\\chromedriver.exe";  
	public WebDriver driver ;   
	@Test             
	public void sample() {   
		
	System.setProperty("webdriver.chrome.driver", driverPath);  
	 DesiredCapabilities cap = new DesiredCapabilities();
     cap.setJavascriptEnabled(true);
	driver = new ChromeDriver(cap);
	 
	driver.manage().window().maximize();  
	driver.get(baseUrl);  
	String URL= driver.getCurrentUrl();  
	System.out.print(URL);  
	String title = driver.getTitle();                  
	System.out.println(title);  
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

