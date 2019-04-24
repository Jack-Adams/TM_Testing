package stepdefs;

import PageObjects.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class SearchStepDefs {
    private WebDriver driver;

    @Before
    public void setup() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        options.addArguments("window-size=1200x600");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

    @Given("I am on (.*) with a search bar")
    public void iAmOnA_pageWithASearchBar(String url) {
        this.driver.get(url);
    }

    @When("I search (.*) in the search bar")
    public void iSearchInTheSearchBar(String searchTerm) {
        HomePage homePage = new HomePage(this.driver);
        homePage.searchText(searchTerm);
    }

    @Then("I see results relevant to (.*)")
    public void iSeeResultsRelevantTo(String searchTerm) {
        WebElement title = this.driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[9]/div[1]/a[1]/div/div[6]/div[1]"));
        String assertString = "";
        if (title.getText().toLowerCase().contains(searchTerm)) {
            assertString = searchTerm;
        }
        Assert.assertEquals(assertString, searchTerm);
    }
}