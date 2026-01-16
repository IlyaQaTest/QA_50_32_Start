import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class SelectorsXpath {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phonebookTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/home");
        // SelectorsCss.pause(3); обращение к методу из другого класса
        pause(3);
        //WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        WebElement btnAbout = driver.findElement(By.
                xpath("//a[@href='/about']"));
        // //*[@href='/about']
        // //*[text()='ABOUT']
        btnAbout.click();
        pause(3);
        WebElement btnLogin = driver.findElement(By.
                xpath("//*[text()='LOGIN']"));
        btnLogin.click();
        pause(3);
        WebElement fieldEmail = driver.findElement(By.
                xpath("//input[@placeholder='Email']"));
        int i = new Random().nextInt(1000);
        fieldEmail.sendKeys("qwertyu"+i+"@gmail.com");
        pause(3);
        WebElement fieldPassword = driver.findElement(By.
                xpath("//*[@name='password']"));
        fieldPassword.sendKeys("Password123!");
        pause(3);
        WebElement btnRegistration = driver.findElement(By.
                xpath("//*[@name='registration']"));
        btnRegistration.click();
        pause(3);
        WebElement btnSignOut = driver.findElement(By.
                xpath("//button[text()='Sign Out']"));
        btnSignOut.click();
        pause(3);
        List<WebElement> buttons = driver.findElements
                (By.xpath("//button"));
        System.out.println(buttons);
        System.out.println(buttons.get(1).getText());
    }

    @Test
    public void iLcarroTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://ilcarro.web.app/search");
        pause(2);
                 //btnLogin
        WebElement loginLink = driver.findElement(By.
                xpath("//a[contains(text(),'Log in')]"));// //a[text()='Login']
        loginLink.click();
        pause(2);
        // ByclassName"ng-dirty"
        // Xpath //*[@class='ng-dirty ng-valid ng-touched']
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        emailField.clear();
        emailField.sendKeys("bug@bug.bug");
        pause(2);
                                                                              // //form/div[last()]/input
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.clear();
        passwordField.sendKeys("Bug#123^4567");
        pause(2);
        //  //button[text()='Y'lla'] //button[start-with(text()='Y'lla')]
        WebElement yallaButton = driver.findElement(By.xpath("//button[@type='submit']"));
                                                                         // //button[@type='submit']//..//.. (//all .dot .dot up in tree )
        yallaButton.click();
        pause(2);
        WebElement okButton = driver.findElement(By.xpath("//button[@class='positive-button ng-star-inserted']"));
        okButton.click();
        pause(2);
        WebElement logoutButton = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
        logoutButton.click();
        pause(2);
        driver.quit();


    }
    public void pause(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
