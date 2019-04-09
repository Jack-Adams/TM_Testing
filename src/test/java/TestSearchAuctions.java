import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSearchAuctions {
    public WebDriver driver;
    private SearchAuctions auctionPage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src\\PageObjectModels\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.auctionPage = new SearchAuctions(driver);
    }

    @AfterTest
    public void tearDown() {
        this.driver.close();
        this.driver.quit();
    }

    @Test
    public void testTheSearchFunction(){

    }


}
