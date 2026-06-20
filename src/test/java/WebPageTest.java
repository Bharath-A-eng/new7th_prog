import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class WebPageTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("YOUR_GITHUB_PAGES_URL");
    }

    @Test
    public void titleTest() {
        Assert.assertEquals(driver.getTitle(), "My Simple Website");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
