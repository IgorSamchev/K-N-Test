package disciplinecalculators;

public class HighJumpScoreCalculator implements ScoreCalculator {
    @Override
    public int calculate(double meters) {
        if (meters < 0.75) throw new IllegalArgumentException("Min high for High Jumps is 0,75 meters");
        return (int) (585.64 * Math.pow(meters - 0.75, 1.42));
    }
}
