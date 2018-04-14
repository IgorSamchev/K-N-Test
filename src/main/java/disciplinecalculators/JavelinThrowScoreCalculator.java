package disciplinecalculators;

public class JavelinThrowScoreCalculator implements ScoreCalculator {
    @Override
    public int calculate(double meters) {
        if (meters < 7) throw new IllegalArgumentException("Min distance fir Javelin throw is 7 meters");
        return (int) (10.14 * Math.pow(meters - 7, 1.08));
    }
}
