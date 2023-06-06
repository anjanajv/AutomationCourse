package obsqura.SeleniumTestingFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload extends Base {
@Test
public void fileUploadVerifying() {
driver.navigate().to("https://demo.guru99.com/test/upload/");	
WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
uploadElement.sendKeys("C:\\Users\\anjan\\Downloads\\BtechTranscript.pdf");
}
@Test
 public void fileUploadUsingAutoIt() throws IOException {
 driver.navigate().to("https://www.ilovepdf.com/merge_pdf");
 WebElement uploadFileButton = driver.findElement(By.id("pickfiles"));
 uploadFileButton.click();
 Runtime.getRuntime().exec("D:\\AutoIT\\FileUploadPdf");
 }
}
