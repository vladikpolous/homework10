package ua.com.alevel;

public class Earth extends Planet  {

    private static Earth instance;
    public Earth(){
        setName("Earth");
        setMass(5.972 * Math.pow(10, 24));
        setRadius(6.371 * Math.pow(10, 6));
    }
    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
    @Override
    public double accceleration() {
        return AccelerationUtil.freeFallAcceleration(Earth.this);
    }
}
