package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {

    @Test
    public void shouldAccellerate() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(bicycle.currentSpeed(),11);
    }

    @Test
    public void shouldBrake() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(bicycle.currentSpeed(),  7);
    }

    @Test
    public void shouldStop() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(bicycle.currentSpeed(), 0);
    }

    @Test
    public void shouldGetCurrentSpeed() {
        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(bicycle.currentSpeed(), 11);
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(bicycle.currentSpeed(), 18);

    }
}

