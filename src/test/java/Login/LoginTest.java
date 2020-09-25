package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    //import the selenium webDriver
    private WebDriver driver;
    //import the chromeDriver
    public void setUp() throws InterruptedException {
        System.setProperty ("webdriver.chrome.driver", "C:\\Users\\SOREMI TAIWO OLAMIDE\\Documents\\MONOSNAP_AUTOMATION_TEST\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();
        //input project URL = Monosnap login URL
        driver.get ("https://monosnap.com");
        //waiting for globally
        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        //maximize the window
        driver.manage ().window ().maximize ();
        //get page title
        System.out.println (driver.getTitle ());
        //locate sign In form
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[3]/span")).click();
        //locate username field
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[1]")).sendKeys ("Too_great1@yahoo.com");
        //locate password field
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[2]")).sendKeys ("Username#1234");
        //click on sign in button
        driver.findElement (By.xpath ("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click ();
        Thread.sleep (10000);
        //close the browser after test
        driver.quit();
    }

    //initiate the test run command
    public static void main(String[] args) throws InterruptedException {
        LoginTest test = new LoginTest ();
        test.setUp ();
    }
}

