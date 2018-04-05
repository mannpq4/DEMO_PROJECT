package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Login {

    WebDriver driver;

    //Login page XPath's
    By username = By.xpath("//input[@name = 'user']");
    By password = By.xpath("//input[@name = 'password']");
    By loginButton = By.id("ext-button-2");


    //SideBar Navigation ID
    By sideBar = By.id("ext-element-137");


    public Login(WebDriver driver) {
        this.driver = driver;
    }

    //function that navigates to the URL
    public void NavigateURL(String URL) {
        driver.get(URL);
    }

    //function responsible for entering user login and password strings
    public void typeLoginCredentials(String user, String pass) {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(username).sendKeys(user);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(password).sendKeys(pass);
    }

    //function that clicks the login button
    public void clickLoginButton() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(loginButton).click();
    }

    //wait functions
    public void waitFunction(int waitTime) {
        driver.manage().timeouts().pageLoadTimeout(waitTime, TimeUnit.SECONDS);
    }

    //SideBar Navigation function
    public void clickSideBar() {
        driver.findElement(sideBar).click();
    }
}