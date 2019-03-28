package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemTest {

    @Test
    public void shouldAccellerate() {
        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        assertEquals(bicycle.currentSpeed(),12);
    }

    @Test
    public void shouldBrake() {
        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(bicycle.currentSpeed(),  5);
    }

    @Test
    public void shouldStop() {
        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(bicycle.currentSpeed(), 0);
    }

    @Test
    public void shouldGetCurrentSpeed() {
        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        assertEquals(bicycle.currentSpeed(), 12);
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(bicycle.currentSpeed(), 29);

    }


}
