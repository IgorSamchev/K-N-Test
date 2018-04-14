package disciplinecalculators;

import org.junit.Test;

import static org.junit.Assert.*;

public class Run1500ScoreCalculatorTest {
    private  Run1500ScoreCalculator calculator = new Run1500ScoreCalculator();

    @Test (expected = IllegalArgumentException.class)
    public void maxPossibleTimeIs480() throws Exception {
        int actual = calculator.calculate(481);
        assertEquals(0, actual);
    }

    @Test
    public void for480seconds0Points() throws Exception {
        int actual = calculator.calculate(480);
        assertEquals(0, actual);
    }

    @Test
    public void for300Seconds560Points() throws Exception {
        int actual = calculator.calculate(300);
        assertEquals(560, actual);
    }
}