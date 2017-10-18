package ex;


import javax.management.openmbean.OpenDataException;

import org.openqa.selenium.Capabilities; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HelloWorld 
{

	static WebDriver driver;
	public static void main(String args[])
	{
		
		openChromeBrowser();
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
	}

	
	public   static void openChromeBrowser()
	{ 
		 
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver","D:\\MyFiles_Chanagonda\\UpdatedVersions\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--test-type");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(capabilities);
	//	driver.manage().window().maximize();
		
		 
	}
}
 
 