package lavocal_pages;

import manager.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LvMainPage extends BaseHelper {
    public LvMainPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//button[@class='navigation-btn']")
    WebElement exercise;
    @FindBy(xpath = "(//button[@type='button'])[1]")
    WebElement burgerMenu;
    @FindBy(xpath = "//div[text()='Home']")
    WebElement menuHomeButton;
    @FindBy(xpath = "//span[text()=' Sign in/up ']")
    WebElement signInUpHeaderButton;
    @FindBy(xpath = "//span[text()=' Continue with Email ']")
    WebElement continueWithEmailButton;


    public void clickExerciseButton() {
        waitUntilClickable(exercise);
        exercise.click();
        pause(3000); // for music library loading
    }

    public void clickBurgerMenu() {
        burgerMenu.click();
    }

    public void clickMenuHomeButton() {
        menuHomeButton.click();
    }

    public void logInViaEmail() {
        waitUntilClickable(signInUpHeaderButton);
        signInUpHeaderButton.click();
        waitUntilClickable(continueWithEmailButton);
        continueWithEmailButton.click();
    }
}