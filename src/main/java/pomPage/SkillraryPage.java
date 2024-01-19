package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement SkillrarydemoApp;
	
	@FindBy(name="q")
	private WebElement Searchtext;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement Searchbtn;
	
	
	public SkillraryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearsbtn() {
		gearsbtn.click();	
	}
  
	public void SkillrarydemoApp() {
		SkillrarydemoApp.click();
	}
	
	public void Searchtext(String name) {
		Searchtext.sendKeys(name);
	}
	
	public void Searchbtn() {
		Searchbtn.click();
	}
	
	
}
