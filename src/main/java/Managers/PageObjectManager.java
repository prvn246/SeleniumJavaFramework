package Managers;

import PageObjects.*;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import PageObjects.ProductDetailPage;
import PageObjects.ProductListPage;

public class PageObjectManager {

    private final WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductListPage productListPage;
    private ProductDetailPage productDetailPage;
    private Registerhtml registerhtml;
    private AmazonWebPage amazonWebPage;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //Short Hand If...Else
    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;
    }

    public Registerhtml getRegisterhtmlPage() {
        return (registerhtml == null) ? registerhtml = new Registerhtml(webDriver) : registerhtml;
    }

    public AmazonWebPage getAmazonWebPage() {
        return (amazonWebPage == null) ? amazonWebPage = new AmazonWebPage(webDriver) : amazonWebPage;
    }    //General If...Else
    public LoginPage getLoginPage() {

        if (loginPage == null) {
            loginPage = new LoginPage(webDriver);
        }
        return loginPage;
    }

    public ProductListPage getProductListPage() {
        return (productListPage == null) ? productListPage = new ProductListPage(webDriver) : productListPage;
    }

    public ProductDetailPage getProductDetailPage() {
        if (productDetailPage == null) productDetailPage = new ProductDetailPage(webDriver);
        return productDetailPage;
    }
}
