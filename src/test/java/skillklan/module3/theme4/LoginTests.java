package skillklan.module3.theme4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import skillklan.module3.theme4.pages.LoginPage;

public class LoginTests {
    LoginPage loginPage;
    WebDriver driver;

    @BeforeMethod
    public void start() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.goToUrl();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void off() {
//        driver.quit();
    }
    // TODO(1): Тут я б змінив назву на loginData
    @DataProvider(name = "loginAndPass")
    public Object[][] loginAndPass() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"}
        };
    }

    @Test(dataProvider = "loginAndPass")
    public void test(String loginName, String passName) {
        loginPage.setLogin(loginName);
        loginPage.setPass(passName);
        loginPage.buttonClick();
    }
}

// TODO(2): і найголовніше !!! де асерти ? наразі це у тебе просто клікалка, а не тест. Ти ніого не перевіряєш