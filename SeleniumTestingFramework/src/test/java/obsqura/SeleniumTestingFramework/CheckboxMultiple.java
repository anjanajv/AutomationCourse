package obsqura.SeleniumTestingFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckboxMultiple extends Base{
	/*
@Test
public void multipleEnable() {
	driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
	WebElement selectAllButton = driver.findElement(By.xpath("//input[@value='Select All']"));
	List <WebElement> checkBoxList = driver.findElements(By.xpath("//input[@class=\"check-box-list\"]"));
	 selectAllButton.click();
	 for(WebElement checkBoxListButton:checkBoxList) {
		 if(selectAllButton.isEnabled()) {
			 boolean checkBoxListButtonIsSelected = checkBoxListButton.isSelected();
		 }
	 }
}*/
@Test
public void multipleDisable() {
	driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
	WebElement selectAllButton = driver.findElement(By.xpath("//input[@value='Select All']"));
	WebElement unselectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
	List <WebElement> checkBoxList = driver.findElements(By.xpath("//input[@class='check-box-list']"));
	 selectAllButton.click();
	 unselectAllButton.click();
	 for(WebElement checkBoxListButtonUnSelct:checkBoxList) {
		 if(unselectAllButton.isSelected()){
			 boolean checkBoxListButtonIsSelected = checkBoxListButtonUnSelct.isSelected();
		 }
	 }
}
}
