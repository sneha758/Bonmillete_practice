package generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Verification implements Auto_constant
{
	public WebDriver driver;
     public void verifyTitle(String ExpectedTitle) throws IOException
     {
    	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	 try {
    		
    		 wait.until(ExpectedConditions.titleIs(ExpectedTitle));
    		 Reporter.log("tc pass");
    	 }
    	 catch(Exception ex)
    	 {
    		 ex.printStackTrace();
    		 Reporter.log("tc fail");
    		 
    		                 TakesScreenshot ts=(TakesScreenshot)driver;
    		                 File ramloc= ts.getScreenshotAs(OutputType.FILE);
    		                 File hardDiskloc=new File(screenshotFolder);
    		                 Files.copy(ramloc, hardDiskloc);	 }
     }
}
