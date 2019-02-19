public class U2 extends Rocket{

    public U2 (){
        cost = 120;
        weight = 18000;
        maxWeight = 29000;
        chanceLaunchExplosion = 0;
        chanceLandingCrash = 0;
        currentWeight = weight;
    }

    @Override
    public boolean launch() {
        int chanceLaunchExplosionRandom = (int)(Math.random() * 100 + 1);
        this.chanceLaunchExplosion = 4.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.chanceLaunchExplosion <= chanceLaunchExplosionRandom;
    }

    @Override
    public boolean land() {
        int chanceLandingCrashRandom = (int)(Math.random() * 100 + 1);
        this.chanceLandingCrash = 8.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.chanceLandingCrash <= chanceLandingCrashRandom;
    }
}
