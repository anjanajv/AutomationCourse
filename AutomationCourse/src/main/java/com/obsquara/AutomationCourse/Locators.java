package com.obsquara.AutomationCourse;

import org.openqa.selenium.By;

public class Locators extends Base{

	public void locateById() {
	 driver.findElement(By.id("twotabsearchtextbox"));
	 driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	 driver.findElement(By.id("nav-link-accountList"));
	 driver.findElement(By.id("nav-logo-sprites"));
	 driver.navigate().to("https://www.selenium.dev/");
	 driver.findElement(By.id("announcement-banner"));
	 driver.navigate().back();
	 driver.findElement(By.id("nav-search-submit-button"));
	}
	
	public void locateByClassName() {
	driver.findElement(By.className("hm-icon-label"));
	driver.navigate().to("https://www.flipkart.com/");
	driver.findElement(By.className("_3704LK"));
	driver.findElement(By.className("_3-PJz-"));
	driver.navigate().back();
	driver.findElement(By.className("nav-imageHref"));
	driver.navigate().forward();
	driver.findElement(By.className("_1_3w1N"));
	driver.findElement(By.className("exehdJ"));
	driver.navigate().back();
	}
	public void locateByName() {
	driver.findElement(By.name("glow-validation-token"));
	driver.findElement(By.name("keywords"));
	driver.navigate().to("https://www.youtube.com/watch?v=yu8uvWl0PgI");
	driver.findElement(By.name("search_query"));
	driver.navigate().back();
	driver.findElement(By.name("url"));
	driver.navigate().to("https://www.flipkart.com/");
	driver.findElement(By.name("q"));
	driver.navigate().back();
	}
	 public static void main(String args[]) {
		 Locators locators= new Locators();
		 locators.intilaizeBrowser();
		 locators.locateById();
		 locators.locateByClassName();
		 locators.locateByName();
		 locators.driverQuit();
	 }
}
