import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorCssHoWo {
    WebDriver driver = new ChromeDriver();

    @Test

    public void iLcarroTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts()
                .pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://ilcarro.web.app/search"); new page
        driver.navigate().to("https://ilcarro.web.app/search");
        pause(3);
        driver.navigate().refresh();// update page
        pause(3);
        WebElement termsofuse = driver.findElement(By.cssSelector("a[href='/terms-of-use' ]"));
        termsofuse.click();
        pause(3);
        WebElement search = driver.findElement(By.cssSelector("a[href='/search']"));
        search.click();
        pause(3);
        WebElement signup = driver.findElement(By.cssSelector("a[ng-reflect-router-link='registration']"));
        signup.click();
        pause(3);
        WebElement login = driver.findElement(By.cssSelector("a[ng-reflect-router-link='login']"));
        login.click();
        pause(3);
        driver.navigate().to("https://ilcarro.web.app/let-car-work");
        pause(3);
        driver.navigate().to("https://ilcarro.web.app/terms-of-use");
        pause(3);
        driver.navigate().to("https://ilcarro.web.app/registration?url=%2Fterms-of-use");
        pause(3);
        driver.navigate().to("https://ilcarro.web.app/login?url=%2Fsearch");
        //driver.close();
        driver.quit();


    }
    static void pause(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
