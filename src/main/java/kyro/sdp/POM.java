package kyro.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import kyro.Kyro_Dev.HomePage;
import kyro.Kyro_Dev.LoginPage;
import kyro.Kyro_Dev.NewProject;
import kyro.Kyro_Dev.TaskPage;

public class POM {

	public static WebDriver driver;
	
	private LoginPage lp;
	private HomePage hp;
	private NewProject np;
	private TaskPage tp;
	
	public POM(WebDriver driver2) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public LoginPage getLoginPage() {
		lp = new LoginPage(driver);
		return lp;
	}
	
	public HomePage getHomePage() {
		hp = new HomePage(driver);
		return hp;
	}
	
	public NewProject getNewProject() {
		np = new NewProject(driver);
		return np;
	}
	
	public TaskPage getTaskPage() {
		tp = new TaskPage(driver);
		return tp;
	}
	
	
	
	
}
