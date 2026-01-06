package skillklan.module3.theme4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToUrl() {
        driver.get("https://www.saucedemo.com");
    }

    public void enterUsername(String login) {
        usernameInput.sendKeys(login);
    }

    public void enterPassword(String pass) {
        passwordInput.sendKeys(pass);
    }

    public void clickLogin() {
        loginButton.click();
    }
}
