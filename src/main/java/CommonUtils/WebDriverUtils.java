package CommonUtils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class WebDriverUtils 
{
	public void implicitwait(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
