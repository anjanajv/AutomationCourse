package obsqura.SeleniumTestingFramework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends Base {
	
@Test
public void verifyradioButtonDemo() {
	 MenuSelection menuselection = new MenuSelection();
	 menuselection.menuListSelection("Radio Buttons Demo",driver);
	 String expectedradioButtonShowSelectedValueTextMessage="Radio button 'Male' is checked";
	 WebElement radioButtonMale = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	 WebElement radioButtonShowSelectedValue = driver.findElement(By.xpath("//button[@id='button-one']"));
	 WebElement radioButtonShowSelectedValueTextMessage= driver.findElement(By.xpath("//div[@id='message-one']"));
	 radioButtonMale.click();
	 radioButtonShowSelectedValue.click();
	 boolean radioButtonMaleIsSelected = radioButtonMale.isSelected();
	 String radioButtonShowSelectedValueText = radioButtonShowSelectedValueTextMessage.getText();
	 assertEquals(expectedradioButtonShowSelectedValueTextMessage,radioButtonShowSelectedValueText,"Text message" +expectedradioButtonShowSelectedValueTextMessage + "is different");
	 
}
@Test
public void verifygroupRadioButtonDemo() {
	 MenuSelection menuselection = new MenuSelection();
	 menuselection.menuListSelection("Radio Buttons Demo",driver);
	 String expectedTextMessageOfGroupRadioButton = "Gender : Female\nAge group: 19 to 44";
	 WebElement groupRadioButtonPatientsFemaleGender= driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
	 WebElement groupRadioButtonPatientAgeGroup= driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
	 WebElement groupRadioButtonGetResult = driver.findElement(By.xpath("//button[@id='button-two']"));
	 WebElement groupRadioButtonGetResultText= driver.findElement(By.xpath("//div[@id='message-two']"));
	 groupRadioButtonPatientsFemaleGender.click();
	 groupRadioButtonPatientAgeGroup.click();
	 groupRadioButtonGetResult.click();
	 String groupRadioButtonGetResultTextMessage= groupRadioButtonGetResultText.getText();
	 assertEquals(expectedTextMessageOfGroupRadioButton,groupRadioButtonGetResultTextMessage,"Text message" +expectedTextMessageOfGroupRadioButton +"is not found ");
	 }
}
