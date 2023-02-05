import pk.*;

import java.awt.*;
import java.util.ArrayList;

public class PiratenKarpen {

    public static void main(String[] args) {
        System.out.println("Welcome to Piraten Karpen Simulator!");
        System.out.println("42 Games will be Simulated");
        GameSimulation Simulation = new GameSimulation(args);
        Simulation.simulateGame();
    }
}
