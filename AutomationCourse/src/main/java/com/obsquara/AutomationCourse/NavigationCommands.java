package com.obsquara.AutomationCourse;

public class NavigationCommands extends Base {
	public void navigate() {
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	public static void main(String args[]) {
		NavigationCommands navigationcommands = new NavigationCommands();
		navigationcommands.intilaizeBrowser();
		navigationcommands.navigate();
		navigationcommands.driverQuit();
	}
    
}
