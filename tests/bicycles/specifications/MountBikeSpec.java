package bicycles.specifications;

import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountBikeSpec {

    @Test
    public void MountainBikeSpecification(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        assertEquals(mountainBikeSpec.getAccelerationSpeed(), 5);
        assertEquals(mountainBikeSpec.getBrakeSpeed(), 3);
    }
}
