package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class OpenClose implements Auto_constant
{
	public WebDriver driver;
   public void openApplication()
   {
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get(urlOfApplication);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
   
   public void closeApplication()
   {
	   driver=new ChromeDriver();
	   driver.close();
   }
}
