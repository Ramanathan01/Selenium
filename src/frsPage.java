


import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class frsPage {

	WebDriver driver;

	public frsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//span[@class='addIcon']")
	WebElement addFindingsBtn;
	
	@FindBy(xpath="//span[contains(text(),'Delete')]")
	WebElement deleteBtn;
	
	@FindBy(xpath="//ol[@title='Select Category Details']")
	WebElement categoryDropDown;
	
	@FindBy(xpath="//textarea[@id='cf1']")
	WebElement textArea1;
	
	@FindBy(xpath="//textarea[@id='cf2']")
	WebElement textArea2;
	
	@FindBy(xpath="//textarea[@id='cf3']")
	WebElement textArea3;
	
	@FindBy(xpath="//ol[@title='Select Category Detail']/button/span/span")
	List<WebElement> categories ;
	
	@FindBy(xpath="//a[contains(text(),'Audit Note')]")
	WebElement auditNote;
	
	@FindBy(xpath="//a[contains(text(),'Observation')]")
	WebElement observation;
	
	@FindBy(xpath="//*[@id='categorizefindings']/div[4]/table/thead/tr/th[1]/div/div/div/md-checkbox")
	WebElement selectAllFindings;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement nextBtn;
	
	@FindBy(xpath="//button[contains(text(),'Confirm Categorization & Continue')]")
	WebElement nextPage;
	
	@FindBy(xpath="//button[@id='confirmationModalYes']")
	WebElement yesBtn;
	
	public void addFindings() {
		addFindingsBtn.click();
	}
	
	public void deleteFindings() {
		deleteBtn.click();
	}
	
	public void findings() {
		addFindings();
		textArea1.sendKeys("Testing One");
		
		addFindings();
		textArea2.sendKeys("Testing Two");
		
		addFindings();
		textArea3.sendKeys("Testing Three");
		
	}
	
	public void test() {
		waitUntil(2);
		selectAllFindings.click();
		categoryDropDown.click();
		auditNote.click();
		waitUntil(2);
		for(WebElement list:categories) {
			String value=list.getText();
			Assert.assertEquals(value, "Audit Note");
		}
		nextPage.click();
		yesBtn.click();
	}

  public void waitUntil(int i) {
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}