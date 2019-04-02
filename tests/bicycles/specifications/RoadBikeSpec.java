package bicycles.specifications;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

public class RoadBikeSpec {

    @Test
    public void RoadBikeSpecification(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBikespecs = new BicycleFromSpec(roadBikeSpec);


        System.out.println(roadBikeSpec.getAccelerationSpeed());

        System.out.println(roadBikeSpec.getBrakeSpeed());
    }
}
