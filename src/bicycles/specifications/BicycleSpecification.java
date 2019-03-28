package bicycles.specifications;

import bicycles.BicycleType;

public class BicycleSpecification {

    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycleType;


    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;

    }

    public int getAccelerationSpeed(){
        final int accelerationSpeed = this.accelerationSpeed;
        return accelerationSpeed;
    }

    public int getBrakeSpeed() {
        int brakeSpeed = this.brakeSpeed;
        return brakeSpeed;
    }

    public BicycleType getBicycleType(){
        return bicycleType;
    }
}
