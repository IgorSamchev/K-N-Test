import data.AthleteBenchmarks;
import data.AthleteResult;

import java.util.ArrayList;
import java.util.List;

public class ResultsCalculatorImpl implements ResultsCalculator {

    private ResultCalculator resultCalculator;

    public ResultsCalculatorImpl(ResultCalculator resultCalculator) {
        this.resultCalculator = resultCalculator;
    }

    @Override
    public List<AthleteResult> calculate(List<AthleteBenchmarks> benchmarks) {
        ArrayList<AthleteResult> result = new ArrayList<>();
        for (AthleteBenchmarks s :benchmarks){
            result.add(resultCalculator.calculate(s));
        }
        return result;
    }
}
