import org.testng.Assert;
import org.testng.annotations.*;

public class SecondTest {

    @BeforeClass
    void beforeClas(){
        System.out.println("This will run before the test class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will run after the test class");
    }

    @BeforeMethod
    void beforeTest(){
        System.out.println("=======================================");
        System.out.println("Should run before every test method :\n");
    }

    @AfterMethod
    void afterTest(){
        System.out.println("\nShould run after each test");
        System.out.println("=============================");
    }
    @Test(priority = 0)
    void test3(){
        System.out.println("This is testcase3");
    }


    @Test(priority = 1)
    void test4(){
        System.out.println("This is testcase4");
    }
}
