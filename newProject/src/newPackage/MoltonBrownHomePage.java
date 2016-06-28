package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class MoltonBrownHomePage{
	
	private static WebElement element = null;
	
	public static WebElement lnk_SignInOrRegister(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("SIGN IN OR REGISTER"));
		return element;
	}
}
