package disciplinecalculators;

public class PoleVaultScoreCalculator implements ScoreCalculator {
    @Override
    public int calculate(double meters) {
        if (meters < 1) throw new IllegalArgumentException("Min distance for Pole vault is 1 meter");
        return (int) (140.182 * Math.pow(meters - 1, 1.35));
    }
}
