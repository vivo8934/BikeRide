package bicycles.rides;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeTest {

    @Test
    public void BikeRide3(){

        RoadBike bicycles = new RoadBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycles);
        bikeRide.ride();
        assertEquals(bikeRide.getCurrentSpeed(),  76);

    }
}
