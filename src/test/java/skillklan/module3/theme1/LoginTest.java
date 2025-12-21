package skillklan.module3.theme1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // TODO(1): Обгорни тест у try/finally, щоб driver.quit() виконувався завжди,
        // навіть якщо буде помилка або ассерт не пройде.
        // try { ... } finally { driver.quit(); }
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        // TODO(2): Ти перевіряєш "Swag Lab", але правильний title: "Swag Labs" (з літерою s).
        // TODO(3): У завданні сказано "містить слово", краще використати contains:
        // if (title.contains("Swag Labs")) і якраз розбереш що це
        if (title.equals("Swag Lab")) {
            System.out.println("Заголовок сторінки: " + title);
        } else {
            System.out.println("Заголовок сторінки невірний");

            // TODO(4): Блок перевірок ДЗ10 не повинен бути всередині else.
            // Зараз локатори перевіряються тільки якщо title НЕ співпав.
            // Потрібно винести перевірки локаторів ПІСЛЯ перевірки title (поза if/else).

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
//            TODO(5): про це вже написав вище
            driver.quit();
        }
    }
}