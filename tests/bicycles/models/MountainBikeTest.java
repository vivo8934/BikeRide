package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    @Test
    public void shouldAccellerate() {
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(bicycle.currentSpeed(),10);
    }

    @Test
    public void shouldBrake() {
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(bicycle.currentSpeed(),  2);
    }

    @Test
    public void shouldStop() {
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(bicycle.currentSpeed(), 0);

    }

    @Test
    public void shouldGetCurrentSpeed() {
        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(bicycle.currentSpeed(), 7);
    }

}
