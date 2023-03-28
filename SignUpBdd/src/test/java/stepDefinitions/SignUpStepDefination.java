package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import pageObjects.Userdetails;
import pageObjects.LoginPage;


public class SignUpStepDefination extends BaseClass
{
	@Before
	public void setup() throws IOException
	{
		//Logging
		logger=Logger.getLogger("nopCommerceSDET");
		PropertyConfigurator.configure("Log4j.properties");
		logger.setLevel(Level.DEBUG);
		
		//Load properties file
		configProp= new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		String br=configProp.getProperty("browser"); //getting the browser name from config.properties file
		
		//Launching browser
		if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		}

		else if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
			driver = new ChromeDriver();
		}
		
		else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver",configProp.getProperty("iepath"));
			driver = new InternetExplorerDriver();
		}
	
	}
	
	
	//Login steps....................
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		logger.info("************* Launching Browser *****************");
		lp=new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
	logger.info("************* Opening URL  *****************");
	driver.get(url);
	 driver.manage().window().maximize();
	}

	@When("Click on Corporate")
	public void click_on() {
	    // Write code here that turns the phrase above into concrete actions
	    addCust = new Userdetails(driver);
	    addCust.clickOnCustomersCorporateMenu();
	    
	}
	
	@When("Click on Education")
	public void click_on_Education() {
	    // Write code here that turns the phrase above into concrete actions
		addCust = new Userdetails(driver);
	    addCust.clickOnEducationCorporateMenu();
	    
	}
	
	@When("Click on Individual")
	public void click_on_Individual() {
	    // Write code here that turns the phrase above into concrete actions
		addCust = new Userdetails(driver);
	    addCust.clickOnIndividualCorporateMenu();
	    
	}
	@When("Click on Partnership")
	public void click_on_Partnership() {
	    // Write code here that turns the phrase above into concrete actions
		addCust = new Userdetails(driver);
	    addCust.clickOnPartnershipMenu();
	    
	}
	
	@When("Click on SoleTrader")
	public void click_on_SoleTrader() {
	    // Write code here that turns the phrase above into concrete actions
		addCust = new Userdetails(driver);
	    addCust.clickOnSoleTraderMenu();
	    
	}
	@Then("Select the country as {string}")
	public void select_the_country_as(String country) {
	    // Write code here that turns the phrase above into concrete actions
		addCust.selectcountry(country);
	    
	}

	@Then("enter the First name as {string}")
	public void enter_the_First_name_as(String First) {
	    // Write code here that turns the phrase above into concrete actions
		
		addCust.addfirstname(First);
	    
	}

	@Then("enter the Last name as {string}")
	public void enter_the_Last_name_as(String Last) {
	    // Write code here that turns the phrase above into concrete actions
	    addCust.addlastname(Last);
	}

	@Then("enter email address as {string}")
	public void enter_email_address_as(String Email) {
	    // Write code here that turns the phrase above into concrete actions
	    addCust.addEmail(Email);
	}

	@Then("enter Mobile phone number as {string}")
	public void enter_Mobile_phone_number_as(String Mnumber) {
	    // Write code here that turns the phrase above into concrete actions
	    addCust.addMobileno(Mnumber);
	}

	@Then("Agree terms and conditions")
	public void agree_terms_and_conditions() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)",' ');
		
		Actions a = new Actions(driver);
		//scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
	    addCust.clickOnAgreeTermCheck();
	}

	@Then("check any news and offers from Transfermate")
	public void check_any_news_and_offers_from_Transfermate() {
	    // Write code here that turns the phrase above into concrete actions
	    addCust.clickOnCheckAnyNews();
	}
	
	@Then("Close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	addCust.closedriver();
	
	}
	@Then("wait for elements to get load")
	public void Wait_for_Element() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	addCust.Wait();
	
	}
	
	
	
}
