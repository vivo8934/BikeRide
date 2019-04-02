package bicycles.specifications;

import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemSpec {

    @Test
    public void TandemSpecification(){

        BicycleSpecification tandemspec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        assertEquals(tandemspec.getAccelerationSpeed(), 12);
        assertEquals(tandemspec.getBrakeSpeed(), 7);

    }
}
