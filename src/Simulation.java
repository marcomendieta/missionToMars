import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private ArrayList<Item> items;
    private ArrayList<Rocket> rocketU1;
    private ArrayList<Rocket> rocketU2;

    public ArrayList<Item> loadItems(File file){
        return items;
    }

    public ArrayList<Rocket> loadU1(List<Item> itemU1){
        return rocketU1;
    }

    public ArrayList<Rocket> loadU2(List<Item> itemU2){
        return rocketU2;
    }

    public void runSimulation(List<Rocket> listRocket){
        System.out.println("Running simulation");
    }
}
