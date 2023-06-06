package obsqura.SeleniumTestingFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alerts extends Base{
@Test
	public void simpleAlert() {
	driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
	WebElement clickMeButton = driver.findElement(By.xpath("//button[contains(@class,'btn btn-success')]"));
	clickMeButton.click();
	driver.switchTo().alert().accept();
	}
@Test
    public void dismissAlert() {
    	driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
    	WebElement clickMeButton2 = driver.findElement(By.xpath("//button[contains(@class,'btn btn-warning')]"));
    	clickMeButton2.click();
    	String alertmessagetext=driver.switchTo().alert().getText();
    	driver.switchTo().alert().dismiss();
    	}
@Test
public void promptBoxAlert() {
	driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
	WebElement promptBoxClickButton = driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
	promptBoxClickButton.click();
	driver.switchTo().alert().sendKeys("anjana");
	driver.switchTo().alert().accept();
}
}
