package disciplinecalculators;

import org.junit.Test;

import static org.junit.Assert.*;

public class HighJumpScoreCalculatorTest {
    private HighJumpScoreCalculator calculator = new HighJumpScoreCalculator();

    @Test (expected = IllegalArgumentException.class)
    public void minDistance() throws Exception {
        calculator.calculate(0.74);
    }

    @Test
    public void minDistance0Points() throws Exception {
        int actual = calculator.calculate(0.75);
        assertEquals(0, actual);
    }

    @Test
    public void for2Meteres803Points() throws Exception {
        int actual = calculator.calculate(2);
        assertEquals(803, actual);
    }
}