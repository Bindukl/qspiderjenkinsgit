package carsscriptsgroups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FordTest {
	
	@Test(groups = "smoke")
	public void lanchFord()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.lamborghini.com/en-en");
		Reporter.log("Ford lanched successfully",true);
	}

}
