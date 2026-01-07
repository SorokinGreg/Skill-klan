package skillklan.module3.theme5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "//header//img[@class='v-logo__img']")
    private WebElement logo;
    @FindBy(id = "search-form__input")
    private WebElement inputSearch;
    @FindBy(css = "button.search-form__submit-button[type='submit']")
    private WebElement buttonSearch;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToUrl() {
        driver.get("https://allo.ua");
    }

    public void logoIs() {
        Assert.assertTrue(logo.isDisplayed(), "Лого в верньому лівому кутку не відображається");
        System.out.println("Лого відображається");
    }

    public void inputSearchIs() {
        Assert.assertTrue(inputSearch.isDisplayed(), "Поле для пошуку не видиме");
        System.out.println("Поле видиме");
    }

    public void enterInInputSearch(String word) {
        inputSearch.sendKeys(word);
    }

    public void searchButtonClick() {
        buttonSearch.click();
    }
}
