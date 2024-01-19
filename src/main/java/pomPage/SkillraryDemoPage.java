package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoPage {

	@FindBy(id="course")
	private WebElement coursebtab;
	
	public WebElement getCoursebtab() {
		return coursebtab;
	}
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	
	public WebElement getCoursedd() {
		return coursedd;
	}

	@FindBy(xpath="(/html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement SeleniumTrainingTab;
	
	public SkillraryDemoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SeleniumTrainingTab() {
		SeleniumTrainingTab.click();
	}

	
	
}
