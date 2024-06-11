package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.DesktopPage;
import demo.com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends TestBase
{
    DesktopPage deskTopPage = new DesktopPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder()
    {
        deskTopPage.clickOnDesktopTab();
        deskTopPage.clickOnShowAllDesktop();
        deskTopPage.getOrigicalProductDisplayList();
        deskTopPage.getProductSortByZTOA();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully()
    {
        deskTopPage.clickOnCurrencyDropDown();
        deskTopPage.clickOnDesktopTab();
        deskTopPage.clickOnShowAllDesktop();
        deskTopPage.getOrigicalProductDisplayList();
        deskTopPage.getProductSortByAtoZ();
        deskTopPage.clickOnHPLP3065();
        Assert.assertEquals(deskTopPage.getTextHPLP3065(), "HP LP3065", "HP LP3065 not displayed");
        deskTopPage.selectDeliveryDate();
        deskTopPage.enterTheQuantity1();
        deskTopPage.clickOnAddToCartButton();
        Assert.assertEquals(deskTopPage.verifySuccessMessage(), "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×", "Success Message not displayed");
        deskTopPage.clickOnShoppingCartInToSuccessMessage();
        Assert.assertEquals(deskTopPage.getShoppingCartText(), "shopping cart", "Shopping Cart text not displayed");
        Assert.assertEquals(deskTopPage.getProductNameIsHPLP3065(), "HP LP3065", "Product name is not HP LP3065");
        Assert.assertEquals(deskTopPage.getTheDeliveryDateIs20231130(), "Delivery Date: 2023-11-30", "Delivery date is not 2023-11-30");
        Assert.assertEquals(deskTopPage.getTheModelIsProduct21(), "Product 21", "Error Message not displayed");
        Assert.assertEquals(deskTopPage.getToatl(), "£74.73");

    }

}
