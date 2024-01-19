package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPage.SkillraryDemoPage;
import pomPage.SkillraryPage;
import pomPage.TestingPage;

public class TestCase02 extends BaseClass{
	
	@Test
	public void tc2() throws IOException, InterruptedException {
		SkillraryPage s=new SkillraryPage(driver);
		s.gearsbtn();
	    s.SkillrarydemoApp();
		
		
		driverutilites.switchTabs(driver);
		SkillraryDemoPage d=new SkillraryDemoPage(driver);
		driverutilites.Dropdown(d.getCoursedd(),pdata.getData("coursename"));
		
	TestingPage T=new TestingPage(driver);
//		Point cattloc = T.getMycarttab().getLocation();
//		int x=cattloc.getX();
//		int y=cattloc.getY();
//		driverutilites.scrollBar(driver, x, y);
//		driverutilites.dargAndDrop(driver, T.getJavatab(), T.getMycarttab());
//	     Point loc = T.getFaceBookTab().getLocation();
//	    int x1=loc.getX();
//	    int y1=loc.getY();
//		driverutilites.scrollBar(driver, x1, y1);
		T.FaceBookTab();
		
	}

}
