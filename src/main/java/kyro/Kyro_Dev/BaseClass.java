package kyro.Kyro_Dev;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	public static String text;
	public static WebElement element;
	public static int size;
	public static String output;
	public static Set<String> handles; 
	public static int scrollby;
	public static String value;
	
	//WEBELEMENT GET METHODS
		public static void webelementGetMethods(WebElement element, String type, String name) {
			switch (type) {
			case "attribute":
				String attribute = element.getAttribute(name);
				System.out.println(attribute);
				break;
			case "size":
				Dimension size = element.getSize();
				System.out.println(size);
				break;
			case "location":
				Point location = element.getLocation();
				System.out.println(location);
			case "text":
				String string = element.getText();
				System.out.println(string);
			}
		}
		
	//GET BROWSER
	public static WebDriver getBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
			"C:\\Users\\Nandu\\eclipse-workspace\\SeleniumJava\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
//		else if(browser.equalsIgnoreCase("ie"))
//			System.setProperty("webdriver.ie.driver",
//			"C:\\Users\\Nandu\\eclipse-workspace\\MavenProjectNew\\Driver\\ExtExport.exe");
//					driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	
	//DRIVER GET METHODS
	public static String driverGetMethods(WebDriver driver, String type) {
		switch (type) {
		case "title":
			output = driver.getTitle();
			break;
		case "currenturl":
			output = driver.getCurrentUrl();
			break;
		}
		return output;
	}
		
	//NAVIGATE METHODS
	public static void navigateBrowser(WebDriver driver, String type, String url) {
		if(type.equalsIgnoreCase("to")) 
			driver.navigate().to(url);
		else if(type.equalsIgnoreCase("forward")) 
			driver.navigate().forward();
		else if(type.equalsIgnoreCase("back")) 
			driver.navigate().back();
		else if(type.equalsIgnoreCase("refresh")) 
			driver.navigate().refresh();
		}
	
	//GET URL
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	
	}
	
	//CLOSE WINDOW
	public static void closeWindow(WebDriver driver) {
		driver.close();

	}
	
	//SENDKEYS
	public static void sendInput(WebElement element, String input) {
		
		element.sendKeys(input);
	}
	
	//SINGLE DROPDOWN
	public static void singleDropDown(WebElement element, String type, String input) {
		Select s = new Select(element);
		//System.out.println(type.equalsIgnoreCase("selectByValue"));
		if(type.equalsIgnoreCase("selectByValue")) {
		s.selectByValue(input);
		}
		
		else if (type.equalsIgnoreCase("selectbyindex")) {
			int parseInt = Integer.parseInt(type);
			s.selectByIndex(parseInt);	
		}
		
		else if(type.equalsIgnoreCase("selectbyvisibletext")) {
			s.selectByVisibleText(input);
		}
	}
	
	//WAITS
	public static void implicit(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void waits(String type,WebDriver driver, WebElement element) {
		 if (type.equalsIgnoreCase("implicit")) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		 else if (type.equalsIgnoreCase("explicit")) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
		}
		}

	//CLICK
	public static void clickOnMethods(WebElement e) {
		
		e.click();
		
	}
	
	//SCREENSHOT
	public static void takeScreenShot(File dest, WebDriver driver) throws Throwable {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, dest);

	}

	//FIND ELEMENT
	public static WebElement findElement(WebDriver driver, String locator, String type) {
		if(type.contains("xpath")) {
			element = driver.findElement(By.xpath(locator));}
		else if(type.contains("class")) {
			element = driver.findElement(By.className(locator));
		} else if(type.contains("id")) {
			element = driver.findElement(By.id(locator));
		} else if(type.contains("name")) {
			element = driver.findElement(By.name(locator));
		}
		return element;	
	}

	//ALERT OPERATION
	public static String alertOperation
		(WebElement element, String type ,String action, String prompt_text) {
		switch (type) {
		case "alert":
			element.click();
			text = driver.switchTo().alert().getText();
			if(action.contains("ok"))
				driver.switchTo().alert().accept();
			break;
		case "confirm":
			element.click();
			text = driver.switchTo().alert().getText();
			if(action.contains("ok"))
				driver.switchTo().alert().accept();
			else
				driver.switchTo().alert().dismiss();
			break;
		case "prompt":
			element.click();
			text = driver.switchTo().alert().getText();
			if (action.contains("ok")) {
				driver.switchTo().alert().sendKeys(prompt_text);
				driver.switchTo().alert().accept();
			}
			else if(action.contains("cancel")) 
				driver.switchTo().alert().dismiss();
			System.out.println(text);	
			break;
		}
		return text;
	}

	//MOUSE ACTIONS
	public static void actionsMouse(WebDriver driver, WebElement element, String type) {
		Actions act = new Actions(driver);
		if(type.contains("single"))
			act.contextClick(element).build().perform();
		else if(type.contains("double"))
			act.doubleClick(element).build().perform();
		
	}
	
	//KEYBOARD ACTIONS
	public static void actionKeyboard(String type) throws AWTException {
		Robot r = new Robot();
		switch (type) {
		case "tab":
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			break;

		case "window":
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			break;
		}
	}

	//QUIT
	public static void quitWindows(WebDriver driver) {
		driver.quit();
	}

	//FRAMES
	public static int iFrames(WebDriver driver, String type, String text) {
		
		switch (type) {
		case "size":
			size = driver.findElements(By.tagName("iframe")).size();
			break;
		case "single":
			driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
			WebElement t = driver.findElement(By.id("singleframe"));
			driver.switchTo().frame(t);
			WebElement txt = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			txt.sendKeys(text);
			break;
		case "switch":
			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			break;
		case "multiple":
			WebElement mul = driver.findElement(By.xpath("//*[text()='Iframe with in an Iframe']"));
			mul.click();
			driver.switchTo().frame(1);
			driver.switchTo().frame(0);
			WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			textbox.sendKeys(text);
		}
		return size;
	}
	
	//CHECK BOX
	public static void selectCheckBox(WebElement element, String type) {
		
		switch (type) {
		case "selectCheckBox":
			element.click();
			break;
		case "deselect":
			if(element.isSelected()) {	
				clickOnMethods(element);
			}
			break;
		case "selectAll":
			if(element.isSelected()) {	
			}
			else
			clickOnMethods(element);
			break;
			
		}
	}
	
	//WINDOWS HANDLING
	@SuppressWarnings("rawtypes")
	public static Set getWindowIds(WebDriver driver,String type, String closeId) {
		if(type.equalsIgnoreCase("getIds")) {
		handles = driver.getWindowHandles();
		for (String s : handles) {
			driver.switchTo().window(s).getTitle();
			System.out.println(s);
		}
		}
		else if(type.contains("closeparent")) {
			handles = driver.getWindowHandles();
			for (String s : handles) {
				String title = driver.switchTo().window(s).getTitle();
				if(title.contains(closeId))
					driver.close();
			}
			
		}
		return handles;
				
		}

	//IS ENABLED
	public static boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	
	//IS DISPLAYED
	public static boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
		
	}
	
	//IS SELECTED
	public static boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
		
	}

	//SCROLL PAGE
	public static void scrollBy(String type, String str, int x) {
		driver.get(str);
		driver.manage().window().maximize();
		if(type.equalsIgnoreCase("down")) {
			System.out.println("down");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+ 0 + "," + x + ")", "");
		}
		else if(type.equalsIgnoreCase("up")) {
		driver.manage().window().maximize();
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy("+ 0 + "," + (-x) + ")", "");
		}
	}
	
	//GET OPTIONS
	public static void getOptions(WebElement element, String option, String type) {
		switch (type) {
		case "getoptions":
			Select get = new Select(element);
			List<WebElement> options = get.getOptions();
			for (WebElement e : options) {
				option = e.getText();
				System.out.println(option);
			}
			break;

		case "first":
			Select first = new Select(element);
			WebElement firstSelectedOption = first.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
			break;
		
		
		case "all":
		Select get1 = new Select(element);
		List<WebElement> options1 = get1.getAllSelectedOptions();
		for (WebElement e : options1) {
			option = e.getText();
			System.out.println(option);
		}
	
	}

	
}
	public static String readData(String path, String sheet, int rowNum, int cellNum) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet2 = wb.getSheet(sheet);
		Row row = sheet2.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
			//System.out.println(value);
		}
			
		else if(cellType.equals(CellType.NUMERIC)) {
			double cellvalue = cell.getNumericCellValue();
			int data = (int) cellvalue;
			value = String.valueOf(data);
			//System.out.println(value);
		}
		wb.close();
		return value;
	}
	
	//IS MULTIPLE
	public static boolean isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	//RADIO BUTTON
	public static void radioButton(String type, WebElement element) {
		switch (type) {
		case "select":
			element.click();
			break;
		case "default":
			boolean selected = element.isSelected();
			System.out.println(selected);
			break;
		}
	}
	
	
}
