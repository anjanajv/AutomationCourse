package obsqura.SeleniumTestingFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations extends Base{
@Test
public void testSample() {
	System.out.println("TestCaseC1");
}
@BeforeMethod
public void beforeMethodSample() {
	System.out.println("@BeforeMethod");
}
@AfterMethod
public void afterMethodSample() {
	System.out.println("@AfterMethod");
}
@Test
public void testSample1() {
	System.out.println("TestCaseC2");
}
@BeforeClass
public void beforeClassSample() {
	System.out.println("@beforeclass");
}
@AfterClass
public void afterClassSample() {
	System.out.println("@afterclass");
}
@BeforeTest
public void beforeTestSample() {
	System.out.println("@beforetest");
}
@AfterTest
public void afterTestSample() {
	System.out.println("@aftertest");
}
@BeforeSuite
public void beforeSuiteSample() {
	System.out.println("@beforesuite");
}
@AfterSuite
public void afterSuiteSample() {
	System.out.println("@aftersuite");
}
}
