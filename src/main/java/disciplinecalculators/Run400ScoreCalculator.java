package disciplinecalculators;

public class Run400ScoreCalculator implements ScoreCalculator{

    @Override
    public int calculate(double seconds) {
        if (seconds > 82) throw new IllegalArgumentException("Max run 400 meters time can be 82s");
        return (int) (1.53775 * Math.pow(Math.abs(seconds - 82), 1.81));
    }
}
