package bicycles;

public interface Bicycle {


    void accelerate();
    void stop();
    int currentSpeed();
    void brake();
    BicycleType getBicycleType();

}