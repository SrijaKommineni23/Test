package Test;
import org.testng.annotations.Test;
import GenericUtils.DriverUtils;
import Pages.AnotherLoginPage;
public class LoginTest extends BaseTest{
	@Test
	public void Login() throws InterruptedException
	{
	//DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	/*LoginPage lp=new LoginPage();
	lp.enterUsername("Admin");
	lp.enterPassword("admin123");
	lp.clickLogin();
	Thread.sleep(6000);
	Admin pt=new Admin();
	pt.clickAdmin();
	pt.clickAdd();*/
		
	DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");
	AnotherLoginPage lp1 = new AnotherLoginPage();
	lp1.enterEmail("kommineni.satya1972@gmail.com");
	lp1.enterPassword("Srija@123");
	lp1.clickLogin();
	
	}
}