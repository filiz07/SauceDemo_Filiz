package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePages {

    public HomePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title']")
    public WebElement productcText;

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement usernameButton;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordButton;
    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginButton;
    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    public  WebElement clickbutton;
    @FindBy(xpath = "//*[@id='logout_sidebar_link']")
    public WebElement LogoutButton;
    @FindBy(xpath = "//div[@class='error-message-container error']")
    public WebElement warningMessage;







}
