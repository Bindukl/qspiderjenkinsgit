package carsscriptsgroups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataMotorsTest {
	@Test(groups = "system")
	public void lanchTataMotor()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tatamotors.com/");
		Reporter.log("TataMotor lanched successfully",true);
	}

}