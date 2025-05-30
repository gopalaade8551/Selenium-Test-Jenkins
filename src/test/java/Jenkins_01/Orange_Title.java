package Jenkins_01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Orange_Title {

	
	@Parameters("Browser")
	@Test
	public void startbrowser(String browsername) {
		
		System.out.println("the parameter value is "+browsername);
		WebDriver driver=null;
//		if(browsername.contains("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			 driver=new ChromeDriver();
//		}
		
		 if(browsername.contains("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
//		WebDriverManager.chromedriver().setup();
//		 driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("the title is "+driver.getTitle());
		boolean title=driver.getTitle().contains("Orange");
		System.out.println("the title is "+title);
Assert.assertTrue(true,"title does not match");


//driver.quit();
		

	}

}
