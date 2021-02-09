package ua.com.alevel;

public class Mars extends Planet {

    private static Mars instance;

    private Mars() {
        setName("Mars");
        setMass(6.39 * Math.pow(10, 23));
        setRadius(3.3895 * Math.pow(10, 6));
    }

    public static Mars getInstance() {
        if (instance == null) {
            instance = new Mars();
        }
        return instance;
    }
    @Override
    public double accceleration() {
        return AccelerationUtil.freeFallAcceleration(Mars.this);
    }
}
