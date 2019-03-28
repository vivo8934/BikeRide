package bicycles.Rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void FunRides() {
        FunRide bikeMax = new FunRide(8);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        BicycleSpecification tandemspec = new BicycleSpecification(12, 7, BicycleType.Tandem);


        Bicycle rBike1 = new bicycles.specifications.BicycleFromSpec(roadBikeSpec);
        Bicycle rBike = new bicycles.specifications.BicycleFromSpec(roadBikeSpec);
        Bicycle mRide = new bicycles.specifications.BicycleFromSpec(mountainBikeSpec);
        Bicycle tRide = new bicycles.specifications.BicycleFromSpec(tandemspec);

        bikeMax.accept(rBike);
        bikeMax.accept(rBike1);
        bikeMax.accept(mRide);
        bikeMax.accept(tRide);

        assertEquals(bikeMax.getCountForType(BicycleType.MountainBike), 1);
        assertEquals(bikeMax.getCountForType(BicycleType.RoadBike), 2);
        assertEquals(bikeMax.getCountForType(BicycleType.Tandem), 1);
        assertEquals(bikeMax.getEnteredCount(), 4);

    }

}