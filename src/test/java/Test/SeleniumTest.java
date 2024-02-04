package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pages.HomePage;
import Pages.ProductsPage;

public class SeleniumTest {
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentReports extent = new ExtentReports();
	public static WebDriver driver;
	
	@BeforeSuite
	public static void setUp()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		driver=new ChromeDriver();
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
		HomePage.click_option_menu();
		HomePage.online_Products();
	}
	
	@Test
	void ValidateTitles()
	{
		test=extent.createTest("Validate Shoe Title",  "This test validates the different shoe types are correct on online products Page");
		ProductsPage.FormalShoes_VerifyTitle();
		ProductsPage.SportsShoes_verifyTitle();
		ProductsPage.SneakerShoes_verifyTitle();
		extent.flush();
	}
	
	@Test
	void validateFristFromalShoe() {
		test=extent.createTest("Validate first formal Shoe Title",  "This test validates formal shoes on online products Page");
		ProductsPage.FormalShoes_FirstShoe_VerifyTitle();

	}
	
	@Test
	void validateFristSportsShoe() {
		test=extent.createTest("Validate first sports Shoe Title",  "This test validates sports shoes on online products Page");
		ProductsPage.SportsShoes_FirstShoe_VerifyTitle();
	}
	
	@AfterSuite
	public void cleanUp()
	{
		extent.flush();
		driver.close();
	}
}
