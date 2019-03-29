package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideThree  implements BikeRide {

    private Bicycle bicycle;
    public  BikeRideThree(Bicycle bicycle){
        this.bicycle = bicycle;
    }
    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
    }

    @Override
    public int getCurrentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
