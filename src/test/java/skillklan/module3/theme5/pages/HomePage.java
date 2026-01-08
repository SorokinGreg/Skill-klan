package skillklan.module3.theme5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;


public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "//header//img[@class='v-logo__img']")
    private WebElement logo;
    @FindBy(id = "search-form__input")
    private WebElement inputSearch;
    @FindBy(css = "button.search-form__submit-button[type='submit']")
    private WebElement buttonSearch;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/header/div[1]/div[1]/div[2]/div/a")
    private WebElement buttonBuyers;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/header/div[1]/div[1]/div[2]/div/div/a[1]")
    private WebElement buttonDeliveryAndPayment;
    @FindBy(css = ".mh-button__wrap.active")
    private WebElement dropDownMenu;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToUrl() {
        driver.get("https://allo.ua");
    }

    public HomePage logoIsDisplayed() {
        Assert.assertTrue(logo.isDisplayed(), "Лого в верньому лівому кутку не відображається");
        System.out.println("Лого відображається");
        return this;
    }

    public HomePage inputSearchIsDisplayed() {
        Assert.assertTrue(inputSearch.isDisplayed(), "Поле для пошуку не видиме");
        System.out.println("Поле видиме");
        return this;
    }

    public HomePage enterInInputSearch(String word) {
        inputSearch.sendKeys(word);
        return this;
    }

    public HomePage searchButtonClick() {
        buttonSearch.click();
        return this;
    }

    public HomePage buttonBuyersIsDisplayed() {
        Assert.assertTrue(buttonBuyers.isDisplayed(), "Кнопка \"Покупцям\" не видима");
        System.out.println("Кнопка \"Покупцям\" видима");
        return this;
    }

    public HomePage buttonBuyersClick() {
        buttonBuyers.click();
        return this;
    }

    public HomePage buttonDeliveryAndPaymentIsDisplayed() {
        Assert.assertTrue(buttonDeliveryAndPayment.isDisplayed(), "Кнопка \"Доставка і оплата\" не видима");
        System.out.println("Кнопка \"Доставка і оплата\" видима");
        return this;
    }

    public HomePage buttonDeliveryAndPaymentClick() {
        buttonDeliveryAndPayment.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return this;
    }

    public HomePage dropDownMenuIsDisplayed() {
        Assert.assertTrue(dropDownMenu.isDisplayed(), "Меню \"Покупцям\" не відкрилося");
        System.out.println("Меню \"Покупцям\" відкрилося");
        return this;
    }
}
