

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Tuenti  {
    public static void main(String[] args) throws Exception{

        WebDriver driver = new FirefoxDriver();
        WebDriverWait driver_wait = new WebDriverWait(driver, 10);
        driver.get("https://www.tuenti.com/?m=Login");

        WebElement element = driver.findElement(By.id("email"));
        element.sendKeys("enrique+pedobear@tuenti.com");
        element = driver.findElement(By.id("input_password"));
        element.sendKeys("tuentitest");
        element = driver.findElement(By.id("submit_button"));
        element.click();

        driver_wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sharebox_suggestion_75042979")));
        element = driver.findElement(By.id("sharebox_suggestion_75042979"));
        element.click();
        element = driver.findElement(By.id("sharebox_commentfield_75042979"));
        element.sendKeys("Hola ni\u00f1os \u00f1am \u00f1am");
        element = driver.findElement(By.id("sharebox_savebutton_75042979"));
        element.click();
    }
}