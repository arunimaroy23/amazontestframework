    import org.testng.annotations.Test;
    import pageEvents.HomePageEvents;
    import pageEvents.LoginPageEvents;
    import utils.BaseTest;

    public class SampleTest extends BaseTest {
        HomePageEvents homePageevents = new HomePageEvents();
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        @Test
        public void sampleMethodForEmailEntering()
        {
        homePageevents.clickOnSignInButton();
        loginPageEvents.verifySignInPageOpenOrNot();
        loginPageEvents.enterEmailId();
        }

    }
