package kyro.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import kyro.Kyro_Dev.BaseClass;
import kyro.properties.Configuration_Reader;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Nandu\\eclipse-workspace\\Kyro_Dev\\src\\main\\Resource", 
glue="kyro.stepdefinition", 
monochrome = true, 
//tags = {"~@invalidCredentials"},
plugin = {"html:Report/Html_Report",
		"pretty",
		 "json:Report/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Report.html"} )
public class Kyro_Runner extends BaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception {
		driver = getBrowser(Configuration_Reader.getInstanceCR().getBrowser());	
	}
	
	
	@AfterClass
	public static void tearDown() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.close();
	}
	//
}


