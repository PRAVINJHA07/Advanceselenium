package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaPage {
	
	@FindBy(xpath="//a[@href='https://skillrary.com/core-java-for-selenium-training']//img[@id='image-3']")
	private WebElement javatab;
	
	
	public CoreJavaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void javatab() {
		javatab.click();
	}

}
