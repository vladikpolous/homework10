package ua.com.alevel;

public class Saturn extends Planet{
    @Override
    public double accceleration() {
        return AccelerationUtil.freeFallAcceleration(Saturn.this);
    }
    private static Saturn instance;

    private Saturn() {
        setName("Saturn");
        setMass(5.683 * Math.pow(10, 26));
        setRadius(58.232 * Math.pow(10, 6));
    }

    public static Saturn getInstance() {
        if (instance == null) {
            instance = new Saturn();
        }
        return instance;
    }

}
