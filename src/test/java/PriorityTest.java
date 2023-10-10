import org.testng.annotations.Test;

public class PriorityTest {
    @Test(priority = 1)
    void test1() {
        System.out.println("This is test 1");
    }

    @Test(priority = 2)
    void test2() {
        System.out.println("This is test 2");
    }

    @Test(priority = 3)
    void test3() {
        System.out.println("This is test 3");
    }

    @Test(enabled = false)
    void test4() {
        System.out.println("This is test 4");
    }
}
