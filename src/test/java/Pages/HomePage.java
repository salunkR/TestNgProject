package Pages;

import java.time.Duration;

import org.openqa.selenium.By;

import Test.SeleniumTest;

public class HomePage extends SeleniumTest {

	public static String optionmenu="//input[@type='checkbox']";
	public static String onlineProducts="//li[normalize-space()='Online Products']";
	
	
	
	public static void click_option_menu()
	{
		driver.findElement(By.xpath(optionmenu)).click();
		
	}
	public static void online_Products()
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(onlineProducts)).click();
	}
}

