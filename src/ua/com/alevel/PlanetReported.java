package ua.com.alevel;

public class PlanetReported {
    public static String printInformation(Planet planet) {
        return "Name: " +
                planet.getName() +
                "\n" +
                "Free fall acceleration: " +
                planet.accceleration();
    }
}
