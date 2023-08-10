package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Registerhtml {

    public Registerhtml(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(xpath = "//input[@placeholder=\"First Name\"]")
    public WebElement FirstName;

    @FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
    public WebElement LastName;

    @FindBy(xpath = "//textarea[@ng-model=\"Adress\"]")
    public WebElement Address;

    @FindBy(xpath = "//input[@ng-model=\"EmailAdress\"]")
    public WebElement EmailAddress;

    @FindBy(xpath = "//input[@ng-model=\"Phone\"]")
    public WebElement PhoneNumber;

    @FindBy(xpath = "//input[@value=\"Male\"]")
    public WebElement MaleRadioButton;

    @FindBy(xpath = "//input[@value=\"Cricket\"]")
    public WebElement CricketCheckBox;

    @FindBy(xpath = "//div[@id=\"msdd\"]")
    public WebElement LanguageTextbox;

    @FindBy(xpath = " //li//a[text()=\"Arabic\"]")
    public WebElement LanguageTextboxArabic;

    @FindBy(xpath = "//select[@id=\"Skills\"]")
    public WebElement Skilldropdown;

}
