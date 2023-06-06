package obsqura.SeleniumTestingFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassDemo extends Base{
@Test
	public void actionClassWorking() throws InterruptedException {
	driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");	
	WebElement dragButton1 = driver.findElement(By.xpath("(//span[@draggable='true'])[1]"));
	WebElement destination = driver.findElement(By.xpath("//div[@id='mydropzone']"));
	Actions action = new Actions(driver);
	action.moveToElement(dragButton1).build().perform();
	action.moveToElement(dragButton1).click();
	
	action.doubleClick(dragButton1).perform();
	Thread.sleep(2000);
	action.contextClick(dragButton1).perform();
	action.dragAndDrop(dragButton1, destination).build().perform();
	}
}