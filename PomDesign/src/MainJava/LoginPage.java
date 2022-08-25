package MainJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;          
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.BaseTest;

public class LoginPage extends BaseTest{
	
	//all the locators of page
	@FindBy(xpath="//*[text()='Username']//parent::div//parent::div//input")
	WebElement username;
	
	@FindBy(xpath="//*[text()='Password']//parent::div//parent::div//input")
	WebElement password;
	
	@FindBy(xpath="//*[text()=' Login ']")
	WebElement btnLogin;
	
	@FindBy(xpath="//h5[text()='Login']")
	WebElement txtLoginPage;
	
//initialization of locators/variables
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	//methods required to perform test steps
	/*author:ashwini Ghadage
	 * Date:23 aug 2022
	 * Description:This test method is used to perform login on login page
	 */
	
	public void loginMethod() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		btnLogin.click();
		
		
	}
	}
	
