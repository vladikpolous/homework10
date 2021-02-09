package ua.com.alevel;

public class Mercury extends Planet{
    private static Mercury instance;

    @Override
    public double accceleration() {
        return AccelerationUtil.freeFallAcceleration(Mercury.this);
    }

    private Mercury() {
        setName("Mercury");
        setMass(3.285 * Math.pow(10, 23));
        setRadius(2.4397 * Math.pow(10, 6));
    }

    public static Mercury getInstance() {
        if (instance == null) {
            instance = new Mercury();
        }
        return instance;
    }

}
