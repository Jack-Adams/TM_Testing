import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchAuctions {
    private WebDriver driver;
    private static final String SEARCH_AUCTION_URL = "https://www.tmsandbox.co.nz/";

    public SearchAuctions(WebDriver driver) {
        this.driver = driver;
        this.driver.get(SEARCH_AUCTION_URL);
    }

    public void searchForItem(String searchText){
        driver.findElement(By.id("searchString")).sendKeys(searchText);
        driver.findElement(By.xpath("//*[@id='generalSearch']/div[2]/button/span")).click();
    }
}


