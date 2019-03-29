package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideTwo implements BikeRide {

    private Bicycle bicycle;
    public  BikeRideTwo(Bicycle bicycle){
        this.bicycle = bicycle;
    }
    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
    }

    @Override
    public int getCurrentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
