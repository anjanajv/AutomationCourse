package com.obsquara.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestNG {
   public WebDriver driver;
   
   @BeforeTest
   public void intilaizeBrowser() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\anjan\\git\\Automation\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe");
	 ChromeOptions chromeOptions = new ChromeOptions();
	 chromeOptions.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(chromeOptions);
     driver.get("https://www.amazon.in");
     driver.manage().window().maximize();
 }
   @AfterTest
   public void driverQuit() {
	   driver.quit();
   }
   public void driverClose() {
	   driver.close();
   }
   public void getTitle() {
	   String title = driver.getTitle();
   }
   public void getPageSource() {
	  String pageSource = driver.getPageSource(); 
   }
   public void getUrl() {
	   String expectedUrl="https://www.amazon.in/";
	   String url =driver.getCurrentUrl();
	   if(expectedUrl.equals(url)) {
		   System.out.println("TC Pass");
	   }
   }
  
 
 
}