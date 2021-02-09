package ua.com.alevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlanetScanner {

    public static void main(String[] args) {
        Planet[] listOfPlanets = new Planet[]{Earth.getInstance(), Mars.getInstance(),Jupiter.getInstance(),
                Mercury.getInstance(),Neptune.getInstance(),Saturn.getInstance(),Uran.getInstance(),Venus.getInstance()};
        System.out.println("We have list of planets:");
        for (int i = 0; i < listOfPlanets.length; i++) {
            System.out.println( (i + 1) + " - " + listOfPlanets[i].getName());
        }
        System.out.println("Please enter the number of planet");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number > listOfPlanets.length){
            throw new RuntimeException("Do you really know how to read?");
        }
        System.out.println(PlanetReported.printInformation(listOfPlanets[number - 1]));
    }
}
