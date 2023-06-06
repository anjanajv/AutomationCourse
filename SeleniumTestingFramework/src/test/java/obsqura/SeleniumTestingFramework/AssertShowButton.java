package obsqura.SeleniumTestingFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AssertShowButton extends Base{
@Test
public void VerifyShowMessageButton() {
	int expectedshowMessageButtonHeight=38;
	int expectedshowMessageButtonWidth=136;
	String expectedgetTextShowMessageButtonColor="rgba(255, 255, 255, 1)";
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	boolean isShowMessageButtonDisplay = showMessageButton.isDisplayed(); 
	String actualgetTextShowMessageButtonColor = showMessageButton.getCssValue("color");
	Dimension showMessageButtonSize = showMessageButton.getSize();
	int actualshowMessageButtonHeight =showMessageButtonSize.height;
	int actualshowMessageButtonWidth =showMessageButtonSize.width;
	assertTrue(isShowMessageButtonDisplay,"button is not displayed");
	assertEquals(expectedgetTextShowMessageButtonColor,actualgetTextShowMessageButtonColor,"color of showmessage button is "+expectedgetTextShowMessageButtonColor);
	assertEquals(expectedshowMessageButtonHeight,actualshowMessageButtonHeight,"height of showmessage button is "+expectedshowMessageButtonHeight);
	assertEquals(expectedshowMessageButtonWidth,actualshowMessageButtonWidth,"width of showmessage button is"+expectedshowMessageButtonWidth);
}
}
