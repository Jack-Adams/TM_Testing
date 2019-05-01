package StepDefinitions;

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
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

    @Given("I am on {string} with a search bar")
    public void i_am_on_with_a_search_bar(String url) {
        this.driver.get(url);
    }

    @When("I search {string} in the search bar")
    public void iSearchInTheSearchBar(String searchTerm) {
        HomePage homePage = new HomePage(this.driver);
        homePage.searchText(searchTerm);
    }

    @Then("I see results relevant to {string}")
    public void iSeeResultsRelevantTo(String searchTerm) {
        WebElement title = this.driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[9]/div[1]/a[1]/div/div[6]/div[1]"));
        String assertString = "";
        if (title.getText().toLowerCase().contains(searchTerm)) {
            assertString = searchTerm;
        }
        Assert.assertEquals(assertString, searchTerm, "Found: testtesttest");
    }
}