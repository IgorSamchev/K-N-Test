import data.AthleteBenchmarks;
import data.AthleteResult;
import disciplinecalculators.ScoreCalculator;

public class ResultCalculatorImpl implements ResultCalculator {
    public ScoreCalculator run100Calculator;
    public ScoreCalculator longJumpCalculator;
    public ScoreCalculator shotPutCalculator;
    public ScoreCalculator highJumpCalculator;
    public ScoreCalculator run400Calculator;
    public ScoreCalculator run110HurdlesCalculator;
    public ScoreCalculator discusCalculator;
    public ScoreCalculator poleVaultCalculator;
    public ScoreCalculator javelinThrowCalculator;
    public ScoreCalculator run1500Calculator;

    @Override
    public AthleteResult calculate(AthleteBenchmarks benchmarks) {
        int totalScore = run100Calculator.calculate(benchmarks.run100InSeconds)
                + longJumpCalculator.calculate(benchmarks.longJumpsInMeters)
                + shotPutCalculator.calculate(benchmarks.shotPutInMeters)
                + highJumpCalculator.calculate(benchmarks.highJumpsInMeters)
                + run400Calculator.calculate(benchmarks.run400InSeconds)
                + run110HurdlesCalculator.calculate(benchmarks.run110HurdlesInSeconds)
                + discusCalculator.calculate(benchmarks.discusThrowInMeters)
                + poleVaultCalculator.calculate(benchmarks.poleVaultInMeters)
                + javelinThrowCalculator.calculate(benchmarks.javelinThrowInMeters)
                + run1500Calculator.calculate(benchmarks.run1500InSeconds);
        return new AthleteResult(benchmarks, totalScore);
    }
}
