package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverutilies {
	
	
	public void Dropdown(WebElement ele, String text) {
	Select s=new Select(ele);
	s.selectByVisibleText(text);
    }
	
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();;	
		
	}
	
	
	public void rightClic(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	
	public void dargAndDrop(WebDriver driver,WebElement src,WebElement traget) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, traget).perform();
	}
	
	public void switchtoframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	
	public void switcbacktoframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchTabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
	
	public void scrollBar(WebDriver driver, int x,int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy("+x+", "+y+")");
	}
}






