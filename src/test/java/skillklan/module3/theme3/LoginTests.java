package skillklan.module3.theme3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class LoginTests {
    WebDriver chrome;

    @BeforeMethod
    public void before() {
        chrome = new ChromeDriver();
        chrome.get("https://www.saucedemo.com");
        chrome.manage().window().maximize();
    }

//    @Test
//    public void test1() {
//        chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        String actualTitle = chrome.getTitle();
//        String expectedTitle = "Swag Lab";

    //NOTE:Assert
//    Assert.assertTrue(actualTitle.contains(expectedTitle), "Заголовок сторінки НЕ містить" + expectedTitle + ". Title: " + actualTitle);
//    Assert.assertEquals(expectedTitle, actualTitle, "Заголовок сторінки НЕ відповідає" + expectedTitle + ". Title: " + actualTitle);
//    System.out.println("Заголовок сторінки містить \"Swag Labs\"");

    //NOTE: DataProvider
    @DataProvider(name = "loginAndPass")
    public Object[][] loginAndPass() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "password123"},
                {"problem_user", "secret_sauce"}
        };
    }


    @Test(dataProvider = "loginAndPass")
    public void test2(String login, String pass) {
        chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String actualTitle = chrome.getTitle();
        String expectedTitle = "Swag Labs";

        //NOTE: DataProvider
        WebElement loginIn = chrome.findElement(By.id("user-name"));
        loginIn.sendKeys(login);
        System.out.println("Введено логін: " + login);
        WebElement passIn = chrome.findElement(By.id("password"));
        System.out.println("Введено пароль: " + pass);
        passIn.sendKeys(pass);


        //NOTE:SoftAssert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle, "Заголовок сторінки НЕ відповідає " + expectedTitle + ". Title: " + actualTitle);
//        softAssert.assertTrue(actualTitle.contains(expectedTitle), "Заголовок сторінки НЕ містить" + expectedTitle + ". Title: " + actualTitle);

        WebElement loginIs = chrome.findElement(By.id("user-name"));//тут якщо помилка то тест падає. цеж по завданню не правильно? тут якось можна/треба застосувати try/cash чи якусь іншу перевірку? чи я не так зрозумів і це стосувалось заголовку сторінки, що якщо там щось не так то тест не падає зразу як це буде з просто Assert.
        WebElement passIs = chrome.findElement(By.id("password"));
        softAssert.assertTrue(loginIs.isEnabled(), "not login");
        softAssert.assertTrue(passIs.isEnabled(), "not password");
        chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chrome.findElement(By.id("login-button")).click();
        softAssert.assertAll("fail");
        System.out.println("end");
    }

    @AfterMethod
    public void after() {
        chrome.quit();
    }
}
