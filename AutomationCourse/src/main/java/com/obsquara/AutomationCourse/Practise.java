package com.obsquara.AutomationCourse;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practise {
    public WebDriver driver ;
    public void initilizeBrowser() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\anjan\\git\\Automation\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe");
    	ChromeOptions chromeOptions = new ChromeOptions();
   	    chromeOptions.addArguments("--remote-allow-origins=*");
   	    driver = new ChromeDriver(chromeOptions);
        driver.get("http://demo.guru99.com/test/selenium-xpath.html");
    }
    public void driverQuit() {
    	driver.quit();
    }
    public void contains() {
     driver.findElement(By.xpath("//input[contains(@name,'btn')]"));	
    }
	public static void main(String[] args) {
	Practise practise =new Practise();
	practise.initilizeBrowser();
	practise.contains();
	practise.driverQuit();
	}

}
