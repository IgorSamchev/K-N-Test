package disciplinecalculators;

public class DiscusThrowScoreCalculator implements ScoreCalculator {

    @Override
    public int calculate(double meters) {
        if (meters < 4) throw new IllegalArgumentException("Min distance for DiscusThrow is 4 meters");
        return (int) (12.91 * Math.pow(meters - 4, 1.1));
    }
}
