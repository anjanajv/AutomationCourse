package obsqura.SeleniumTestingFramework;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class MenuSelection extends Base {	
@Test
public void menuListSelection(String expectedValueForMenuSelection, WebDriver driver) {
	
	WebElement menuSelection = driver.findElement(By.xpath("//ul[contains(@class,'list-group-flush')]"));
	List<WebElement> menuSelectionList = menuSelection.findElements(By.xpath("//li[@class='list-group-item']"));
	for(WebElement urlLink: menuSelectionList) {
		String actualValueForMenuSelection = urlLink.getText();
		if(expectedValueForMenuSelection.equals(actualValueForMenuSelection)) {
		urlLink.click();
		break;
		}
		}
    }

}

	
	
	
	
	


