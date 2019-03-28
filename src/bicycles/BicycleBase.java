package bicycles;

public abstract class BicycleBase implements Bicycle {

    protected int speed;

    protected void changeSpeed ( int change ) {
        speed += change;
    }

    @Override
    public int currentSpeed ( ) {
        return speed;
    }

    @Override
    public void stop ( ) {
        speed = 0;
    }

    public BicycleType getBicycleType(BicycleType bicycleType) {
        return bicycleType;
    }
}