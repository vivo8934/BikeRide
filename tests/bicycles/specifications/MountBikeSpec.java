package bicycles.specifications;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.Rides.BikeRide;
import bicycles.Rides.BikeRideOne;
import org.junit.jupiter.api.Test;

public class MountBikeSpec {

    @Test
    public void MountainBikeSpecification(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec( mountainBikeSpec );
        BikeRide mBikeRide = new BikeRideOne( mountainBike );
        mBikeRide.ride ( );

        System.out.println(mountainBikeSpec.getAccelerationSpeed());
        System.out.println(mountainBikeSpec.getBrakeSpeed());
    }
}
