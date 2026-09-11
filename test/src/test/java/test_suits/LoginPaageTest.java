package test_suits;

import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;

import helper.Config;
import pages.LoginPage;

public class LoginPaageTest {
	@Test
	public void verification() {
		Config.driver   = new EdgeDriver();
		Config.driver.get("https://www.tunisianet.com.tn/connexion?back=my-account");
		LoginPage page = new LoginPage();
		page.connect("hamzabenabid@gmail.com", "hamaza1223");
		page.verif();
		Config.driver.quit();
	}

}
