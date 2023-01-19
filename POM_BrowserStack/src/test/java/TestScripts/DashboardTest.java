package TestScripts;

import org.testng.annotations.Test;

import BrowserStackPages.BrowserStackSigninPage;
import BrowserStackPages.BrowserStckDashboardPage;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DashboardTest 
{
	public WebDriver driver;
	BrowserStackSigninPage bssip;
	BrowserStckDashboardPage bsdp;
  @Test(priority = 1)
  public void loginTest() 
 {
	  bssip = new BrowserStackSigninPage(driver);
	  bssip.enterUserEmail("sawant6061@gmail.com");
	  bssip.enterUserPassword("sawant@8014");
	  bssip.ClickonLogin();
 }
  @Test(priority = 2)
  public void DashBoardTest() 
{
	  bsdp = new BrowserStckDashboardPage(driver);
	  bsdp.UserProfileClick();
	  bsdp.ClickonSummary();
	  Assert.assertEquals(bsdp.verifyUserName(),"Saudagarsinh");
}
  @BeforeTest
  public void setup() 
 {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://www.browserstack.com/users/sign_in");  
 }

  @AfterTest
  public void afterTest()
 {
	  driver.quit();
 }

}
