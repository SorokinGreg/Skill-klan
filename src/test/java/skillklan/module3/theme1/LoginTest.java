package skillklan.module3.theme1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // TODO(1): Обгорни основну логіку в try/finally.
        // Причина: якщо код впаде з помилкою — браузер не закриється.
        // try { ... } finally { driver.quit(); }
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        // TODO(2): В завданні написано "містить слово Swag Labs".
        // Тобто краще: title.contains("Swag Labs"), а не equals(), заодно і розбереш що таке contains
        if (title.equals("Swag Labs")) {
            System.out.println("Заголовок сторінки: " + title);
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

//            TODO (3): про це написав вище
            driver.quit();
        }
    }