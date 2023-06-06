package obsqura.SeleniumTestingFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends Base {
	
	@Test
	public void verfiySuccessMessageIsAvailableWhenCLickOnCheckbox() {
		String expectedSingleCheckBoxSuccessMessage = "Success - Check box is checked";
		MenuSelection menuselection = new MenuSelection();
	    menuselection.menuListSelection("Checkbox Demo",driver);
		 WebElement singleCheckboxDemoButton = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		 WebElement singleCheckBoxDemoText = driver.findElement(By.xpath("//div[@id='message-one']"));
		 singleCheckboxDemoButton.click();
		 boolean  singleCheckboxDemoButtonIsSelected=singleCheckboxDemoButton.isSelected();
		 String actualSingleCheckBoxSuccessMessage = singleCheckBoxDemoText.getText();
		 assertEquals(expectedSingleCheckBoxSuccessMessage,actualSingleCheckBoxSuccessMessage,"success message is not found when clicked on check box");
		 System.out.println("Test Case Pass");
	}
  @Test
  public void verifyFirstTwoButtonInMultipleCheckBoxDemoIsSelectedByCLick() {
  MenuSelection menuselection = new MenuSelection();
  menuselection.menuListSelection("Checkbox Demo",driver);
  WebElement checkBoxOne =driver.findElement(By.xpath("//input[@id='check-box-one']"));
  WebElement checkBoxTwo =driver.findElement(By.xpath("//input[@id='check-box-two']"));
  checkBoxOne.click();
  boolean checkBoxOneIsSelected = checkBoxOne.isSelected();
  checkBoxTwo.click();
  boolean checkBoxTwoIsSelected = checkBoxTwo.isSelected();
  
}
  @Test
  public void verifyByCLickingSelectAllButtonCanEnableAllTheCheckBoxButtons() {
	 MenuSelection menuselection = new MenuSelection();
	 menuselection.menuListSelection("Checkbox Demo",driver);
	 WebElement selectAllButton = driver.findElement(By.xpath("//input[@value='Select All']"));
	 List <WebElement> checkBoxList = driver.findElements(By.xpath("//input[@class=\\\"check-box-list\\\"]"));
	 selectAllButton.click();
	 for(WebElement checkBoxListButton:checkBoxList) {
		 if(selectAllButton.isEnabled()) {
			 boolean checkBoxListButtonIsSelected = checkBoxListButton.isSelected();
		 }
	 }
	  }
  @Test
  public void verifyByClickingUnselectAllButtonCanDisableAllTheCheckBoxButtons() {
	  MenuSelection menuselection = new MenuSelection();
	  menuselection.menuListSelection("Checkbox Demo",driver);
	  WebElement selectAllButton = driver.findElement(By.xpath("//input[@value='Select All']"));
	  WebElement unselectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		List <WebElement> checkBoxList = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		 selectAllButton.click();
		 boolean unselectAllButtonIsEnabled =unselectAllButton.isEnabled(); 
		 unselectAllButton.click();
		 for(WebElement checkBoxListButtonUnSelct:checkBoxList) {
			 //if(unselectAllButton.isSelected()){
				 //boolean checkBoxListButtonIsSelected = checkBoxListButtonUnSelct.isSelected();
				 boolean checkBoxListButtonIsSelected = unselectAllButton.isSelected();
			 }
	
		 }
	}
  

