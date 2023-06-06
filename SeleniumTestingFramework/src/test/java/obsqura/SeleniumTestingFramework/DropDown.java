package obsqura.SeleniumTestingFramework;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends Base {
@Test
public void dropDownUsingSelectClass() {
driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");	
WebElement dropDownCOuntry = driver.findElement(By.xpath("//select[@name='country']"));
Select select = new Select(dropDownCOuntry);
select.selectByIndex(2);
select.selectByValue("AUSTRALIA");
select.selectByVisibleText("BAHRAIN");
//select.deselectAll();
}
@Test
public void dropDownMultipleSelect() {
	driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");		
	 WebElement dropDownMultipleSelect = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
	 WebElement getAllSelectedButton = driver.findElement(By.xpath("//button[@id='button-all']"));
	 WebElement displayOfSelectedColors = driver.findElement(By.xpath("//div[@id='message-two']"));
	 Select select = new Select(dropDownMultipleSelect);
	 boolean isDropDownMultiple = select.isMultiple();
	 select.selectByIndex(0);
	 select.selectByIndex(1);
	 select.selectByIndex(2);
	 select.deselectAll();
	 }	  
@Test
public void selectInputDemoDropDown() {
	driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
	String expectedSlectedColor = "Green";
	WebElement dropDownSelectColor = driver.findElement(By.xpath("//select[@id='single-input-field']"));
	WebElement displayValueOfSelectedColor = driver.findElement(By.xpath("//div[@id='message-one']"));
	Select select = new Select(dropDownSelectColor);
	select.selectByVisibleText("Green");
	String actualresult = displayValueOfSelectedColor.getText();
	String splitString = actualresult.replace("Selected Color :", "");
	String actualSelectedColor = splitString.trim();
	assertEquals(expectedSlectedColor,actualSelectedColor,"Expected color" +expectedSlectedColor +"is not selected");
	System.out.print("test Case Pass");
	}
@Test
public void selectAColorFromMultipleDropDownList() {
	driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");	
	String expectedColorOptionToSelect = "Yellow";
	 WebElement dropDownMultipleSelect = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
	 Select select = new Select(dropDownMultipleSelect);
	 List<WebElement>options = select.getOptions();
	 for(WebElement selectOptions : options) {
		String actualColorOptionselcted = selectOptions.getText(); 
		if(expectedColorOptionToSelect.equals(actualColorOptionselcted)) {
			selectOptions.click();
			break;
		}
		
	 }
	 
}
@Test
public void selectAllColorsFromMultipleDropDownList() {
	driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
	 WebElement colordropDownMultipleSelect = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
	 WebElement getAllSelectedButton = driver.findElement(By.xpath("//button[@id='button-all']"));
	 WebElement displayOfSelectedColors = driver.findElement(By.xpath("//div[@id='message-two']"));
	 Select select = new Select(colordropDownMultipleSelect);
	 List<WebElement>options = select.getOptions();
	 for(WebElement selectOptions : options) {
	 selectOptions.click();
	 }
}
@Test
public void dropDownWithoutUsingSelectClass() {
 driver.navigate().to("https://www.selenium.dev/");
 String expectedLanguageOption="中文简体";
 WebElement selectDropDownBox = driver.findElement(By.xpath("//li[contains(@class,'nav-item dropdown d-none d-lg-block')]//child::a[@id='navbarDropdown']"));
 selectDropDownBox .click();
 List<WebElement> languageDropDownListOption = driver.findElements(By.xpath("//div[@aria-labelledby='navbarDropdownMenuLink']//child::a[@class='dropdown-item']"));
 for(WebElement optionsToSelect :languageDropDownListOption) {
	 String selectedLanguageOption = optionsToSelect.getText();
	 if(expectedLanguageOption.equals(selectedLanguageOption)) {
		 optionsToSelect.click() ;
		 break;
	 }
 }
}
}
