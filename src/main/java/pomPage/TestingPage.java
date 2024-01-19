package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath="//img[@id='Java']")
	private WebElement javatab;
	
	



	public WebElement getJavatab() {
		return javatab;
	}



	public WebElement getMycarttab() {
		return mycarttab;
	}



	public WebElement getFaceBookTab() {
		return FaceBookTab;
	}



	@FindBy(xpath="//div[@id='cartArea']")
	private WebElement mycarttab;

	
	@FindBy(xpath="(//i[@class=\"fa fa-facebook\"])[2]")
	private WebElement FaceBookTab;
	
	
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void FaceBookTab() {
		FaceBookTab.click();
	}
}
