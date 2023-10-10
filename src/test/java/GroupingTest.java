import org.testng.annotations.Test;

public class GroupingTest {

    @Test(groups = {"sanity"})
    void test1() {
        System.out.println("This is Test 1");
    }

    @Test(groups = {"sanity"})
    void test2() {
        System.out.println("This is Test 2");
    }

    @Test(groups = {"regression"})
    void test3() {
        System.out.println("This is Test 3");
    }

    @Test(groups = {"smoke"})
    void test4() {
        System.out.println("This is Test 4");
    }
}
