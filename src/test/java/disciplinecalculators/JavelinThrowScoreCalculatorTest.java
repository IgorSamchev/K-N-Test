package disciplinecalculators;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavelinThrowScoreCalculatorTest {
    private JavelinThrowScoreCalculator calculator = new JavelinThrowScoreCalculator();

    @Test (expected = IllegalArgumentException.class)
    public void minDistance() throws Exception {
        int actual = calculator.calculate(6.99);
        assertEquals(0, actual);
    }

    @Test
    public void minDistance0Points() throws Exception {
        int actual = calculator.calculate(7);
        assertEquals(0, actual);
    }

    @Test
    public void for76Meters981Points() throws Exception {
        int actual = calculator.calculate(76);
        assertEquals(981, actual);
    }
}