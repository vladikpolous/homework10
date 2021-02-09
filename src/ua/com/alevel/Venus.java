package ua.com.alevel;

public class Venus extends Planet{
    @Override
    public double accceleration() {
        return AccelerationUtil.freeFallAcceleration(Venus.this);
    }
    private static Venus instance;

    private Venus() {
        setName("Venus");
        setMass(4.867 * Math.pow(10, 24));
        setRadius(6.0518 * Math.pow(10, 6));
    }

    public static Venus getInstance() {
        if (instance == null) {
            instance = new Venus();
        }
        return instance;
    }
}
