package melodic_mind_pages;

import manager.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class MmHomePage extends BaseHelper {
    public MmHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "(//div[@class='app-btn__content'])[5]")
    WebElement laVocalOpenButton;

    public void openLaVocalApp() {
        new Actions(webDriver).scrollToElement(laVocalOpenButton).perform();
        laVocalOpenButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Set<String> windowHandles = webDriver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            webDriver.switchTo().window(windowHandle);
        }
    }
}
