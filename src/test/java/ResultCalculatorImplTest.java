import data.AthleteBenchmarks;
import data.AthleteResult;
import disciplinecalculators.ScoreCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResultCalculatorImplTest {
    private ResultCalculatorImpl calculator = new ResultCalculatorImpl();

    @Before
    public void setUp() throws Exception {
        calculator.run100Calculator = new ZeroCalculator();
        calculator.longJumpCalculator = new ZeroCalculator();
        calculator.shotPutCalculator = new ZeroCalculator();
        calculator.highJumpCalculator = new ZeroCalculator();
        calculator.run110HurdlesCalculator = new ZeroCalculator();
        calculator.discusCalculator = new ZeroCalculator();
        calculator.javelinThrowCalculator = new ZeroCalculator();
        calculator.run1500Calculator = new ZeroCalculator();
        calculator.run400Calculator = new ZeroCalculator();
        calculator.poleVaultCalculator = new ZeroCalculator();

    }

    @Test
    public void calculates100Run() throws Exception {
        calculator.run100Calculator = new FakeCalculator();
        AthleteBenchmarks athleteBenchmarks = new AthleteBenchmarks();
        athleteBenchmarks.run100InSeconds = 11.5;

        AthleteResult actual = calculator.calculate(athleteBenchmarks);

        assertEquals(11, actual.totalScore);
    }

    @Test
    public void calculatesLongJump() throws Exception {
        calculator.longJumpCalculator = new FakeCalculator();
        AthleteBenchmarks athleteBenchmarks = new AthleteBenchmarks();
        athleteBenchmarks.longJumpsInMeters = 11.5;

        AthleteResult actual = calculator.calculate(athleteBenchmarks);

        assertEquals(11, actual.totalScore);
    }

    @Test
    public void calculatesShotPut() throws Exception {
        calculator.shotPutCalculator = new FakeCalculator();
        AthleteBenchmarks athleteBenchmarks = new AthleteBenchmarks();
        athleteBenchmarks.shotPutInMeters = 11.5;

        AthleteResult actual = calculator.calculate(athleteBenchmarks);

        assertEquals(11, actual.totalScore);
    }

    @Test
    public void calculatesHighJump() throws Exception {
        calculator.highJumpCalculator = new FakeCalculator();
        AthleteBenchmarks athleteBenchmarks = new AthleteBenchmarks();
        athleteBenchmarks.highJumpsInMeters = 11.5;

        AthleteResult actual = calculator.calculate(athleteBenchmarks);

        assertEquals(11, actual.totalScore);
    }

    @Test
    public void calculates400m() throws Exception {
        calculator.run400Calculator = new FakeCalculator();
        AthleteBenchmarks athleteBenchmarks = new AthleteBenchmarks();
        athleteBenchmarks.run400InSeconds = 11.5;

        AthleteResult actual = calculator.calculate(athleteBenchmarks);

        assertEquals(11, actual.totalScore);
    }

    @Test
    public void calculates110mHurdles() throws Exception {
        calculator.run110HurdlesCalculator = new FakeCalculator();
        AthleteBenchmarks athleteBenchmarks = new AthleteBenchmarks();
        athleteBenchmarks.run110HurdlesInSeconds = 11.5;

        AthleteResult actual = calculator.calculate(athleteBenchmarks);

        assertEquals(11, actual.totalScore);
    }

    @Test
    public void calculatesDiscusThrow() throws Exception {
        calculator.discusCalculator = new FakeCalculator();
        AthleteBenchmarks athleteBenchmarks = new AthleteBenchmarks();
        athleteBenchmarks.discusThrowInMeters = 11.5;

        AthleteResult actual = calculator.calculate(athleteBenchmarks);

        assertEquals(11, actual.totalScore);
    }

    @Test
    public void calculatesPoleVault() throws Exception {
        calculator.poleVaultCalculator = new FakeCalculator();
        AthleteBenchmarks athleteBenchmarks = new AthleteBenchmarks();
        athleteBenchmarks.poleVaultInMeters = 11.5;

        AthleteResult actual = calculator.calculate(athleteBenchmarks);

        assertEquals(11, actual.totalScore);
    }

    @Test
    public void calculatesJavelinThrow() throws Exception {
        calculator.javelinThrowCalculator = new FakeCalculator();
        AthleteBenchmarks athleteBenchmarks = new AthleteBenchmarks();
        athleteBenchmarks.javelinThrowInMeters = 11.5;

        AthleteResult actual = calculator.calculate(athleteBenchmarks);

        assertEquals(11, actual.totalScore);
    }

    @Test
    public void calculates1500run() throws Exception {
        calculator.run1500Calculator = new FakeCalculator();
        AthleteBenchmarks athleteBenchmarks = new AthleteBenchmarks();
        athleteBenchmarks.run1500InSeconds = 11.5;

        AthleteResult actual = calculator.calculate(athleteBenchmarks);

        assertEquals(11, actual.totalScore);
    }

    @Test
    public void sumsScores() throws Exception {
        calculator.run100Calculator = new FakeCalculator();
        calculator.longJumpCalculator = new FakeCalculator();
        calculator.shotPutCalculator = new FakeCalculator();
        calculator.highJumpCalculator = new FakeCalculator();
        calculator.run110HurdlesCalculator = new FakeCalculator();
        calculator.discusCalculator = new FakeCalculator();
        calculator.javelinThrowCalculator = new FakeCalculator();
        calculator.run1500Calculator = new FakeCalculator();
        calculator.run400Calculator = new FakeCalculator();
        calculator.poleVaultCalculator = new FakeCalculator();
        AthleteBenchmarks athleteBenchmarks = new AthleteBenchmarks();
        athleteBenchmarks.run1500InSeconds = 1;
        athleteBenchmarks.javelinThrowInMeters = 1;
        athleteBenchmarks.poleVaultInMeters = 1;
        athleteBenchmarks.discusThrowInMeters = 1;
        athleteBenchmarks.run110HurdlesInSeconds = 1;
        athleteBenchmarks.run400InSeconds = 1;
        athleteBenchmarks.highJumpsInMeters = 1;
        athleteBenchmarks.shotPutInMeters = 1;
        athleteBenchmarks.longJumpsInMeters = 1;
        athleteBenchmarks.run100InSeconds = 1;

        AthleteResult actual = calculator.calculate(athleteBenchmarks);

        assertEquals(10, actual.totalScore);
    }

    private static class ZeroCalculator implements ScoreCalculator {

        @Override
        public int calculate(double benchmark) {
            return 0;
        }
    }

    private static class FakeCalculator implements ScoreCalculator{
        @Override
        public int calculate(double benchmark) {
            return (int)benchmark;
        }
    }


}