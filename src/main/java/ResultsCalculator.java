import data.AthleteBenchmarks;
import data.AthleteResult;

import java.util.List;

public interface ResultsCalculator {
    List<AthleteResult> calculate(List<AthleteBenchmarks> benchmarks);
}
