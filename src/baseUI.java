
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.LookAndFeel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.beust.jcommander.Parameters;




public class baseUI {
	public WebDriver driver;
	public static Properties p;


	SoftAssert softAssert = new SoftAssert();

	/****************** Invoke Browser 
	 * @param browserType ***********************/
	
	public void invokeBrowser(String browserType) {
		String nodeURL = "http://192.168.1.101:4444/wd/hub";
			if (browserType.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				driver = new ChromeDriver(options);

				//FOR GRID
//		        DesiredCapabilities capability = DesiredCapabilities.chrome();
//		        capability.setBrowserName("chrome");
//		        capability.setPlatform(Platform.WINDOWS);
//		        driver = new RemoteWebDriver(new URL(nodeURL), capability);
			} else if (browserType.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\resources\\geckodriver.exe");
				driver = new FirefoxDriver();
				//FOR GRID
//				DesiredCapabilities capability = DesiredCapabilities.firefox();
//		        capability.setBrowserName("firefox");
//		        capability.setPlatform(Platform.WINDOWS);
//		        driver = new RemoteWebDriver(new URL(nodeURL), capability);
			} 
		

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}

	
	
	public Properties getProperties() throws IOException {
		FileReader reader = new FileReader(System.getProperty("user.dir")+ "\\src\\test\\java\\maven\\config.properties");
		Properties p = new Properties();
		p.load(reader);
		return p;
	}

	/****************** Open URL 
	 * @throws IOException ***********************/
	public void openURL(String websiteURLKey) throws IOException {
			driver.get(getProperties().getProperty(websiteURLKey));
			//reportPass(websiteURLKey + " Identified Successfully");
}

	/****************** Close Browser ***********************/
	public void tearDown() {
		driver.close();

	}

	/****************** Quit Browser ***********************/
	public void quitBrowser() {
		driver.quit();

	}
	
}
