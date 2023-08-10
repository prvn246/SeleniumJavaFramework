package StepDefinitions;


import PageObjects.Registerhtml;
import Utilities.TestContext;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;

public class RegisterhtmlStepdef {

    TestContext testContext;
    Registerhtml regisrationpage;

    public RegisterhtmlStepdef(TestContext context) {
        testContext = context;
        regisrationpage = testContext.getPageObjectManager().getRegisterhtmlPage();
    }

    @Given("I fill the registration form")
    public void fillAForm() {
        regisrationpage.FirstName.sendKeys("Seleniumuser");
        regisrationpage.LastName.sendKeys("Test");
        regisrationpage.Address.sendKeys("Hyd");
        regisrationpage.PhoneNumber.sendKeys("99495205");
        regisrationpage.MaleRadioButton.click();
        regisrationpage.CricketCheckBox.click();
        regisrationpage.LanguageTextbox.click();
        regisrationpage.LanguageTextboxArabic.click();
        Select skilldropdown = new Select(regisrationpage.Skilldropdown);
        skilldropdown.selectByVisibleText("Adobe InDesign");

    }
}
