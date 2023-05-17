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
	public void locateByCssSelector() {
	driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	driver.findElement(By.cssSelector("span.hm-icon-label"));
	driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]"));
	driver.findElement(By.cssSelector("a#nav-hamburger-menu[data-csa-c-slot-id=HamburgerMenuDesktop]"));
	/*tag-id*/
	driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1"));
	driver.findElement(By.cssSelector("div#nav-cart-count-container"));
	driver.findElement(By.cssSelector("span#glow-ingress-line1"));
	driver.findElement(By.cssSelector("a#nav-logo-sprites"));
	driver.findElement(By.cssSelector("input#nav-search-submit-button"));
	//tag-class
	driver.findElement(By.cssSelector("a.nav-imageHref"));
	driver.navigate().to("https://www.flipkart.com/");
	driver.findElement(By.cssSelector("div.exehdJ"));
	driver.findElement(By.cssSelector("input._3704LK"));
	driver.findElement(By.cssSelector("a._1_3w1N"));
	driver.navigate().back();
	driver.navigate().to("https://www.selenium.dev/");
	driver.findElement(By.cssSelector("a.navbar-brand"));
	driver.navigate().back();
	//tag-anyattribute
	driver.findElement(By.cssSelector("select#searchDropdownBox[name=url]"));
	driver.findElement(By.cssSelector("div#pageContent[role=main]"));
	driver.findElement(By.cssSelector("a.nav-imageHref[target=_blank]"));
	
	
	
	}
	public void locateByLinkText() {
	driver.findElement(By.linkText("Sell on Amazon"));
	driver.findElement(By.linkText("Amazon miniTV"));
	driver.findElement(By.linkText("Mobiles"));
	driver.navigate().to("https://www.flipkart.com/");
	driver.findElement(By.linkText("Login"));
	driver.navigate().back();
	driver.findElement(By.linkText("Sell"));
	driver.navigate().to("https://www.selenium.dev/");
	driver.findElement(By.linkText("@diegofmolina"));
	driver.navigate().back();
	}
	public void loacteByPartialLinkText() {
	driver.findElement(By.partialLinkText("Today's"));
	driver.findElement(By.partialLinkText("Best"));
	driver.findElement(By.partialLinkText("Amazon"));
    driver.findElement(By.partialLinkText("Care"));
    driver.findElement(By.partialLinkText("Sign"));
    driver.findElement(By.partialLinkText("miniTV"));
	}
	 public static void main(String args[]) {
		 Locators locators= new Locators();
		 locators.intilaizeBrowser();
		 //locators.locateById();
		// locators.locateByClassName();
		 //locators.locateByName();
		 locators.locateByCssSelector();
		// locators.locateByLinkText();
		 //locators.loacteByPartialLinkText();
		 locators.driverQuit();
	 }
}
