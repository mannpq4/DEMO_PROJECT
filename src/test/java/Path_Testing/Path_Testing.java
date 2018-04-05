package Path_Testing;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Path_Testing {
    @Test
    public void pathMethod() {

        //attempt to remove the popup message problem
        // Create object of HashMap Class
        Map<String, Object> prefs = new HashMap<String, Object>();

        // Set the notification setting it will override the default setting
        prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
        ChromeOptions options = new ChromeOptions();

        // Set the experimental option
        options.setExperimentalOption("prefs", prefs);


        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().fullscreen();
        driver.get("https://develop.q4desktop.com");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //driver.findElement(By.id("ext-element-40")).click();
        driver.findElement(By.xpath("//input[@name = 'user']")).sendKeys("mannp@q4inc.com");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(("mann1!"));
        driver.findElement(By.id("ext-button-2")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.get("https://develop.q4desktop.com/#company/57b927debe1c33ae235ab315/ownership");
        driver.close();
    }

}
