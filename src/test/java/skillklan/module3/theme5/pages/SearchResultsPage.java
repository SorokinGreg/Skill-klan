package skillklan.module3.theme5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class SearchResultsPage {
    WebDriver driver;
    @FindBy(className = "products-layout__item")
    private List<WebElement> elements;


    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void wordInFirstElement(String word) {
        WebElement firstElement = elements.getFirst();
        String textInElement = firstElement.findElement(By.cssSelector(".product-card__title")).getText();
        Assert.assertTrue(textInElement.contains(word), "Перший знайдений товар, не має слово \"" + word + "\"");
        System.out.println("Перший знайдений товар, має слово \"" + word + "\"");
    }

    public void wordInSecondElement(String word) {
        WebElement secondElement = elements.get(1);
        String textInElement = secondElement.findElement(By.cssSelector(".product-card__title")).getText();
        Assert.assertTrue(textInElement.contains(word), "Другий знайдений товар, не має слово \"" + word + "\"");
        System.out.println("Другий знайдений товар, має слово \"" + word + "\"");
    }

    public void clickFirstElement() {
        WebElement firstElement = elements.getFirst();
        firstElement.click();
    }

    public String getTextFirstElement() {
        WebElement firstElement = elements.getFirst();
        return firstElement.findElement(By.cssSelector(".product-card__title")).getText();
    }
}
