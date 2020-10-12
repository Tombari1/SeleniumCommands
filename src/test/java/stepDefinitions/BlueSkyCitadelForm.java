package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlueSkyCitadelForm {
    WebDriver driver;


    @Given("^I navigate to blueskycitadelform site$")
    //@Given("I navigate to blueskycitadelform site")
    public void i_navigate_to_blueskycitadelform_site()  {
        //STEP 2: set your system path
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        //STEP 3: Instantiate your firefox driver
        driver = new FirefoxDriver();

        //STEP 4: Navigate to url
        driver.get("http://blueskycitadel.com/");

    }

    @When("^I click on Automation Testing Form$")
    public void iClickOnAutomationTestingForm() {
        driver.findElement(By.linkText("Automation Testing Form")).click();

    }

    @And("^I enter the Single Line Text$")
    public void iEnterTheSingleLineText()  {
        driver.findElement(By.xpath("//*[@id=\"nf-field-135\"]")).sendKeys("My first line");

    }

    @And("^I click on the Home link$")
    public void iClickOnTheHomeLink() {
        driver.findElement(By.linkText("Home")).click();
    }

    @And("^I click on the About link$")
    public void iClickOnTheAboutLink() {
        driver.findElement(By.linkText("About")).click();

    }

    @And("^I click on some menu links$")
    public void iClickOnSomeMenuLinks() {
        //driver.findElement(By.linkText("Events")).click();
        driver.findElement(By.linkText("Contact")).click();

    }

    @Then("^I close my window$")
    public void iCloseMyWindow() {
        driver.close();
       // driver.quit();
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() {
        driver.findElement(By.id("nf-field-124")).sendKeys("myblueskyemail@test.com");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        driver.findElement(By.name("nf-field-144")).sendKeys("MySecureBlueSkyCitadelPassword");
    }

    @And("^I click on the radio button$")
    public void iClickOnTheRadioButton() {
        driver.findElement(By.cssSelector("#nf-label-class-field-138-0")).click();
    }

    @And("^I refresh the page$")
    public void iRefreshThePage() {
        driver.navigate().refresh();
    }

    @And("^I get the url title$")
    public void iGetTheUrlTitle() {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

    }

    @And("^I get the url of the page$")
    public void iGetTheUrlOfThePage() {
        String myUrl = driver.getCurrentUrl();
        System.out.println(myUrl);
    }

    @And("^I get the page Source$")
    public void iGetThePageSource() {
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }

    @And("^I get the Window Handle$")
    public void iGetTheWindowHandle() {
        String pageHnadle = driver.getWindowHandle();
        System.out.println(pageHnadle);

    }

    @And("^I get the form page title$")
    public void iGetTheFormPageTitle() {
        String pageFormTitle = driver.findElement(By.className("entry-title")).getText();
        System.out.println(pageFormTitle);

    }

    @And("^I get the attribute of an element$")
    public void iGetTheAttributeOfAnElement() {
        String pageFormAttribute =  driver.findElement(By.className("entry-title")).getAttribute("class");
        System.out.println(pageFormAttribute);
    }

    @And("^I type the password$")
    public void iTypeThePassword() {
        driver.findElement(By.name("nf-field-144")).sendKeys("Mypassword");

    }

    @And("^I clear the Password$")
    public void iClearThePassword() {

        driver.findElement(By.name("nf-field-144")).clear();

    }

    @And("^I click on the submit button$")
    public void iClickOnTheSubmitButton() {
        driver.findElement(By.xpath("//*[@id=\"nf-field-133-wrap\"]")).click();

    }

    @Then("^I navigate back to the previous page$")
    public void iNavigateBackToThePreviousPage() {
        driver.navigate().back();
    }

    @And("^I navigate to the next page using the forward button$")
    public void iNavigateToTheNextPageUsingTheForwardButton() {
        driver.navigate().forward();
    }

    @And("^the password error message is displayed$")
    public void thePasswordErrorMessageIsDisplayed() {

        String errorMessage = driver.findElement(By.cssSelector("#nf-form-errors-9 > nf-errors > nf-section > div")).getText();
        System.out.println(errorMessage);

       boolean isMessageDisplayed =  driver.findElement(By.cssSelector("#nf-form-errors-9 > nf-errors > nf-section > div")).isDisplayed();
        System.out.println(isMessageDisplayed);
    }

    @And("^I close the pop up menu$")
    public void iCloseThePopUpMenu() {
        driver.findElement(By.cssSelector(".pum-close")).click();
    }

}
