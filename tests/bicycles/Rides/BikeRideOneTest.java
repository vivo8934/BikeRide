package bicycles.Rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideOneTest {

    @Test
    public void RoadBike(){
        RoadBike bicycles = new RoadBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycles);
        bikeRide.ride();
        assertEquals(bikeRide.getCurrentSpeed(),  18);


    }

    @Test
    public void MountainBike(){
        MountainBike bicycles = new MountainBike();
        BikeRideOne mountainBike = new BikeRideOne(bicycles);
        mountainBike.ride();
        assertEquals(mountainBike.getCurrentSpeed(),  7);
    }

    @Test
    public void Tandem(){
        Tandem bicycles = new Tandem();
        BikeRideOne tandem = new BikeRideOne(bicycles);
        tandem.ride();
        assertEquals(tandem.getCurrentSpeed(),  17);
    }



}