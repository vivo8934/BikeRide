package bicycles.specifications;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

public class MountBikeSpec {

    @Test
    public void MountainBikeSpecification(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec( mountainBikeSpec );


        System.out.println(mountainBikeSpec.getAccelerationSpeed());
        System.out.println(mountainBikeSpec.getBrakeSpeed());
    }
}
