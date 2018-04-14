package disciplinecalculators;

public class LongJumpScoreCalculator implements ScoreCalculator {
    @Override
    public int calculate(double meters) {
        if (meters < 2.2) throw new IllegalArgumentException("Min long jump distance in 2.2 meters");
        return (int) (90.5674 * Math.pow(Math.abs(meters - 2.2), 1.4));
    }
}
