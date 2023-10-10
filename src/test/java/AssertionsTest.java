import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsTest {

    WebDriver driver = new ChromeDriver();

    @BeforeClass
    void setup() throws InterruptedException {
        String baseurl = "https://openai.com/dall-e-3";
        driver.get(baseurl);
        Thread.sleep(5000);
    }

    @Test
    void verifyTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"DALL·E 3","Title is not matching");
    }

    @AfterClass
    void closeBrowser(){
        driver.close();
    }
}
