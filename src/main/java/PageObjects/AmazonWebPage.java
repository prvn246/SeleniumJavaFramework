package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AmazonWebPage {

    public AmazonWebPage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    public WebElement HamburgerMenu;

    @FindBy(xpath = "//div[text()='TV, Appliances, Electronics']")
    public WebElement Electronics;

    @FindBy(xpath = "//a[text()='Televisions']")
    public WebElement Televisions;

    @FindBy(xpath = "//span[text()='Top Brands' and @dir='auto']")
    public WebElement TopBrands;

    @FindBy(xpath = "//span[text()='Samsung']")
    public WebElement Samsung;

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    public WebElement SortByFeature;

    @FindBy(xpath = "//a[text()='Price: High to Low']")
    public WebElement HightoLow;

    @FindBy(xpath = "//img[@data-image-index='2']")
    public WebElement SecondHighestTv;

    @FindBy(xpath = "//h1[normalize-space(text())='About this item']")
    public WebElement AboutThisItem;

    @FindBy(xpath = "//ul[@class='a-unordered-list a-vertical a-spacing-mini']")
    public WebElement Details;

}
