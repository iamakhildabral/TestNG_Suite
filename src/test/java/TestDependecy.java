import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependecy {

    @Test
    void startVehicle(){
        System.out.println("Vehicle is started :");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startVehicle"})
    void driveVehicle(){
        System.out.println("Vehicle is driving");
    }

    @Test(dependsOnMethods = {"driveVehicle"})
    void stopVehicle(){
        System.out.println("Vehicle is stopped");
    }

    // dependency on two methods
    @Test(dependsOnMethods = {"driveVehicle","stopVehicle"},alwaysRun = true)
    void parkVehicle(){
        System.out.println("Vehicle is parked");
    }
}
