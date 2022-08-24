package Parallel;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private WebDriver driver1;
	private ConfigReader configReader;
	Properties prop;
//	@Before(value = "@Skip", order = 0)
//		public void skip_scenario(Scenario scenario){
//			System.out.println("Skipped Scenario is +"+scenario.getName());
//			Assume.assumeTrue(false);
//		}

	@Before(order=0)
	public void getProperty() {
		 configReader=new ConfigReader();
		 prop=configReader.init_prop();
	}
	@Before(value = "@download", order=1)
	public void deleteDownloadedFiles() throws IOException {
		String downloadedFilePath = System.getProperty("user.dir")+"\\download\\";
		File f = new File(downloadedFilePath);
		FileUtils.cleanDirectory(f);
	}
	@Before(order=1) 
	public void launchBrowser() {
		String browserName=prop.getProperty("browser");
		driverFactory= new DriverFactory();
		driver= driverFactory.init_driver(browserName);
	}
//	@Before(order = 2)
//	public void launchBrowserForDownloadableProduct() throws IOException {
//		DriverForDownload driverManagerForDownload = new DriverForDownload();
//		driver1 = driverManagerForDownload.init_driver();
//		String downloadedFilePath = System.getProperty("user.dir")+"\\download\\";
//		File f = new File(downloadedFilePath);
//		FileUtils.cleanDirectory(f);
//	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
//	@After(order = 1)
//	public void browserQuitForDownloadableProduct(){
//		driver1.quit();
//	}
	@After(order=1)
	public void tearDown(Scenario scenario) {
			if(scenario.isFailed()) {
				String screenshotName= scenario.getName().replaceAll(" ", "_");
				byte[] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

				scenario.attach(sourcePath, "image/png", screenshotName);


		}
	}


	}



