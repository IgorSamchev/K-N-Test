import data.AthleteBenchmarks;
import data.AthleteResult;
import data.AthleteResultWithPlace;
import disciplinecalculators.*;

import java.io.File;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<AthleteBenchmarks> benchmarks = new FileParserImpl(new LineParserImpl()).parse(new File(args[0]));
        List<AthleteResult> results = getResultsCalculator().calculate(benchmarks);
        List<AthleteResultWithPlace> athleteResultWithPlaces = new ResultsSorterImpl().sort(results);
        new SortedResultsWriterImpl(new XmlResultFormatterImpl()).write(athleteResultWithPlaces, args[1]);

    }

    private static ResultsCalculator getResultsCalculator() {
        ResultCalculatorImpl resultCalculator = getResultCalculator();
        return new ResultsCalculatorImpl(resultCalculator);
    }

    private static ResultCalculatorImpl getResultCalculator() {
        ResultCalculatorImpl resultCalculator = new ResultCalculatorImpl();
        resultCalculator.run100Calculator = new Run100ScoreCalculator();
        resultCalculator.longJumpCalculator = new LongJumpScoreCalculator();
        resultCalculator.shotPutCalculator = new ShotPutScoreCalculator();
        resultCalculator.highJumpCalculator = new HighJumpScoreCalculator();
        resultCalculator.run400Calculator = new Run400ScoreCalculator();
        resultCalculator.run110HurdlesCalculator = new Run110HurdlesScoreCalculator();
        resultCalculator.discusCalculator = new DiscusThrowScoreCalculator();
        resultCalculator.poleVaultCalculator = new PoleVaultScoreCalculator();
        resultCalculator.javelinThrowCalculator = new JavelinThrowScoreCalculator();
        resultCalculator.run1500Calculator = new Run1500ScoreCalculator();
        return resultCalculator;
    }
}
