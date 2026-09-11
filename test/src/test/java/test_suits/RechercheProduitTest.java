package test_suits;

import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;

import helper.Config;
import pages.RenchercheProduit;

public class RechercheProduitTest {
	
	@Test
	public void clickproduit() {
		Config.driver = new EdgeDriver();
		Config.maxwin();
		Config.driver.get("https://www.tunisianet.com.tn/379-disques-ssd");
		RenchercheProduit disq = new RenchercheProduit();
		disq.disquefinder("Disque Dur Interne SSD TeamGroup GX2 / 128 Go");
		disq.verification("Disque Dur Interne SSD TeamGroup GX2 / 128 Go");
		
		Config.driver.quit();
		
	}

}
