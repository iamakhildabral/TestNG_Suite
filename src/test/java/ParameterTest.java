import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser,String url){
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    void verifyTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"X. It’s what’s happening / X","Title didn't match");
    }
}
