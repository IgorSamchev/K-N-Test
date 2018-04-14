package disciplinecalculators;

public class Run1500ScoreCalculator implements ScoreCalculator {
    @Override
    public int calculate(double seconds) {
        if (seconds > 480) throw new IllegalArgumentException("Max time for Run 1500 meters is 480 seconds");
        return (int)(0.03768 * Math.pow(Math.abs((seconds) - 480), 1.85));
    }
}
