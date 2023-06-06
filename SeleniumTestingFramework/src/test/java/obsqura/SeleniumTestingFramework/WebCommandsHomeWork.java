package obsqura.SeleniumTestingFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebCommandsHomeWork extends BaseHomeWork {
@Test
public void searchBar() {
	WebElement searchbartextfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchbartextfield.sendKeys("iphone14");
	WebElement searchbaricon = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	searchbaricon.click();
}
}
