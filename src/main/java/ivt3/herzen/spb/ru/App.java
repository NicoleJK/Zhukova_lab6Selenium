package ivt3.herzen.spb.ru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class App
{
    public static void main( String[] args ){

            WebDriver driver = new FirefoxDriver();
            driver.get("http://www.herzen.spb.ru/search/");

            WebElement searchField = driver.findElement(By.cssSelector(".blockwh>div>form>input"));
            searchField.clear();
            searchField.sendKeys("Стипендия");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            System.out.println("Page title was: " + driver.getTitle());
            WebElement searchButton = driver.findElement(By.name("sval_send"));
            searchButton.click();
            WebElement searchElement = driver.findElement(By.cssSelector("#td010827>a"));
            searchElement.click();
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();

    }
    }


