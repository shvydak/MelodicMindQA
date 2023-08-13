package tests.la_vocal_tests;

import com.github.javafaker.Faker;
import manager.TestDataProvider;
import manager.UserLogin;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

public class AddNewExerciseTests extends BaseTests {
    @BeforeClass
    public void preConditions() {
        app.mmHomePage().openLaVocalApp();
    }

    @Test(enabled = false, invocationCount = 3)
    public void addNewExerciseWOLoginSuccess() {
        String exerciseName = Faker.instance().animal().name();

        app.lvMainPage().clickExerciseButton();
        app.lvExercisesPage().clickNewExerciseButton();
        app.lvExercisesPage().fillExerciseName(exerciseName);
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListUnison();
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListMajorTriad();
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListMinorTriad();
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListPerfectFifth();
        app.lvExercisesPage().clickAddNotesButton();
        app.lvExercisesPage().clickOnKeys();
        app.lvExercisesPage().clickOnSaveButton();
        app.lvExercisesPage().clickSaveExerciseButton();
        Assert.assertTrue(app.lvExercisesPage().isExerciseSaved(exerciseName));
        app.lvExercisesPage().maxNumberOfItems(2);
    }

    @Test(dataProvider = "loginDataProvider", dataProviderClass = TestDataProvider.class)
    public void addNewExerciseWithLoginSuccess(UserLogin user) {
        String exerciseName = Faker.instance().animal().name();

        app.lvMainPage().logInViaEmail();
        app.signInUpPage().fillAndSubmitSignInForm(user);

        app.lvMainPage().clickExerciseButton();
        app.lvExercisesPage().clickNewExerciseButton();
        app.lvExercisesPage().fillExerciseName(exerciseName);
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListUnison();
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListMajorTriad();
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListMinorTriad();
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListPerfectFifth();
        app.lvExercisesPage().clickAddNotesButton();
        app.lvExercisesPage().clickOnKeys();
        app.lvExercisesPage().clickOnSaveButton();
        app.lvExercisesPage().clickSaveExerciseButton();
        Assert.assertTrue(app.lvExercisesPage().isExerciseSaved(exerciseName));
        app.lvExercisesPage().maxNumberOfItems(4);
    }

    @AfterMethod
    public void returnToMainPage() {
        app.lvMainPage().clickBurgerMenu();
        app.lvMainPage().clickMenuHomeButton();
    }
}
