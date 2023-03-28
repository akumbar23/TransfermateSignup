package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Userdetails {

	public WebDriver ldriver;
	
	public Userdetails(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	By Corporate= By.xpath("//*[contains(text(),'Corporate')]//following::label[1]");
	
	By CountryOfIncorporation = By.xpath("//*[@id='country']");
	By FirstName = By.xpath("//*[@id='first_name']"); 
	By LastName = By.xpath("//*[@id='last_name']");
	By Email = By.xpath("//*[@id='email']");
	By MobileNumber = By.xpath("//*[@id='__pin_mobile_number_mobile_phone']");
	By AgreeTermsCheckBox = By.xpath("//*[contains(text(),'I have read and agree with the ')]//following::label[1]");
	By CheckAnyNewsOffer = By.xpath("//*[contains(text(),\"I'd like to hear about news and offers from TransferMate.\")]//following::label[1]");
	By Education = By.xpath("//*[contains(text(),'Education')]//following::label[2]");
	By Individual = By.xpath("//*[contains(text(),'Individual')]//following::label[1]");
	By SoleTrader = By.xpath("//*[contains(text(),'Sole Trader')]//following::label[1]");
	By Partnership = By.xpath("//*[contains(text(),'Partnership')]//following::label[1]");
	
	//Actions Methods
			
	
	
	public void clickOnCustomersCorporateMenu() {
		ldriver.findElement(Corporate).click();
		
	}
	public void clickOnEducationCorporateMenu() {
		ldriver.findElement(Education).click();
		
	}
	public void clickOnIndividualCorporateMenu() {
		ldriver.findElement(Individual).click();
		
	}
	public void clickOnSoleTraderMenu() {
		ldriver.findElement(SoleTrader).click();
		
	}
	public void clickOnPartnershipMenu() {
		ldriver.findElement(Partnership).click();
		
	}
	
	public void selectcountry(String conutry) {
	Select objSelect = new Select(ldriver.findElement(CountryOfIncorporation));
	objSelect.selectByVisibleText(conutry);
	}
	
	public void addfirstname(String Firstname) {
		
		ldriver.findElement(FirstName).sendKeys(Firstname);
	}
	
   public void addlastname(String lastname) {
		
		ldriver.findElement(LastName).sendKeys(lastname);
	}
   
   public void addEmail(String email) {
		
		ldriver.findElement(Email).sendKeys(email);
	}
   public void addMobileno(String MobileNo) {
		
		ldriver.findElement(MobileNumber).sendKeys(MobileNo);
	}
   public void clickOnAgreeTermCheck() throws InterruptedException {
	   
	   Thread.sleep(5000);
		ldriver.findElement(AgreeTermsCheckBox).click();
		
	}
   public void clickOnCheckAnyNews() {
		ldriver.findElement(CheckAnyNewsOffer).click();
		
	}
   
   public void closedriver() {
		ldriver.close();
		
	}
   public void Wait() throws Exception {
		Thread.sleep(5000);
		
	}
   
   


	
}
