package BrowserStackPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackSigninPage 
{
	// Object Repository
	
			WebDriver driver;
			
			@FindBy (xpath ="//input[@id='user_email_login']")
			WebElement UserEmail ;
			
			@FindBy (xpath ="//input[@id='user_password']")
			WebElement UserPassword;
			
			@FindBy (xpath ="//input[@id='user_submit']")
			WebElement LoginBtn;
			
	// Constructor	
			public BrowserStackSigninPage(WebDriver driver) 
			{
				this.driver = driver;
				PageFactory.initElements(driver,this);
			}
	// Methods		
			public void enterUserEmail(String useremail) {
				UserEmail.sendKeys(useremail);
			}
			public void enterUserPassword(String userpassword) {
				UserPassword.sendKeys(userpassword);
			}
			public void ClickonLogin() {
				LoginBtn.click();
			}		
}
