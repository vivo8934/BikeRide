package bicycles.rides;


import bicycles.Bicycle;

public class BikeRideOne implements BikeRide {

    private Bicycle bicycle;
    public  BikeRideOne(Bicycle bicycle){
       this.bicycle = bicycle;
    }
    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
    }

    @Override
    public int getCurrentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
