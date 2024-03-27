package locators;

import org.openqa.selenium.WebDriver;

public class placeorderpage {
	WebDriver driver;
	
	public placeorderpage(WebDriver driver2) {
		driver = driver2;
		// TODO Auto-generated constructor stub
	}
	
	public void openApp()
	{
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	
	

}
