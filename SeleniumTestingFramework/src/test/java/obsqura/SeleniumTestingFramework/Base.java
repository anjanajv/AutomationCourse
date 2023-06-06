package obsqura.SeleniumTestingFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {
 public WebDriver driver;
 @BeforeMethod
 public void intializeBrowser() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjan\\eclipse-workspace\\SeleniumTestingFramework\\src\\main\\java\\Resources\\chromedriver.exe");
	 ChromeOptions chromeOptions = new ChromeOptions();
	 chromeOptions.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(chromeOptions);
	 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
 }
 @AfterMethod
 public void driverQuit() {
	   driver.quit();
 }
}
