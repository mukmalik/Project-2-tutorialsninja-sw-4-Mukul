package demo.com.tutorialsninja.testbase;

import demo.com.tutorialsninja.propertyreader.PropertyReader;
import demo.com.tutorialsninja.utilities.Utility;
import org.testng.annotations.AfterMethod;

public class TestBase extends Utility
{
    String browser = PropertyReader.getInstance().getProperty("browser");


    public void setUp()
    {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown()
    {
        //closeBrowser();
    }
}
