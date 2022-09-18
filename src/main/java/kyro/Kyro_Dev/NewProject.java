package kyro.Kyro_Dev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProject {

public static WebDriver driver;
	
	//initializing the driver with step definition driver;
	@SuppressWarnings("static-access")
	public NewProject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "startdate")
	private WebElement stDate;
	
	@FindBy(name = "enddate")
	private WebElement endDate ;
	
	@FindBy(name = "projectname")
	private WebElement projectName;
	
	@FindBy( xpath = "/html/body/div/div/div[2]/form/div[3]/div/div/div")
	private WebElement departmentName;
	
	@FindBy(xpath = "//li[text()='Electrical']")
	private WebElement deptName;
	
	public WebElement getDeptName() {
		return deptName;
	}

	@FindBy(name = "owner")
	private WebElement ownerName;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/form/div[5]/div/div/div")
	private WebElement sourceTemplate;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/li[1]")
	private WebElement template;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/form/div[6]/div/div/div")
	private WebElement projectType;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/li[1]")
	private WebElement pType;
	
	public WebElement getTemplate() {
		return template;
	}

	public WebElement getpType() {
		return pType;
	}

	@FindBy(name = "cost_center")
	private WebElement costCenter;
	
	@FindBy(name = "poc")
	private WebElement poc;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/form/div[9]/button")
	private WebElement submitButton ;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getStDate() {
		return stDate;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getDepartmentName() {
		return departmentName;
	}

	public WebElement getOwnerName() {
		return ownerName;
	}

	public WebElement getSourceTemplate() {
		return sourceTemplate;
	}

	public WebElement getProjectType() {
		return projectType;
	}

	public WebElement getCostCenter() {
		return costCenter;
	}

	public WebElement getPoc() {
		return poc;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	
	
	
	
	
	
}
