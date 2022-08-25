package MainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class PimPage extends BaseTest {
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement txtPage;
	
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	/* Author:ashwini ghadage
	 * Date:23 Aug 2022
	 * Description :this test method is used to verify PIM page title
	 */
	
	public String titleOfPimPage() {
	return txtPage.getText();
	}
	
	
	

}
