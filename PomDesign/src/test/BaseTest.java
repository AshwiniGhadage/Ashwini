package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import MainJava.LoginPage;
import MainJava.PimPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	protected LoginPage loginPage;
	protected PimPage pimPage;
	
	@BeforeClass
	public void launchBrowser()throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		}
	@BeforeClass
	public void pageObjects() {
		loginPage = new LoginPage(driver);
		pimPage = new PimPage(driver);
	}
	
	
}
