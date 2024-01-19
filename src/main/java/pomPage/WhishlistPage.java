package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhishlistPage {
	
	@FindBy(xpath="//button[@aria-label='Play']//*[name()='svg']//*[name()='path' and contains(@class,'fill')]")
	private WebElement Openbtn;
	
	@FindBy(xpath="//button[@aria-label='Pause']//*[name()='svg']")
	private WebElement Closebtn;
	
	
	@FindBy(xpath="//i[@class='fa fa-heart-o']")
	private WebElement AddWhishlist;
	
	
	public WhishlistPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	
	public void Openbtn() {
		Openbtn.click();
	}
	
	public void Closebtn() {
		Closebtn.click();
	}
	
	
	public void AddWhishlist() {
		AddWhishlist.click();
	}

}
