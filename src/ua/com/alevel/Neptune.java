package ua.com.alevel;

public class Neptune extends Planet{
    @Override
    public double accceleration() {
        return AccelerationUtil.freeFallAcceleration(Neptune.this);
    }

    private static Neptune instance;

    private Neptune() {
        setName("Neptune");
        setMass(1.024 * Math.pow(10, 26));
        setRadius(24.622 * Math.pow(10, 6));
    }

    public static Neptune getInstance() {
        if (instance == null) {
            instance = new Neptune();
        }
        return instance;
    }
}
