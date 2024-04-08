package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Pentathlonpage;

public class PentathlonTest {
	WebDriver driver;
	String baseurl = "https://www.pentathlon.in/";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void homepageValidation() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Pentathlonpage dec = new Pentathlonpage(driver);
		dec.titleVerification();
		dec.logoVerification();
		dec.login();
		dec.loginpage();
		dec.afterlogin();
		dec.searching();
		dec.socialMediaIcons();
		driver.navigate().back();
		
		
}}
