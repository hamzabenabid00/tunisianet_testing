package pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Config;

public class RenchercheProduit {
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/div[2]/h1")
	WebElement veriftext;
	@FindBy (xpath="/html/body/main/section/div/div/div[4]/section/section/div[3]/div/div/div/div")
	List <WebElement> produits ;
	WebDriverWait wait;
	public RenchercheProduit () {
		 PageFactory.initElements(Config.driver, this);
		  wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
    

	 }
	 
	 public void disquefinder(String product ) {
		 
		 try {
			  for (WebElement p: produits) {
				  if (p.getText().contains(product)) {
					  wait.until(ExpectedConditions.elementToBeClickable(p));
					  p.click();
					  break;
				  }
				
			}
		 }catch (Exception e) {
			// TODO: handle exception
		}
	 }
	 public void verification(String product) {
		 

			    WebElement title = wait.until(
			        ExpectedConditions.presenceOfElementLocated(
			            By.xpath("//h1")
			        )
			    );

			    wait.until(
			        ExpectedConditions.visibilityOf(title)
			    );

			    Assert.assertEquals(product, title.getText());
	 }
	
	
}
