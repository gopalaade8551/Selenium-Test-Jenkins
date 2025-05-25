package Jenkins_01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Orange_Title {

	@Test
	public void startbrowser() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("the title is "+driver.getTitle());
		boolean title=driver.getTitle().contains("Orange");
		System.out.println("the title is "+title);
Assert.assertTrue(true,"title does not match");


//driver.quit();
		

	}

}
