package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SideBar_Navigation {
    WebDriver driver;

    //Sidebar
    By sideBarNavigation = By.id("ext-element-137");

    //Sidebar Pages

    public SideBar_Navigation(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSideBar() {
        driver.findElement(sideBarNavigation).click();
    }

}
