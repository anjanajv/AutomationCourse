package obsqura.SeleniumTestingFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MenuSelecetion1 extends Base{
	@Test
	public void menu() {
		String expectedValueForMenuSelection="Radio Buttons Demo";
		List<WebElement> multiplelist = driver.findElements(By.xpath("//li[@class='list-group-item']"));
		//int count=multiplelist.size();
		for(WebElement urlLink: multiplelist) {
			String actualValueForMenuSelection = urlLink.getText();
			if(expectedValueForMenuSelection.equals(actualValueForMenuSelection)) {
			urlLink.click();
			break;
			}
			}
	    }
	}


