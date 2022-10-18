package pageEvents;

import pageObjects.HomePageElements;
import utils.BaseTest;
import utils.ElementFetch;

public class HomePageEvents {
    ElementFetch elementFetch = new ElementFetch();
    public void clickOnSignInButton()
    {
        BaseTest.logger.info("Clicking on Sign In Button");
        elementFetch.getWebElement("XPATH", HomePageElements.loginButton).click();
    }
}
