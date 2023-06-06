package obsqura.SeleniumTestingFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileDownload extends Base{
@Test
public void fileDownload() {
	driver.navigate().to("https://selenium.obsqurazone.com/file-download.php");
	WebElement textarea = driver.findElement(By.xpath("//textarea[@id='textbox']"));
	WebElement generateFileButton = driver.findElement(By.xpath("//button[@id='create']"));
	WebElement downloadButton = driver.findElement(By.xpath("//a[@id='download-file']"));
	textarea.sendKeys("All The Best");
	generateFileButton.click();
	downloadButton.click();
	
}
}
