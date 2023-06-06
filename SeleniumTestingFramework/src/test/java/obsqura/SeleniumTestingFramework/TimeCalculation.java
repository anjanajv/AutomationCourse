package obsqura.SeleniumTestingFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TimeCalculation extends BaseHomeWork {
    @Test
	public void locateById() {
    	driver.findElement(By.id("gridCheck"));
    	}
    @Test
    	public void loactionByXpath() {
    	driver.findElement(By.xpath("//input[@id='gridCheck']"));
    	}
    @Test
    	public void locateByCssSelector() {
    	driver.findElement(By.cssSelector("input#gridCheck"));
    	}
    @Test
    	public void locateByClass() {
    	driver.findElement(By.className("form-check-input"));	
    	}
}
