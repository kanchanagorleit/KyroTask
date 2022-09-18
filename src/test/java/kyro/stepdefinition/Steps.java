package kyro.stepdefinition;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import kyro.Kyro_Dev.BaseClass;
import kyro.Kyro_Dev.HomePage;
import kyro.Kyro_Dev.LoginPage;
import kyro.Kyro_Dev.NewProject;
import kyro.Kyro_Dev.TaskPage;
import kyro.properties.Configuration_Reader;
import kyro.runner.Kyro_Runner;

public class Steps extends BaseClass {
	
public static WebDriver driver = Kyro_Runner.driver;
	
	public static LoginPage lp = new LoginPage(driver);
	public static HomePage hp = new HomePage(driver);
	public static NewProject np = new NewProject(driver);
	public static TaskPage tp = new TaskPage(driver);
	
	
	@Given("^Launch the application$")
	public void launch_the_application() throws Throwable {
		driver.get(Configuration_Reader.getInstanceCR().getUrl());
	}

	@When("^Click the login button$")
	public void click_the_login_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickOnMethods(lp.getLogin_button());
	}

	@When("^Enter the username \"([^\"]*)\"$")
	public void enter_the_username(String username) throws Throwable {
		sendInput(lp.getUsername(), username);
	}

	@When("^Enter the password \"([^\"]*)\"$")
	public void enter_the_password(String pwd) throws Throwable {
		sendInput(lp.getPwd(), pwd);
	}

	@Then("^Click on Continue$")
	public void click_on_Continue() throws Throwable {
		clickOnMethods(lp.getLogin());
		
	}

	@Then("^Error message$")
	public void error_message() throws Throwable {
		WebElement we = driver.findElement(By.partialLinkText("Wrong email or password"));
		implicit(driver, 10);
		boolean status = we.isDisplayed();
			    SoftAssert asrt = new SoftAssert();
			    asrt.assertTrue(status);
			    asrt.assertAll();
		File dest = new File("C:\\Users\\Nandu\\eclipse-workspace\\Kyro_Dev\\Report\\Login_Invalid.png");
		takeScreenShot(dest, driver);
	}

	@Given("^in login page$")
	public void in_login_page() throws Throwable {
		driver.get(Configuration_Reader.getInstanceCR().getUrl());
	}
	
	@When("^click login button$")
	public void click_login_button() throws Throwable {
		clickOnMethods(lp.getLogin_button());
	}

	@When("^Enter username as \"([^\"]*)\"$")
	public void enter_username_as(String username) throws Throwable {
		sendInput(lp.getUsername(), username);
	}

	@When("^Enter password as \"([^\"]*)\"$")
	public void enter_password_as(String pwd) throws Throwable {
		sendInput(lp.getPwd(), pwd);
	}

	@Then("^Continue$")
	public void continue_to_login() throws Throwable {
		clickOnMethods(lp.getLogin());
	}
	
	@Given("^home page$")
	public void home_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/nav/div/div/div/div/div[2]/ul/li[3]/div[2]/span")).click();
	}

	@Then("^New project$")
	public void new_project() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/a")).click();
	}

	@When("^Create New Project$")
	public void create_New_project() throws Throwable {
		
	    sendInput(np.getStDate(),"01/10/2022");
	    sendInput(np.getEndDate(), "30/10/2022");
	    sendInput(np.getProjectName(),readData("C:\\Users\\Nandu\\eclipse-workspace\\Kyro_Dev\\TaskData.xlsx", "sample1", 3, 1) );
	    clickOnMethods(np.getDepartmentName());
	    clickOnMethods(np.getDeptName());
	    sendInput(np.getOwnerName(), readData("C:\\Users\\Nandu\\eclipse-workspace\\Kyro_Dev\\TaskData.xlsx", "sample1", 4, 1));
	    clickOnMethods(np.getSourceTemplate());
	    clickOnMethods(np.getTemplate());
	    clickOnMethods(np.getProjectType());
	    clickOnMethods(np.getpType());	   
	    sendInput(np.getCostCenter(), readData("C:\\Users\\Nandu\\eclipse-workspace\\Kyro_Dev\\TaskData.xlsx", "sample1", 5, 1));
	    sendInput(np.getPoc(), readData("C:\\Users\\Nandu\\eclipse-workspace\\Kyro_Dev\\TaskData.xlsx", "sample1", 6, 1));
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    clickOnMethods(np.getSubmitButton());
	}
	
	@Given("^Project selected$")
	public void select_project() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    tp.getSelectProj().click();
	}

	@Then("^Start creating task$")
	public void start_creating_task() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    tp.getCreateTask().click();
	    sendInput(tp.getSummary(), readData("C:\\Users\\Nandu\\eclipse-workspace\\Kyro_Dev\\TaskData.xlsx", "sample1", 9, 1));
	    sendInput(tp.getTaskType(), readData("C:\\Users\\Nandu\\eclipse-workspace\\Kyro_Dev\\TaskData.xlsx", "sample1", 10, 1) );
	    sendInput(tp.getDescription(),readData("C:\\Users\\Nandu\\eclipse-workspace\\Kyro_Dev\\TaskData.xlsx", "sample1", 11, 1) );
	    tp.getPriority().click();
	    tp.getPriorityType().click();
	    sendInput(tp.getLocation(), readData("C:\\Users\\Nandu\\eclipse-workspace\\Kyro_Dev\\TaskData.xlsx", "sample1", 12, 1));
	    sendInput(tp.getStartDate(), "05/10/2022");
	    sendInput(tp.getEndDate(), "10/10/2022");
	    clickOnMethods(tp.getSubmitButton());
	}

	@Then("^Verify task created$")
	public void verify_task_created() throws Throwable {
		String text2 = tp.getVerifyTaskCreated().getText();
		String expected = "Application error: a client-side exception has occurred (see the browser console for more information).";
		SoftAssert asrt = new SoftAssert();
		asrt.assertNotEquals(text2, expected);
	    asrt.assertAll();
		File dest = new File("C:\\Users\\Nandu\\eclipse-workspace\\Kyro_Dev\\Screenshot\\TaskCreated.png");
	    takeScreenShot(dest, driver);
	}


}
