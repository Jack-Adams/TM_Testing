import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSearchAuctions {
    public WebDriver driver;
    private SearchAuctions auctionPage;
    public WebDriverWait wait;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src\\PageObjectModels\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        this.auctionPage = new SearchAuctions(driver);
    }

    @AfterTest
    public void tearDown() {
        this.driver.close();
        this.driver.quit();
    }

    @Test
    public void testTheSearchFunction(){
        auctionPage.searchForItem("gold");
        String searchResultsPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id='FiltersContainer']/h1"))).getText();
        Assert.assertEquals(searchResultsPageText, "Search results for 'gold'");
    }
}
