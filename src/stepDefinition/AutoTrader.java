package stepDefinition;

import java.awt.Window;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AutoTrader {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {

	}
	
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			driver.quit();	
		}
	}

@Given("^Open chrome and launch www\\.autotrader\\.com$")
public void open_chrome_and_launch_www_autotrader_com() throws Throwable {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
    //driver.manage().window().maximize();
    //driver.get("chrome://settings/clearBrowserData");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized");
    options.addArguments("disable-infobars");
    options.addArguments("--incognito");
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("applicationCacheEnabled", false);
    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    options.merge(capabilities);
    driver = new ChromeDriver(options);
    driver.manage().deleteAllCookies();  // Delete all cookies
    driver.get("https://www.autotrader.com/");
}

@When("^Home page is ready$")
public void home_page_is_ready() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//img[contains(@class,\"display-none\")][@alt='Autotrader Homepage']")));
    Assert.assertTrue("Verify home page display", driver.findElement(By.xpath("//*[text()='Search Cars for Sale']")).isDisplayed());
}

@Then("^Links buttons and drop down should be visible$")
public void links_buttons_and_drop_down_should_be_visible() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue("Verify Browse by Make link display", driver.findElement(By.xpath("//button[text()='Browse by Make']")).isDisplayed());
	Assert.assertTrue("Verify Browse by Style link display", driver.findElement(By.xpath("//button[text()='Browse by Style']")).isDisplayed());
	Assert.assertTrue("Verify Advanced Search link display", driver.findElement(By.xpath("//a[text()='Advanced Search']")).isDisplayed());
	Assert.assertTrue("Verify Search button display", driver.findElement(By.xpath("[id='search']")).isDisplayed());
	Assert.assertTrue("Verify Make drop down display", driver.findElement(By.xpath("[id='makeCode']")).isDisplayed());
	Assert.assertTrue("Verify Make drop down display", driver.findElement(By.xpath("[id='ModelCode']")).isDisplayed());
}

@Given("^Advanced search page is loaded$")
public void advanced_search_page_is_loaded() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//a[text()='Advanced Search']")).click();
	WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("[name='zip']")));
    Assert.assertTrue("Verify advanced search page display", driver.getTitle().contains("/advanced-search"));
}

@When("^Searched with attributes$")
public void searched_with_attributes() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("[name='zip']")).clear();
	driver.findElement(By.xpath("[name='zip']")).sendKeys("30004");
	driver.findElement(By.xpath("//label/*[@value='CERTIFIED']")).click();
	driver.findElement(By.xpath("//label/*[@value='CONVERT']")).click();
	Select startYear = new Select(driver.findElement(By.xpath("//select[@name='startYear']")));
	startYear.selectByVisibleText("2017");
	Select toYear = new Select(driver.findElement(By.xpath("//select[@name='endYear']")));
	toYear.selectByVisibleText("2020");
	Select Make = new Select(driver.findElement(By.xpath("//select[@name='makeFilter0']")));
	Make.selectByVisibleText("BMW");
	WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='modelFilter0']")));
    driver.findElement(By.xpath("//button[text()='Search']")).click();
}

@Then("^Results should be displayed according to criteria given$")
public void results_should_be_displayed_according_to_criteria_given() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("[name='zip']")));
    List<WebElement> webelements = driver.findElements(By.xpath("//div[contains(@class,'inventory-listing-body')]//h2"));
    System.out.println("Total number of make records displayed on page: "+webelements.size());
    for (WebElement option : webelements) {
    	Assert.assertTrue("Verify results displayed for BMW make", option.getText().trim().contains("BMW"));
    }
    
}

}
