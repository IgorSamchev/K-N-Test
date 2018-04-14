import data.AthleteBenchmarks;
import data.AthleteResult;

public interface ResultCalculator {
    AthleteResult calculate(AthleteBenchmarks athleteBenchmarks);
}
