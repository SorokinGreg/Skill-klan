package skillklan.module3.theme5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class DeliveryAndPaymentPage {
    WebDriver driver;

    //    @FindBy(xpath = "//div[contains(@class,'sp-main-tab')]//button[normalize-space()='Як оформити замовлення?']")
//    private WebElement buttonHowToPlaceOrder;
    @FindBy(xpath = "//div[contains(@class,'sp-main-tab')]//button[contains(@class,'sp-tablinks') and contains(@class,'active')]")
    private WebElement buttonHowToPlaceOrder;

    public DeliveryAndPaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public DeliveryAndPaymentPage deliveryAndPaymentTitleIsTrue() {
        String expectedTitle = "Доставка і оплата";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title не має текст \"Доставка і оплата\"");
        System.out.println("Title має текст \"Доставка і оплата\"");
        return this;
    }

    public DeliveryAndPaymentPage howToPlaceOrderIsDisplayed() {
        Assert.assertTrue(buttonHowToPlaceOrder.isDisplayed(), "Елемент \"Як оформити замовлення\" не видимий на сторінці");
        System.out.println("Елемент \"Як оформити замовлення\" видимий на сторінці");
        String expectedText = "Як оформити замовлення";
        String actualText = buttonHowToPlaceOrder.getText();
        Assert.assertTrue(actualText.contains(expectedText), "Елемент " + actualText + " не має текст " + expectedText);
        System.out.println("Елемент " + actualText + " має текст " + expectedText);
        return this;
    }
}
