public class Rocket implements SpaceShip {

    protected int cost;
    protected int weight;
    protected int maxWeight;
    protected double chanceLaunchExplosion;
    protected double chanceLandingCrash;
    protected int currentWeight;

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
