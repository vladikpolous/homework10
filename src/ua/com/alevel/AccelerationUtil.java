package ua.com.alevel;

public class AccelerationUtil {

    private static final double G = 6.67 * Math.pow(10, -11);
    public static double freeFallAcceleration(Planet planet){
        return G * planet.getMass() / Math.pow(planet.getRadius(), 2);
    }
    }
