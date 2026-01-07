package skillklan.module3.theme5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppleAirPodsPro3Page {
    WebDriver driver;
    @FindBy(tagName = "h1")
    private WebElement title;

    public AppleAirPodsPro3Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String titleTrue() {
        return title.getText();
    }
}
