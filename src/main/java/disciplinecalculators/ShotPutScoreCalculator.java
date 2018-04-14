package disciplinecalculators;

public class ShotPutScoreCalculator implements ScoreCalculator {
    @Override
    public int calculate(double meters) {
        if (meters < 1.5) throw new IllegalArgumentException("Min distance for Shor put is 1.5 meters");
        return (int)(51.39 * Math.pow(meters - 1.5, 1.05));
    }
}
