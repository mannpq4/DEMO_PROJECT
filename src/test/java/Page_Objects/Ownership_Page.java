package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ownership_Page {
    WebDriver driver;

    //Page Navigation XPath's/CSS/ID's
    //Global navigation elements
    By sideNavigation = By.id("ext-element-137");

    //constructor
    public Ownership_Page (WebDriver driver) {
        this.driver = driver;
    }

    //functions
    public void clickSideBar() {
        driver.findElement(sideNavigation).click();
    }

}
