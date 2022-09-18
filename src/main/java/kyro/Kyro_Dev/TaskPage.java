package kyro.Kyro_Dev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	public static WebDriver driver;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div[1]/div")
	private WebElement selectProj;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div[2]/button")
	private WebElement createTask;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/div/input")
	private WebElement summary;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/div/input")
	private WebElement taskType;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/div/input")
	private WebElement description;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[4]/div/div/div/div")
	private WebElement priority;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/ul/li[2]")
	private WebElement priorityType;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[5]/div/div/div/input")
	private WebElement location;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[6]/div/div/div/input")
	private WebElement startDate;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[7]/div/div/div/input")
	private WebElement endDate;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/button")
	private WebElement submitButton;
	
	@FindBy(xpath = "/html/body/div/div/div/div/h2")
	private WebElement verifyTaskCreated;
	
	
	@SuppressWarnings("static-access")
	public TaskPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectProj() {
		return selectProj;
	}

	public WebElement getCreateTask() {
		return createTask;
	}

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getTaskType() {
		return taskType;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getPriority() {
		return priority;
	}

	public WebElement getPriorityType() {
		return priorityType;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getStartDate() {
		return startDate;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	
	public WebElement getVerifyTaskCreated() {
		return verifyTaskCreated;
	}
	
	
	
}
