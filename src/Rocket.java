public class Rocket implements SpaceShip {

    private int cost;
    private int weight;
    private int maxWeight;
    private int changeLaunchExplosion;
    private int chanceLandingCrash;
    private int currentWeight;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        int startingWeight = currentWeight + item.weight;
        return startingWeight <= maxWeight;
    }

    @Override
    public int carry(Item item) {
        currentWeight = item.weight + currentWeight;
        return currentWeight;

    }

}
