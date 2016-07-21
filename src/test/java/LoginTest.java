import FacebookPages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @Before
    public void setupTest() {
        System.setProperty ("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login.php");
    }

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("supposedlyincorrectlogin", "supposedlyincorrectpassword");
        loginPage.isIncorrectLogin();
    }

    @After
    public void cleanStuff() {
        driver.close();
    }
}
