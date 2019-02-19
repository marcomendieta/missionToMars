public class U1 extends Rocket{

    public U1(){
        cost = 100; //100 million
        weight = 10000;
        maxWeight = 18000;
        chanceLaunchExplosion = 0; // percent
        chanceLandingCrash = 0; // percent
        currentWeight = weight;
    }

    @Override
    public boolean launch() {
        int chanceLaunchExplosionRandom = (int)(Math.random() * 100 + 1);
        this.chanceLaunchExplosion = 5.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.chanceLaunchExplosion <= chanceLaunchExplosionRandom;
    }

    @Override
    public boolean land() {
        int chanceLandingCrashRandom = (int)(Math.random() * 100 + 1);
        this.chanceLandingCrash = 1.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.chanceLandingCrash <= chanceLandingCrashRandom;
    }
}
