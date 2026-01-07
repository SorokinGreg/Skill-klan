package skillklan.module3.theme5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import skillklan.module3.theme5.pages.AppleAirPodsPro3Page;
import skillklan.module3.theme5.pages.HomePage;
import org.testng.annotations.Test;
import skillklan.module3.theme5.pages.SearchResultsPage;

import java.time.Duration;

public class TestAllo {
    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void start() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        homePage.goToUrl();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void finish() {
//        driver.quit();
    }

    @Test
    public void testLogoIs() {
        homePage.logoIs();
    }

    @Test
    public void testInputSearchIs() {
        String word = "Фен";
        homePage.inputSearchIs();
        homePage.enterInInputSearch(word);
        homePage.searchButtonClick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.wordInFirstElement(word);
    }

    @Test
    public void airPods() {
        String word = "AirPods 3";
        homePage.logoIs();
        homePage.inputSearchIs();
        homePage.enterInInputSearch(word);
        homePage.searchButtonClick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
//        searchResultsPage.wordInFirstElement(word);
        searchResultsPage.wordInSecondElement(word);
        String expectedTitle = searchResultsPage.getTextFirstElement();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        searchResultsPage.clickFirstElement();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        AppleAirPodsPro3Page appleAirPodsPro3Page = new AppleAirPodsPro3Page(driver);
        String actualTitle = appleAirPodsPro3Page.titleTrue();
        Assert.assertEquals(actualTitle, expectedTitle, "Очікувана назва товару: " + expectedTitle + "Актуальна назва товару: " + actualTitle);
        System.out.println("Очікувана назва товару відповідає актуальній назві товару");
    }
}
