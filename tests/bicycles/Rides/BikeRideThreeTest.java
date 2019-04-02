package bicycles.Rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeTest {

    @Test
    public void RoadBike(){

        RoadBike bicycles = new RoadBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycles);
        bikeRide.ride();
        assertEquals(bikeRide.getCurrentSpeed(),  76);
    }

    @Test
    public void MountainBike(){
        MountainBike bicycles = new MountainBike();
        BikeRideThree mountainBike = new BikeRideThree(bicycles);
        mountainBike.ride();
        assertEquals(mountainBike.getCurrentSpeed(),  31);
    }
    @Test
    public void Tandem(){
        Tandem bicycles = new Tandem();
        BikeRideThree tandem = new BikeRideThree(bicycles);
        tandem.ride();
        assertEquals(tandem.getCurrentSpeed(),  75);

    }
}
