package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import static Test.SeleniumTest.*;

public class ProductsPage  {

	public static String FormalShoesTitle="//h2[@class='FormalShoesTitle']";
	public static String SportsShoesTitle="//h2[@class='SportsShoesTitle']";
	public static String SneakerShoesTitle="//h2[@class='SneakerShoesTitle']";

	public static String formalshoedropdown="//i[@class='fa fa-angle-double-down formalshoedropdown']";
	public static String sportsshoedropdown="//i[@class='fa fa-angle-double-down sportsshoedropdown']";
	public static String sneakershoedropdown="//i[@class='fa fa-angle-double-down sneakershoedropdown']";

	public static String formalShoe_firstShoeName="/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]";
	public static String SportsShoes_firstShoeName="/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]";

	public static void FormalShoes_VerifyTitle()
	{
		String expectedTitleFS="Formal Shoes";
		String actualTitle=driver.findElement(By.xpath(FormalShoesTitle)).getText();
		System.out.println("Actual Title on page is: "+actualTitle);
		Assert.assertEquals(expectedTitleFS, actualTitle);

		if (expectedTitleFS.equals(actualTitle))
		{
			test.log(Status.PASS, "Test passed for title verification for formal");
		}
		else
		{
			test.log(Status.FAIL, "Test failed for title verification for formal");
	
		}
	}

	public static void SportsShoes_verifyTitle()
	{
		String expectedTitleSS="Sports Shoes";
		String actualTitleSS=driver.findElement(By.xpath(SportsShoesTitle)).getText();
		System.out.println("Actual Title on page is: "+actualTitleSS);
		Assert.assertEquals(expectedTitleSS, actualTitleSS);

		if (expectedTitleSS.equals(actualTitleSS))
		{
			test.log(Status.PASS, "Test passed for title verification for Sports shoes");
		}
		else
		{
			test.log(Status.FAIL, "Test failed for title verification for Sports shoes");

		}
	}

	public static void SneakerShoes_verifyTitle()
	{
		String expectedTitleSn="Sneakers";
		String actualTitleSn=driver.findElement(By.xpath(SneakerShoesTitle)).getText();
		System.out.println("Actual Title on page is: "+actualTitleSn);
		Assert.assertEquals(expectedTitleSn, actualTitleSn);
		if (expectedTitleSn.equals(actualTitleSn))
		{
			test.log(Status.PASS, "Test passed for title verification for Sneaker shoes");
		}

	}

	public static void FormalShoes_FirstShoe_VerifyTitle()
	{
		String expectedFirstFormalShoeName="   Classic Cheltenham";
		driver.findElement(By.xpath(formalshoedropdown)).click();
		String actualFirstFormalShoeName=driver.findElement(By.xpath(formalShoe_firstShoeName)).getText();
		System.out.println("Actual Shoe Name on Page is: "+actualFirstFormalShoeName);
		Assert.assertEquals(expectedFirstFormalShoeName, actualFirstFormalShoeName);
	
		if(expectedFirstFormalShoeName.equals(actualFirstFormalShoeName))
		{
			test.log(Status.PASS, "Test Passed for 1st Formal shoe name");
		}
	}

	public static void SportsShoes_FirstShoe_VerifyTitle()
	{
		String expectedFirstSportsShoeName="   Ultimate";
		driver.findElement(By.xpath(sportsshoedropdown)).click();
		String actualFirstSpotrsShoeName=driver.findElement(By.xpath(SportsShoes_firstShoeName)).getText();
		System.out.println("Actual Shoe Name on Page is: "+actualFirstSpotrsShoeName);
		Assert.assertEquals(expectedFirstSportsShoeName, actualFirstSpotrsShoeName);

		if(expectedFirstSportsShoeName.equals(actualFirstSpotrsShoeName))
		{
			test.log(Status.PASS, "Test Passed for 1st Sports shoe name");
		}
	}

	
	
}
