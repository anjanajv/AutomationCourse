package com.obsquara.AutomationCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
    
	public void loactionByXpath() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));	
		driver.findElement(By.xpath("//a[@href='/ref=nav_logo']"));
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']"));
		driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']"));
		driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
		driver.findElement(By.xpath("//img[@title='Flipkart']"));
		driver.findElement(By.xpath("//a[@class='_3-PJz-']"));
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@aria-label='Amazon.in']"));
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		driver.navigate().to("https://www.limeroad.com/feed?feed_kyc=true&top_level=Women");
		driver.findElement(By.xpath("//a[@id='home_category']"));
		driver.findElement(By.xpath("//a[@id='women_category']"));
		driver.findElement(By.xpath("//div[@class='taL ']"));
		driver.findElement(By.xpath("//div[@id='main-carousel-feed-0']"));
		driver.navigate().back();
		
		}
	    public void axesMethods() {
	    driver.findElement(By.xpath("(//a[contains(text(),'miniTV')])[1]"))	;
	    driver.findElement(By.xpath("//input[contains(@class,'nav-progressive-attribute')and@id='twotabsearchtextbox']"));	
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'and@autocomplete='off']"));
	    WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'or@autocomplete='off']"));
	    driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtext')]"));
	    
	    //and
	    driver.findElement(By.xpath("//a[@class='nav-a  ' and text()='Amazon miniTV']"));
	    driver.findElement(By.xpath("//a[@id='nav-logo-sprites' and @aria-label='Amazon.in']"));
	    driver.findElement(By.xpath("//span[@class='nav-line-1' and text()='Returns']"));
	    
	    //or
	    driver.navigate().to("https://demo.guru99.com/test/selenium-xpath.html");
	    driver.findElement(By.xpath("//input[@type='sumbit' or contains(@name,'btn') or @value='LOGIN']"));
	    driver.findElement(By.xpath("//input[@type='reset' or @value='RESET']"));
	    driver.findElement(By.xpath("//input[@name='uid'='reset' or @fdprocessedid='1waq3l']"));
	    driver.navigate().back();
	    
	    //start-with
	    driver.findElement(By.xpath("//span[starts-with(@id,'nav-link-account')]"));
	    driver.findElement(By.xpath("//a[starts-with(@id,'nav-global')]"));
	    driver.findElement(By.xpath("//div[starts-with(@id,'glow-ingress')]"));
	    
	    }
	    public void axesMethodTraverse() {
	    	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//following::div[@id='nav-tools']"));
	    	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//preceding::div[@id='nav-packard-glow-loc-icon']"));
	    	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//parent::div[@class='nav-search-field ']")); 
		    driver.findElement(By.xpath("//a[@href='/ref=nav_logo']//child::span[@id='logo-ext']"));
		    driver.findElement(By.xpath("//a[@href='/ref=nav_logo']//ancestor::div[@id='nav-belt']"));
		    driver.findElement(By.xpath("//a[@href='/ref=nav_logo']//descendant::span[@id='logo-ext']"));
		    driver.findElement(By.xpath("//span[@id='logo-ext']//following-sibling::span"));
		    
		    //following
		    driver.navigate().to("http://groceryapp.uniqassosiates.com/sign-in");
		    driver.findElement(By.xpath("//button[@class='search-btn']//following::p[@class='frgt ']"));
		   // driver.findElement(By.xpath("//div[@class='abcRioButtonContentWrapper']//following::a[@class='fbe']"));
		    driver.findElement(By.xpath("//select[@name='srch']//following::option[@value='pr']"));
		    driver.navigate().back();
		    
		    //Preceding
		    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']//preceding::input[@id='twotabsearchtextbox']"));
	        driver.findElement(By.xpath("//span[@class='nav-line-2 ']//preceding::span[@class='icp-nav-link-inner']"));
	        //driver.findElement(By.xpath("//span[@id='glow-ingress-line2']//preceding::div[@id='glow-ingress-block']"));
	    //Parent
	        driver.findElement(By.xpath("//a[@id='nav-logo-sprites']//parent::div[@id='nav-logo']"));
	        driver.findElement(By.xpath("//a[@class='nav-a  ']//parent::div[@id='nav-xshop']"));
	        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']//parent::span[@id='nav-search-submit-text']"));
	    //child
	        driver.findElement(By.xpath("//select[@id='searchDropdownBox']//child::option[@value='search-alias=baby']"));
	        driver.findElement(By.xpath("//span[@class='nav-line-2']//child::div"));
	        driver.findElement(By.xpath("//a[@id='nav-cart']//child::div[@id='nav-cart-count-container']"));
	    
	    //ancestor
	        
	        driver.findElement(By.xpath("//select[@name='url']//ancestor::div[@class='nav-left']"));
	       driver.findElement(By.xpath("//span[@id='glow-ingress-line1']//ancestor:: div[@id='nav-global-location-slot']"));
	        driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']//ancestor:: div[@id='nav-main']"));
	    //descendant
	        driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']//descendant:: option[@value='search-alias=alexa-skills']"));
	        driver.findElement(By.xpath(""));
	        driver.findElement(By.xpath(""));
	    
	    }
	    
	    
	    
	    
		
	public void indexing() {
		driver.findElement(By.xpath("(//div[@class='nav-fill'])[3]"));
	}
	
	
	
	public static void main(String[] args) {
	Xpath xpath = new Xpath();
	
	xpath.intilaizeBrowser();
	//xpath.loactionByXpath();
	//xpath.indexing();
	//xpath.axesMethods();
	xpath.axesMethodTraverse();
	xpath.driverQuit();
	

	}

}
