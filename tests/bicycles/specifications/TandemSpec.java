package bicycles.specifications;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.Rides.BikeRide;
import bicycles.Rides.BikeRideOne;
import org.junit.jupiter.api.Test;

public class TandemSpec {

    @Test
    public void TandemSpecification(){

        BicycleSpecification tandemspec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle Tandemspecs = new BicycleFromSpec(tandemspec);
        BikeRide tSpecs = new BikeRideOne(Tandemspecs);
        tSpecs.ride();

        System.out.println(tandemspec.getAccelerationSpeed());

        System.out.println(tandemspec.getBrakeSpeed());

    }
}
