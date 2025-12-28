package skillklan.module3.theme4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "user-name")
    private WebElement loginFind;
    @FindBy(id = "password")
    private WebElement passFind;
    @FindBy(id = "login-button")
    private WebElement buttonFind;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToUrl() {
        driver.get("https://www.saucedemo.com");
    }

    public void setLogin(String login) {
        loginFind.sendKeys(login);
    }

    public void setPass(String pass) {
        passFind.sendKeys(pass);
    }

    public void buttonClick() {
        buttonFind.click();
    }
}
