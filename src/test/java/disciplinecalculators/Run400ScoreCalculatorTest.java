package disciplinecalculators;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Run400ScoreCalculatorTest {
    private Run400ScoreCalculator calculator = new Run400ScoreCalculator();

    @Test (expected = IllegalArgumentException.class)
    public void maxPossibleTimeis82Seconds() throws Exception {
        int actual = calculator.calculate(82.1);
        assertEquals(0,actual);
    }

    @Test
    public void for82Seconds0Points() throws Exception {
        int actual = calculator.calculate(82);
        assertEquals(0, actual);
    }

    @Test
    public void for48Seconds909Points() throws Exception {
        int actual = calculator.calculate(48);
        assertEquals(909, actual);
    }
}