package bicycles.specifications;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeSpec {

    @Test
    public void RoadBikeSpecification(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBikespecs = new BicycleFromSpec(roadBikeSpec);


        assertEquals(roadBikeSpec.getAccelerationSpeed(), 11);

        assertEquals(roadBikeSpec.getBrakeSpeed(), 4);
    }
}
