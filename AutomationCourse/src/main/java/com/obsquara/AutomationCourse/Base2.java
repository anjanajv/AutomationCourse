package com.obsquara.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base2 {
	 //public WebDriver driver;
	   public void intilaizeBrowser() {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\anjan\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resources\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.amazon.in");
		 driver.quit();
	 }

	public static void main(String[] args) {
		 Base2 base = new Base2();
		 base.intilaizeBrowser();

	}

}
