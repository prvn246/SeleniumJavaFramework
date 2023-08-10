package StepDefinitions;


import Managers.AllDriverManager;
import PageObjects.AmazonWebPage;
import PageObjects.Registerhtml;
import Utilities.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class AmazonStepDefs {

    TestContext testContext;
    AmazonWebPage amazonWebPage;
    AllDriverManager driverManager;
    WebDriver driver;
    WebDriverWait wait ;

    public AmazonStepDefs(TestContext context) {
        testContext = context;
        driver=testContext.getDriverManager().getDriver();
        amazonWebPage = testContext.getPageObjectManager().getAmazonWebPage();
       wait= new WebDriverWait(driver,60);
    }

    @Given("I click on the second highest price TV link")
    public void i_click_on_the_second_highest_price_tv_link() {
    wait.until(ExpectedConditions.elementToBeClickable(amazonWebPage.HamburgerMenu));
    amazonWebPage.HamburgerMenu.click();
    wait.until(ExpectedConditions.elementToBeClickable(amazonWebPage.Electronics));
    amazonWebPage.Electronics.click();
        wait.until(ExpectedConditions.elementToBeClickable(amazonWebPage.Televisions));
    //amazonWebPage.Televisions.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",amazonWebPage.Televisions);
        wait.until(ExpectedConditions.elementToBeClickable(amazonWebPage.TopBrands));
    amazonWebPage.TopBrands.click();
        wait.until(ExpectedConditions.elementToBeClickable(amazonWebPage.Samsung));
    amazonWebPage.Samsung.click();
        wait.until(ExpectedConditions.elementToBeClickable(amazonWebPage.SortByFeature));
    amazonWebPage.SortByFeature.click();
        wait.until(ExpectedConditions.elementToBeClickable(amazonWebPage.HightoLow));
    amazonWebPage.HightoLow.click();
        wait.until(ExpectedConditions.elementToBeClickable(amazonWebPage.SecondHighestTv));
    amazonWebPage.SecondHighestTv.click();
    }
    @When("I switch to new tab")
    public void i_switch_to_new_tab() {
        String parentWindow = driver.getWindowHandle();
        Set listofwindows = driver.getWindowHandles();
        Iterator itr = listofwindows.iterator();
        while (itr.hasNext())
        {
            String currentWindow= (String) itr.next();
            if (!parentWindow.equalsIgnoreCase(currentWindow))
            {
            driver.switchTo().window(currentWindow);
            }
        }
    }
    @Then("I verify about this item element exists")
    public void i_verify_about_this_item_element_exists() {
        wait.until(ExpectedConditions.visibilityOf(amazonWebPage.AboutThisItem));
    boolean value=amazonWebPage.AboutThisItem.isDisplayed();
        Assert.assertTrue(value,"About this item description does not exists");
        System.out.println(amazonWebPage.Details.getText());
    }
}
