package skillklan.module3.theme1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.saucedemo.com");
            driver.manage().window().maximize();

            String title = driver.getTitle();
            if (title.contains("Swag Labs")) {//NOTE: в такому випадку навіть якщо однин символ є в заголовку то буде true. вірно?
                System.out.println("Заголовок сторінки містить: " + title);
            } else {
                System.out.println("Заголовок сторінки невірний");
            }

//NOTE ДЗ10:

            List<WebElement> searchId = driver.findElements(By.id("user-name"));
            if (searchId.size() > 0) {
                System.out.println("Такий ID існує");
            } else {
                System.out.println("Такого ID немає");
            }
            List<WebElement> searchClass = driver.findElements(By.className("submit-button"));
            if (searchClass.size() > 0) {
                System.out.println("Такий ClassName існує");
            } else {
                System.out.println("Такого ClassName немає");
            }
            List<WebElement> searchXpath = driver.findElements(By.xpath("//div[@class='login_password']"));
            if (searchXpath.size() > 0) {
                System.out.println("Такий XPath існує");
            } else {
                System.out.println("Такого XPath немає");
            }
            List<WebElement> searchCss = driver.findElements(By.cssSelector("input[name='user-name']"));
            if (searchCss.size() > 0) {
                System.out.println("Такий CSS Selector існує");
            } else {
                System.out.println("Такого CSS Selector немає");
            }
        } finally {//NOTE: так finally виконується завжди ж, тобто драйвер закриється в любому випадку. Вірно?
            driver.quit();
        }
    }
}