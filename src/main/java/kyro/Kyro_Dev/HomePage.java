package kyro.Kyro_Dev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

public static WebDriver driver;
	
	//initializing the driver with step definition driver;
	public HomePage(WebDriver driver2) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//declaring webelements as private
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[1]/div[1]/div[1]/h1")
	private WebElement projectPage;

	public WebElement getprojectPage() {
		return projectPage;
	}

		
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/nav/div/div/div/div/div[2]/ul/li[3]/div[2]/span")
	private WebElement dashboard;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/a/p[2]")
	private WebElement newProject;
	
	

	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getNewProject() {
		return newProject;
	}
	
	
	
	
	
}
