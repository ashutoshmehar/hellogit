package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import newPackage.MoltonBrownHomePage;
import newPackage.NewPage;
import testlink.api.java.client.TestLinkAPIResults;
import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;

public class PageObjectModelTest implements IConstants
{

 WebDriver driver;
           
    @BeforeSuite
 public void setUp() throws Exception {
         driver = new FirefoxDriver();
    }
		
 @Test
 public void testMoltonBrown() throws Exception
  {
	 String result="";
	 String exception = null;
	 try{
	    driver.get("http://www.moltonbrown.com/");
		MoltonBrownHomePage.lnk_SignInOrRegister(driver).click();
		System.out.println("Successfully open Molton brown");
		
		NewPage.lnk_New(driver).click();
		System.out.println("Successfully clicked on New Page");
		NewPage.lnk_FindNew(driver);
		System.out.println("New keyword found in New Page");
		NewPage.lnk_Ylang_Mist(driver).click();
		String pageText = NewPage.txt_Verify_Ylang_Mist(driver).getText();
		System.out.println(pageText);
		Assert.assertTrue(pageText.contains("Ylang-Ylang Home & Linen Mist"));
		result=TestLinkAPIResults.TEST_PASSED;
	 }
	 catch (Exception ex)
	 {
		 result=TestLinkAPIResults.TEST_FAILED;
		 exception =ex.getMessage();
	 }
	 finally
	 {
		TestClass.reportTestCaseResult(PROJECT_NAME, PLAN_NAME,TESTCASE_NAME, BUILD_NAME, exception, result);
	 }
		
  }
 
 @AfterSuite
 public void tearDown() throws Exception {
      driver.quit();
   }
 
 }
