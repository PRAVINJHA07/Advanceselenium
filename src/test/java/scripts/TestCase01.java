package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPage.AddtoCartPage;
import pomPage.SkillraryDemoPage;
import pomPage.SkillraryPage;

public class TestCase01 extends BaseClass {
	
	@Test
	public void tc1() {
		
		SkillraryPage s=new SkillraryPage(driver);
		s.gearsbtn();
	    s.SkillrarydemoApp();
		
		
		driverutilites.switchTabs(driver);
		SkillraryDemoPage sd=new SkillraryDemoPage(driver);
	    driverutilites.mouseHover(driver,sd.getCoursebtab());
		sd.SeleniumTrainingTab();
		
		AddtoCartPage ac=new AddtoCartPage(driver);
		driverutilites.doubleClick(driver,ac.getAddbtn());
		ac.addtoCart();
		driverutilites.alertpopup(driver);
		
	}

}
