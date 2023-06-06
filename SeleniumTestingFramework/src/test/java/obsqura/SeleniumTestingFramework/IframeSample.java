package obsqura.SeleniumTestingFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeSample extends Base {
@Test
public void iframeSampleByName() {
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	driver.switchTo().frame("a077aa5e");
	WebElement iframetaghyperlink = driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
	iframetaghyperlink.click();
}
@Test
public void iframeByIndex() {
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	driver.switchTo().frame(1);
	WebElement iframetaghyperlink = driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
	iframetaghyperlink.click();
	
}
@Test
public void iframeById() {
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	driver.switchTo().frame("a077aa5e");
	WebElement iframetaghyperlink = driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
	iframetaghyperlink.click();
	
}
@Test
public void iframeByWebElement() {
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='a077aa5e']")));
	WebElement iframetaghyperlink = driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
	iframetaghyperlink.click();
	
}
}
