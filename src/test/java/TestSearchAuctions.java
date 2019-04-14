import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSearchAuctions {
    public WebDriver driver;
    public SearchAuctions auctionPage;
    public WebDriverWait wait;

    @BeforeTest
    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Jenkins\\workspace\\chromedriver.exe");
        System.out.println("Set chromedriver path");

        // Setting Chrome to headless
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
        System.out.println("Set chromedriver options");
        this.driver = new ChromeDriver(options);
        System.out.println("made new headless chromedriver");
        System.out.println(this.driver);
        //



        // Leave this uncommented unless using headless.
//        this.driver = new ChromeDriver();
//        System.out.println("Made new chromedriver");
//        System.out.println(this.driver);
        //



        wait = new WebDriverWait(driver, 20);
        System.out.println("Set wait");
        this.auctionPage = new SearchAuctions(driver);
        System.out.println("Reached TM sandbox website");
    }

    @AfterTest
    public void tearDown() {
        this.driver.close();
//        this.driver.quit();
    }

    @Test
    public void testTheSearchFunction(){
        auctionPage.searchForItem("gold");
        System.out.println("Entered gold into search bar");
        String searchResultsPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id='FiltersContainer']/h1"))).getText();
        System.out.println("Located element");
        Assert.assertEquals(searchResultsPageText, "Search results for 'gold'");
        System.out.println("Completed assertion");
    }
}