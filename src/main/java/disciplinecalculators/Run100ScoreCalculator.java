package disciplinecalculators;

public class Run100ScoreCalculator implements ScoreCalculator {
    @Override
    public int calculate(double seconds) {
        if (seconds > 18) throw new IllegalArgumentException("max run 100 time can be 18s");
        return (int) (25.4348 * Math.pow(18 - seconds, 1.81));
    }
}
