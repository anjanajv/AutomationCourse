package com.obsquara.AutomationCourse;

import org.openqa.selenium.By;

public class TimeCalculation extends Base {
   
    	public void locateById() {
    	driver.findElement(By.id("twotabsearchtextbox"));
    	}
    	public void loactionByXpath() {
    	driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in'] "));
    	}
    	public void locateByCssSelector() {
    	driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
    	}
    	
    
	public static void main(String[] args) {
		TimeCalculation timecalculation = new TimeCalculation();
		timecalculation.intilaizeBrowser();
		timecalculation.locateById();
		timecalculation.locateByCssSelector();
		timecalculation.loactionByXpath();
		timecalculation.driverQuit();

	}

}
