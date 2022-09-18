package kyro.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import kyro.properties.Configuration_Reader;

public class Configuration_Reader {

	public static Properties p;
	public Configuration_Reader() throws Exception {
		File f = new File(
		"C:\\Users\\Nandu\\eclipse-workspace\\Kyro_Dev\\src\\test\\java\\kyro\\properties\\kyro.properties");
		FileInputStream fis =new  FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public static Configuration_Reader getInstanceCR() throws Exception {
		
  		Configuration_Reader reader = new Configuration_Reader();
  		
  		return reader;
  		
	}

}
