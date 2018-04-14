package disciplinecalculators;

import disciplinecalculators.LongJumpScoreCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongJumpScoreCalculatorTest {

    private LongJumpScoreCalculator calculator = new LongJumpScoreCalculator();

    @Test(expected = IllegalArgumentException.class)
    public void minDistance() throws Exception {
        calculator.calculate(2.19);
    }

    @Test
    public void forMinDistance0points() throws Exception {
        int actual = calculator.calculate(2.2);
        assertEquals(0, actual);
    }

    @Test
    public void for7meters814points() throws Exception {
        int actual = calculator.calculate(7);
        assertEquals(814, actual);
    }
}