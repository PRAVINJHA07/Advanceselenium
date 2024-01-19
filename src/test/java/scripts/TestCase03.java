package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPage.CoreJavaPage;
import pomPage.SkillraryPage;
import pomPage.WhishlistPage;

public class TestCase03 extends BaseClass{
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		
		SkillraryPage s=new SkillraryPage(driver);
		s.Searchtext(pdata.getData("searchtext"));
		s.Searchbtn();
		
		CoreJavaPage cp=new CoreJavaPage(driver);
		cp.javatab();
		driverutilites.switchTabs(driver);
		
		WhishlistPage wp=new WhishlistPage(driver);
		driver.findElement(By.xpath("//a[text()='X']")).click();
		driverutilites.switchtoframe(driver);
		wp.Openbtn();
		Thread.sleep(5000);
		wp.Closebtn();
		
		driverutilites.switcbacktoframe(driver);
		wp.AddWhishlist();
		
		
		
	}

}
