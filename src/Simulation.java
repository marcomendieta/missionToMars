import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {
    private ArrayList<Item> items;
    private ArrayList<Rocket> rocketU1 = new ArrayList<>();
    private ArrayList<Rocket> rocketU2 = new ArrayList<>();

    public ArrayList<Item> loadItems(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        items = new ArrayList<>();

        while(scan.hasNextLine()){
            String line = scan.nextLine();
            String[] oneItem = line.split("=");
            items.add(new Item(oneItem[0], Integer.valueOf(oneItem[1])));
        }
        // To print out phase.text
        System.out.println(file.getPath() + " contains " + items.size() + " items");

        return items;
    }

    public ArrayList<Rocket> loadU1(List<Item> items){
        Rocket rocket1 = new U1();

        for (Item itemU1 : items) {
            while (!rocket1.canCarry(itemU1)){
                rocketU1.add(rocket1);
                rocket1 = new U1();
            }
            rocket1.carry(itemU1);
        }
        return rocketU1;
    }

    public ArrayList<Rocket> loadU2(List<Item> items){
        Rocket rocket2 = new U2();

        for (Item itemU2 : items) {
            while (!rocket2.canCarry(itemU2)){
                rocketU2.add(rocket2);
                rocket2 = new U1();
            }
            rocket2.carry(itemU2);
        }
        return rocketU2;
    }

    public int runSimulation(List<Rocket> listRocket){
        int numFailed = 0;
        for (Rocket r : listRocket) {
            while (!r.launch()) {
                r.launch();
                numFailed++;
            }
            while (!r.land()) {
                r.land();
                numFailed++;
            }
        }
        int budget = listRocket.get(0).cost * (listRocket.size() + numFailed);
        System.out.println(listRocket.size() + " rockets and " + numFailed + " extra trials = ");
        return budget;
    }
}
