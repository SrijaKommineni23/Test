package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnotherLoginAdmin extends BasePage{
		@FindBy(xpath="//input[@name='Email']")
		private WebElement textEmail;
		@FindBy(xpath="//input[@class='password']")
		private WebElement textPassword;
		@FindBy(xpath="//input[@class='button-1 login-button']")
		private WebElement btnClick;
		@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
		private WebElement movetoElement ;
		public void enterEmail(String str)
		{
		textEmail.sendKeys(str);
		}
		public void enterPassword(String str)
		{
		textPassword.sendKeys(str);
		}
		public void clickLogin()
		{
		btnClick.click();
		}
	}
		

