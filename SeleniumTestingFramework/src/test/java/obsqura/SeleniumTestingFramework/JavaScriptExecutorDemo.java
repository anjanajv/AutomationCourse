package obsqura.SeleniumTestingFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo extends Base{
@Test
 public void javaScriptExecutorDemo() {
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement simpleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	WebElement enterValueAField = driver.findElement(By.xpath("//input[@id='value-a']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='hello';",simpleInputTextField);
	js.executeScript("arguments[0].click();", showMessageButton);
	js.executeScript("window.scrollBy(0,250)", "");
	js.executeScript("window.scrollBy(0,-250)", "");
	js.executeScript("arguments[0].scrollIntoView();",enterValueAField  );
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//to scroll to the bottom
 }
}
