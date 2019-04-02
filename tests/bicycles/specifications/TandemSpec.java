package bicycles.specifications;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

public class TandemSpec {

    @Test
    public void TandemSpecification(){

        BicycleSpecification tandemspec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle Tandemspecs = new BicycleFromSpec(tandemspec);


        System.out.println(tandemspec.getAccelerationSpeed());

        System.out.println(tandemspec.getBrakeSpeed());

    }
}
