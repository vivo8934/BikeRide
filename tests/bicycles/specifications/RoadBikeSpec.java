package bicycles.specifications;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.Rides.BikeRide;
import bicycles.Rides.BikeRideOne;
import org.junit.jupiter.api.Test;

public class RoadBikeSpec {

    @Test
    public void RoadBikeSpecification(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBikespecs = new BicycleFromSpec(roadBikeSpec);
        BikeRide rRide = new BikeRideOne(roadBikespecs);
        rRide.ride();

        System.out.println(roadBikeSpec.getAccelerationSpeed());

        System.out.println(roadBikeSpec.getBrakeSpeed());
    }
}
