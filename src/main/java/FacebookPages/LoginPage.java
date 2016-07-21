package FacebookPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{

    private WebDriver driver;

    private By user = By.name("email");
    private By pwd = By.name("pass");
    private By submit = By.name("login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Login(String username, String password) {
        WebElement login = driver.findElement(user);
        login.sendKeys(username);
        WebElement pass = driver.findElement(pwd);
        pass.sendKeys(password);
        WebElement submitbutton = driver.findElement(submit);
        submitbutton.click();
    }

    public boolean isIncorrectLogin() {
        WebElement incorrectLogin = driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]"));
        WebDriverWait wait =  new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(incorrectLogin));
        return incorrectLogin.isDisplayed();
    }


}

