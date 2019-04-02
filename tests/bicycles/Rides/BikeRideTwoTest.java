package bicycles.Rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTest {

    @Test
    public void BikeRide(){
        RoadBike bicycles = new RoadBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycles);
        bikeRide.ride();
        assertEquals(bikeRide.getCurrentSpeed(),  61);

    }

    @Test
    public void MountainBike(){
        MountainBike bicycles = new MountainBike();
        BikeRideTwo mountainBike = new BikeRideTwo(bicycles);
        mountainBike.ride();
        assertEquals(mountainBike.getCurrentSpeed(),  23);
    }

    @Test
    public void Tandem(){
        Tandem bicycles = new Tandem();
        BikeRideTwo tandem = new BikeRideTwo(bicycles);
        tandem.ride();
        assertEquals(tandem.getCurrentSpeed(),  56);
    }
}
