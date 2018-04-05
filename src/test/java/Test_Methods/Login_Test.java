package Test_Methods;

import Page_Objects.Login;
import Page_Objects.SideBar_Navigation;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

public class Login_Test {
    //need to setup driver preferences here and pass them into the test
    @Before



    @Test
    public void verifyValidLogin() {
        //create an object of ChromeOptoins, and initalize parameters to pass into driver constructer
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        //initialize the WebDriver with the options parameter passed in
        WebDriver driver = new ChromeDriver(options);


        //driver.manage().window().fullscreen();

        Login navigate = new Login(driver);

        navigate.NavigateURL("develop.q4desktop.com");
        navigate.typeLoginCredentials("mannp@q4inc.com", "mann1!");
        navigate.clickLoginButton();
        navigate.waitFunction(5);

        //sidebar navigation
        navigate.clickSideBar();
        navigate.waitFunction(12);

        driver.close();
    }

}
