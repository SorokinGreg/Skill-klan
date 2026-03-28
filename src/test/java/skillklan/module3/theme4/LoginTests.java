package skillklan.module3.theme4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
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
        driver.quit();
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"}
        };
    }

    @Test(dataProvider = "loginData")
    public void test(String loginName, String passName) {
        loginPage.enterUsername(loginName);
        loginPage.enterPassword(passName);
        loginPage.clickLogin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.findElements(By.id("contents_wrapper")).size() > 0, "not logIN");
        softAssert.assertAll();
        System.out.println("bingo");
    }
}