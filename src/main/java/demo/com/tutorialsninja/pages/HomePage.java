package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility
{

    By desktopLink = By.linkText("Desktops");
    By verifyText = By.xpath("//h2[contains(text(),'Desktops')]");
    By laptopNotebookLink = By.linkText("Laptops & Notebooks");
    By verifyText1 = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By componentsLink = By.linkText("Components");
    By verifyText2 = By.xpath("//h2[contains(text(),'Components')]");

    public void selectMenu(String menu)
    {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    public void clickOnDesktopLink()
    {
        clickOnElement(desktopLink);
    }

    public String getVerificationText()
    {
        return getTextFromElement(verifyText);
    }
    public void clickOnLaptopNotebooksLink()
    {
        clickOnElement(laptopNotebookLink);
    }
    public String getVerificationText1()
    {
        return getTextFromElement(verifyText1);
    }
    public void clickOnComponantsLink()
    {
        clickOnElement(componentsLink);
    }
    public String getVerificationText2()
    {
        return getTextFromElement(verifyText2);
    }

}
