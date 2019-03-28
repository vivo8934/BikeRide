package bicycles.Rides;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideOneTest {

    @Test
    public void BikeRide1(){
        RoadBike bicycles = new RoadBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycles);
        bikeRide.ride();
        assertEquals(bikeRide.getCurrentSpeed(),  18);


    }

}