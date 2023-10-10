import org.testng.annotations.Test;

public class PriorAndSevereTest {

    @Test(priority = 1)
    void superCritical(){
        System.out.println("This is a very critical test case");
    }

    @Test(priority = 1)
    void anotherCritical(){
        System.out.println("This is another critical test case");
    }

    @Test(priority = 2)
    void high(){
        System.out.println("This is high priority");
    }

    @Test(priority = 3)
    void low(){
        System.out.println("This is low priority");
    }
}
