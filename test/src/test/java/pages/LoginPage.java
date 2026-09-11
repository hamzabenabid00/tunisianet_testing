package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class LoginPage {
	@FindBy(xpath="/html/body/main/section/div/div/div/section/section/section/form/section/div[1]/div[1]/input")
	WebElement email ;
	@FindBy(xpath="/html/body/main/section/div/div/div/section/section/section/form/section/div[2]/div[1]/div/input")
	WebElement mdp ;
	@FindBy(id="submit-login")
	WebElement btn;
	@FindBy (xpath="/html/body/main/section/div/div/div/section/section/section/div/ul/li")
	WebElement alterm ;
	 
	public LoginPage() {
		PageFactory.initElements(Config.driver, this);
	}
	public void connect(String mail, String pass) {
		email.sendKeys(mail);
		mdp.sendKeys(pass);
		btn.click();		
	}
	public void verif() {
		String message = alterm.getText();
		String expected ="Échec d'authentification";
		Assert.assertEquals(message, expected);
	}
	
}
