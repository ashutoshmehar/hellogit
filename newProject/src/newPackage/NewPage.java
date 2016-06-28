package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class NewPage {
private static WebElement element = null;
	
	public static WebElement lnk_New(WebDriver driver)
	{
		element = driver.findElement(By.linkText("NEW"));
		return element;
	}
	
	public static WebElement lnk_FindNew(WebDriver driver)
	{
	   element = driver.findElement(By.id("left_heading_h2").tagName("h1"));
	   return element;
	}
	
	public static WebElement lnk_Ylang_Mist(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Ylang-Ylang Home & Linen Mist"));
		return element;
	}
	
	public static WebElement txt_Verify_Ylang_Mist(WebDriver driver)
	{
		element = driver.findElement(By.tagName("h2").className("productDetail"));
		return element;
	}
	
}
