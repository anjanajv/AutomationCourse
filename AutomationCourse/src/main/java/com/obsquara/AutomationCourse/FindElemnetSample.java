package com.obsquara.AutomationCourse;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.w3c.dom.ls.LSOutput;

public class FindElemnetSample extends Base {
	
	   
	public void findElementMethod() {
	driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");	
	List<WebElement> list1 = driver.findElements(By.tagName("div"));
	System.out.println(list1);
	int listcount=list1.size();
	
	
	}
	
	public void findMultipleElements() {
    driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	List<WebElement> multiplelist = driver.findElements(By.xpath("//li[@class='list-group-item']"));
	int count = multiplelist.size();
	System.out.println("No of elements:"+count);
	
    }
	
	
	
	public static void main(String[] args) {
		FindElemnetSample findelementsample= new FindElemnetSample();
		findelementsample.intilaizeBrowser();
		findelementsample.findElementMethod();
		//findelementsample.findMultipleElements();
		findelementsample.driverQuit();
	}

}
