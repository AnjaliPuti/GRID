package GridTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://myworkspace.barclays.com/vpn/index.html");

	}

}
