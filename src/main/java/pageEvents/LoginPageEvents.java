package pageEvents;

import org.testng.Assert;
import pageObjects.LoginPageElements;
import utils.BaseTest;
import utils.ElementFetch;

public class LoginPageEvents {
    ElementFetch elementFetch = new ElementFetch();
    public void verifySignInPageOpenOrNot()
    {
        BaseTest.logger.info("Verifying if Sign In page has opened successfully");
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.signInText).size()>0,"Login Page not open");
        //Next line of code is to show a failed test case
        //Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.signInText).size()==0,"Login Page not open");
    }
    public void enterEmailId()
    {
        BaseTest.logger.info("Entering email ID");
        elementFetch.getWebElement("ID",LoginPageElements.emailAddress).sendKeys("testmail@gmail.com");
    }
}
