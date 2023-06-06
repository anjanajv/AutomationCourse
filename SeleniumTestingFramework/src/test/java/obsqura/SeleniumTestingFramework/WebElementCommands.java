package obsqura.SeleniumTestingFramework;

import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.util.Random;   
public class WebElementCommands extends Base {
@Test
public void sendKeysSample() {
  WebElement simpleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
  simpleInputTextField.sendKeys("Hello");
  }
@Test
public void clickSample() {
	  WebElement simpleInputTextField  = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	  simpleInputTextField .sendKeys("Hello");
	  WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	  showMessageButton.click();
	  }
@Test
public void clearSample() {
	  WebElement simpleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	  simpleInputTextField.sendKeys("Hello");
	  simpleInputTextField.clear();
	  }
@Test
public void isEnabledSample() {
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement simpleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	boolean isShowMessageButtonEnabled= showMessageButton.isEnabled();
	}
@Test
public void isDisplayed() {
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	boolean isShowMessageButtonDisplay = showMessageButton.isDisplayed(); 
	}
@Test
public void getText() {
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	String showMessageButtonText = showMessageButton.getText();
	}
@Test
public void getAttribute() {
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	String getClassNameShowMessageButton = showMessageButton.getAttribute("class");
	String getTypeNameShowMessageButton = showMessageButton.getAttribute("type");
	}
@Test
public void getCssValue() {
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	String getShowMessageButtonBackgroundColor= showMessageButton.getCssValue("background-color");
	String getTextShowMessageButtonColor = showMessageButton.getCssValue("color");
    }
@Test
public void getLocation() {
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement simpleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	Point simpleInputFieldLocation= simpleInputTextField.getLocation();
	int simpleInputFieldXAxix = simpleInputFieldLocation.x;
	int simpleInputFieldYAxix = simpleInputFieldLocation.y;
	Point showMessageButtonLocation = showMessageButton.getLocation();
	int showMessageButtonXAxix = showMessageButtonLocation.x;
	int showMessageButtonYAxix = showMessageButtonLocation.y;
    }
@Test
public void getSize() {
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	Dimension showMessageButtonSize = showMessageButton.getSize();
	int showMessageButtonHeight =showMessageButtonSize.height;
	int showMessageButtonWidth =showMessageButtonSize.width;
	}
@Test
public void verifyHeightOfShowMessageButton() {
	int expectedshowMessageButtonHeight=38;
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));	
	Dimension showMessageButtonSize = showMessageButton.getSize();
	int actualshowMessageButtonHeight =showMessageButtonSize.height;
	assertEquals(expectedshowMessageButtonHeight,actualshowMessageButtonHeight,"show message heeight is not" + expectedshowMessageButtonHeight);
}
@Test
public void assertSample() {
	String expectedValue ="123";
	String actualValue="123";
	boolean flag=false;
	SoftAssert softassert = new SoftAssert();
	softassert.assertNotEquals(expectedValue,actualValue,"expectedandactualvalues are same");
	softassert.assertFalse(flag,"flag is true");
	softassert.assertAll();
}

@Test
public void verifyTwoInputField() {
	String a="500",b="20";
	int inta=Integer.parseInt(a);
	int intb=Integer.parseInt(b);
	int expectedanswer= inta+intb;
	String finalexpectedanswer= Integer.toString(expectedanswer);
	WebElement enterValueAField = driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement enterValueBField = driver.findElement(By.xpath("//input[@id='value-b']"));
	WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
	WebElement totalDisplay = driver.findElement(By.xpath("//div[@id='message-two']"));
	enterValueAField.sendKeys(a);
	enterValueBField.sendKeys(b);
	getTotalButton.click();
	String actualanswer= totalDisplay.getText();
	String splitString1 = "Total A + B :";
    String splitString = actualanswer.replace(splitString1," ");
    String answer = splitString.trim();
	if (finalexpectedanswer.equals(answer)) {
		System.out.println("Test Case Pass");
	}else {
		System.out.println("Test Case Fail");
	}
	//Verify background gettotal button
	String getTotalButtonBackgroundColor = getTotalButton.getCssValue("background-color");
	}
@Test
public void checkElementLocation() {
 boolean flag =false;
 WebElement enterValueA= driver.findElement(By.xpath("//input[@id='value-a']"));
 WebElement enterValueB= driver.findElement(By.xpath("//input[@id='value-b']"));
 Point enterValueALocation = enterValueA.getLocation();
 int enterValueAYAxix= enterValueALocation.y;
 Point enterValueBLocation = enterValueB.getLocation();
 int enterValueBYAxix= enterValueBLocation.y;
 if(enterValueAYAxix<enterValueBYAxix) {
	flag = true;
 }
 assertTrue(flag,"A is below B");
}


@Test
public void practiseCommands() {
     driver.navigate().to("http://groceryapp.uniqassosiates.com/sign-in");
     WebElement loginButton = driver.findElement(By.xpath("//button[@class='search-btn' and @fdprocessedid='9ybabs']"));
     WebElement emailTextField= driver.findElement(By.xpath("//input[@id='ap_email' and @placeholder='Email or Mobile']"));
     boolean isLoginButtonEnabed= loginButton.isEnabled();
     boolean isLoginButtonDisplayed=loginButton.isDisplayed();
     String loginButtonGetText = loginButton.getText();
     String getClassnameLoginButton=loginButton.getAttribute("class");
     String getLoginButtonBackgroundColor = loginButton.getCssValue("background");
     String getLoginButtonColor =loginButton.getCssValue("color");
     Point getLocationEmailTextField= emailTextField.getLocation();
     driver.navigate().back();
     driver.navigate().to("https://www.amazon.in/");
     WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
     WebElement searchBarTextField= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
     boolean isSearchButtonEnabled = searchButton.isEnabled();
     boolean isSearchButtonDisplay = searchButton.isDisplayed();
     String getTypeSearchButton = searchButton.getAttribute("type");
     String getBackgroungcolorSearch = searchButton.getCssValue("background");
     Point getSearchButtonLocation = searchButton.getLocation();
}
}
