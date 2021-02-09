package ua.com.alevel;

public class Jupiter extends Planet{
    private static Jupiter instance;

    private Jupiter() {
        setName("Jupiter");
        setMass(1.8986 * Math.pow(10, 27));
        setRadius(69.911 * Math.pow(10, 6));
    }

    public static Jupiter getInstance() {
        if (instance == null) {
            instance = new Jupiter();
        }
        return instance;
    }
    @Override
    public double accceleration() {
        return AccelerationUtil.freeFallAcceleration(Jupiter.this);
    }
}
