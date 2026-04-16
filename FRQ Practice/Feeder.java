public class Feeder implements Question {

    private int currentFood;

    public Feeder(int initialFood) {
        currentFood = initialFood;
    }

    public void simulateOneDay(int numBirds) {
        int bear = (int) (Math.random() * (100) + 1);
        if (bear <= 5)
            currentFood = 0;
        else {

            currentFood -= ((int) (Math.random() * (50 - 10) + 10)) * numBirds;
        }

        currentFood = (currentFood > 0) ? currentFood : 0;
    }

    public int simulatemManyDays(int numBirds, int numDays) {
        int count = 0;
        for (int i = 0; i <= numDays; i++) {
            if (currentFood == 0)
                break;
            simulateOneDay(numBirds);
            count++;
        }
        return count;
    }

    @Override
    public void Test() {

    }
}
