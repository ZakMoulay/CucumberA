package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
// stores all locators for the specific page try to write all locators u might need
    @FindBy(id="txtUsername")
    public WebElement usernameField;

    @FindBy(id="txtPassword")
    public WebElement passwordField;

    @FindBy(id="btnLogin")
    public WebElement loginButton;
    @FindBy(id = "spanMessage")
    public WebElement errorMeassageField;

    //to initialize all the elements of this page we have to call them inside constructor
    // we use initElements method from PageFactory class to initialize webElement objects
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

}
