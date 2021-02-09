package ua.com.alevel;

public class Uran extends Planet{
    @Override
    public double accceleration() {
        return AccelerationUtil.freeFallAcceleration(Uran.this);
    }
    private static Uran instance;
    private Uran() {
        setName("Uranus");
        setMass(8.681 * Math.pow(10, 25));
        setRadius(25.362 * Math.pow(10, 6));
    }

    public static Uran getInstance() {
        if (instance == null) {
            instance = new Uran();
        }
        return instance;
    }
}
