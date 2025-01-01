package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Verification;

public class HomePage extends Verification 
{
	public WebDriver driver;
      @FindBy(xpath="img//[src='//src/assets/logo/logo.png']")
	  private WebElement logo;
      
      public HomePage()
      {
    	  PageFactory.initElements(driver, this);
      }
      
      public void clickOnLogo()
      {
    	  logo.click();
      }
      
      public void verifyHomePageTitle(String ExpectedTitle) throws IOException
      {
    	  verifyTitle(ExpectedTitle);
      }
}