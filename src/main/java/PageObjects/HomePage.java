package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebElement searchBar;

    public HomePage(WebDriver driver) {
        this.searchBar = driver.findElement(By.id("searchString"));
    }

    public void searchText(String arg0) {
        this.searchBar.sendKeys(arg0);
        this.searchBar.sendKeys(Keys.RETURN);
    }
}
