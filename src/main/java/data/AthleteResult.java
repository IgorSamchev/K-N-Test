package data;

public class AthleteResult {

    public final AthleteBenchmarks benchmarks;
    public final int totalScore;

    public AthleteResult(AthleteBenchmarks benchmarks, int totalScore) {
        this.benchmarks = benchmarks;
        this.totalScore = totalScore;
    }
}
