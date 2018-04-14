package disciplinecalculators;

public class Run110HurdlesScoreCalculator implements ScoreCalculator {
    @Override
    public int calculate(double seconds) {
        if (seconds > 28.5) throw new IllegalArgumentException("Max run 110 meters Hurdles time can be 28.5s");
        return (int)(5.74352 * Math.pow(Math.abs(seconds - 28.5), 1.92));
    }
}
