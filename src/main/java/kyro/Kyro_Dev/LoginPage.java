package kyro.Kyro_Dev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	public static WebDriver driver;
	
	//initializing the driver with step definition driver;
	//@SuppressWarnings("static-access")
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//declaring webelements as private
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/nav/div/div/div/div/div[2]/button")
	private WebElement login_button;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(name = "action")
	private WebElement login;
	
	
	// accessing private webelements
	public WebElement getLogin_button() {
		return login_button;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
}
