import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // Create a Simulation object
        Simulation sim = new Simulation();

        // Load Items for Phase-1 and Phase-2
        File phase1 = new File("phase-1.txt");
        File phase2 = new File("phase-2.txt");
        ArrayList<Item> listPhase1 = sim.loadItems(phase1);
        ArrayList<Item> listPhase2 = sim.loadItems(phase2);

        // Load a fleet of U1 rockets for Phase-1 and then for Phase-2
        ArrayList<Rocket> u1FleetPhase1 = sim.loadU1(listPhase1);
        ArrayList<Rocket> u1FleetPhase2 = sim.loadU1(listPhase2);


        // Run the simulation for phase 1 of U1 rockets and display the total budget required
        System.out.println("\nU1 rocket cost = 100");
        int budgetU1phase1 = sim.runSimulation(u1FleetPhase1);
        System.out.println("Budget of U1 fleet for phase 1 = " + budgetU1phase1 + " (millions)");

        // Run the simulation for phase 2 of U1 rockets and display the total budget required
        int budgetU1phase2 = sim.runSimulation(u1FleetPhase2);
        System.out.println("Budget of U1 fleet for phase 2 = " + budgetU1phase2 + " (millions)");
        System.out.println("Total budget of U1 fleet = " + (budgetU1phase1 + budgetU1phase2) + " (millions)\n");

        // Load a fleet of U2 rockets for Phase-1 and then for Phase-2
        ArrayList<Rocket> u2FleetPhase1 = sim.loadU2(listPhase1);
        ArrayList<Rocket> u2FleetPhase2 = sim.loadU2(listPhase2);

        // Run the simulation for phase 1 of U2 rockets and display the total budget required
        System.out.println("\nU2 rocket cost = 120");
        int budgetU2phase1 = sim.runSimulation(u2FleetPhase1);
        System.out.println("Budget of U2 fleet for phase 1 = " + budgetU2phase1 + " (millions)");

        // Run the simulation for phase 2 of U2 rockets and display the total budget required
        int budgetU2phase2 = sim.runSimulation(u2FleetPhase2);
        System.out.println("Budget of U2 fleet for phase 2 = " + budgetU2phase2 + " (millions)");
        System.out.println("Total budget of U1 fleet = " + (budgetU2phase1 + budgetU2phase2) + " (millions)\n");
    }

}
