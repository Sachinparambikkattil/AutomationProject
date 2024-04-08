package page;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Pentathlonpage {
WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div/div/section[2]/div/div[1]/div/div/div/a/img") WebElement logo;
	@FindBy(xpath = "/html/body/div[2]/section/div/div/div/section[2]/div/div[3]/div/div[1]/div/div/ul/li/a[1]/span") WebElement login;
	@FindBy(xpath = "//*[@id=\"username\"]") WebElement username;
	@FindBy(xpath = "//*[@id=\"password\"]") WebElement password;
	@FindBy(xpath = "//*[@id=\"login_ajax\"]/div/div[1]/div[4]/div") WebElement loginbutton;
	@FindBy(xpath = "/html/body/div[2]/div/div/ul/li[1]/a") WebElement home;
	@FindBy(xpath = "//*[@id=\"menu-shop-by-brand-1\"]/li[29]/a") WebElement seemore;
	@FindBy(xpath = "//*[@id=\"menu-shop-by-brand-1\"]/li[8]/a/span/span") WebElement nivea;
	@FindBy(xpath = "//*[@id=\"product_listing\"]/li[2]/div/div/div[1]/div[2]/a[3]") WebElement Badmintonshoe;
	@FindBy(xpath = "/html/body/div[4]/section[1]/div/div/div/div/div/nav/a[1]") WebElement home2;
	@FindBy(xpath = "//*[@id=\"sw_woo_search_1\"]/div[2]/input") WebElement searchbar;
	@FindBy(xpath = "//*[@id=\"sw_woo_search_1\"]/span/button") WebElement searchicon;
	@FindBy(xpath = "/html/body/div[3]/section[1]/div/div[2]/div/div/div/div/ul/li[1]/a") WebElement fbicon;
	@FindBy(xpath = "//*[@id=\"mount_0_0_WG\"]/div/div[1]/div/div[5]/div/div/div[1]/div/div[2]/div/div/div/div[1]/div/i") WebElement fbclose;
	public Pentathlonpage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void titleVerification()
	{
		String expectedTitle = "Pentathlon Sports India - Buy Branded Sports Products Online";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);	
	}
	
	public void logoVerification()
	{
		if(logo.isDisplayed())
		{
			System.out.println("Logo is Visible");
		}
		else
		{
			System.out.println("Logo is not Visible");
		}
	}
	public void login()
	{
		login.click();
	}
    public void loginpage()
    {
    	username.sendKeys("sachinlopzz8111");
    	password.sendKeys("Parambikkattil");
    	loginbutton.click();
    }
    public void afterlogin() 
    {
    	home.click();
    	seemore.click();
    	nivea.click();
    	Badmintonshoe.click();
    	home2.click();
    }
    public void searching()
    {
    	searchbar.sendKeys("cricket bat");
    	searchicon.click();
    }
    public void socialMediaIcons() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		fbicon.click();
		fbclose.click();
				 
				
			}
		

    

}
