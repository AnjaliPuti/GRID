package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class FirefoxGridTest {

	@Test
	public void google() throws Exception{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\anjal\\Documents\\geckodriver-v\\geckodriver.exe");
		
		
		 DesiredCapabilities cap = DesiredCapabilities.firefox();
		 cap.setBrowserName("firefox");
         cap.setPlatform(Platform.WINDOWS);
//         cap.setVersion("3.6");
       
		 FirefoxOptions options = new FirefoxOptions();
		 options.setCapability("marionette", true);
		 options.merge(cap);
		 options.setCapability("acceptInsecureCerts", true);
		 options.setLogLevel(FirefoxDriverLogLevel.TRACE);
		 String hubUrl="http://localhost:4455/wd/hub";
		 
    	 WebDriver driver = new RemoteWebDriver(new URL(hubUrl),cap);
//		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.freecrm.com");
		 System.out.println(driver.getTitle());		 
	}

}
