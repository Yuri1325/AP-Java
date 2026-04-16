import java.util.function.DoubleUnaryOperator;

public class FrogSimulation {

    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;

    }

    private int hopDistance() {
        return 5;
    }

    public boolean simulate() {
        int position = 0;
        int hops = 0;
        while ((position < goalDistance) && position >= 0 && hops <= maxHops) {
            position += hopDistance();
            hops++;
        }
        return (position >= goalDistance);
    }

    public double runSimulations(int num) {
        int s = 0;
        for (int i = 0; i <= num; i++)
            s += (simulate()) ? 1 : 0;

        return (double) (s) / num;
    }
}
