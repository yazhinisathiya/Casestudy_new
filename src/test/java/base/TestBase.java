package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	
	private static TestBase testBase;
	private static WebDriver driver;
	
	
	
	private TestBase() {
		String strBrowser = "chrome";
		
		if(strBrowser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			else if(strBrowser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
		
		driver.manage().window().maximize();
		/*
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.manage().deleteAllCookies();
		 */
		System.out.println("Driver obj...." + driver);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void initDriver() {
	//	if(testBase == null) {
			testBase = new TestBase();
	//	}
	}

	public static void tearDown() {
		if(driver!=null) {
            driver.close();
            driver.quit();
       }
      testBase = null;
	}

}
