package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase
{
    HomePage homepage = new HomePage();


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homepage.clickOnDesktopLink();
        homepage.selectMenu("Show All Desktops");
        Assert.assertEquals(homepage.getVerificationText(), "Desktops", "Error Message not displayed");

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        homepage.clickOnLaptopNotebooksLink();
        homepage.selectMenu("Show All Laptops & Notebooks");
        Assert.assertEquals(homepage.getVerificationText1(), "Laptops & Notebooks", "Error Message not displayed");

    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homepage.clickOnComponantsLink();
        homepage.selectMenu("Show All Components");
        Assert.assertEquals(homepage.getVerificationText2(), "Components", "Error Message not displayed");
    }

}
