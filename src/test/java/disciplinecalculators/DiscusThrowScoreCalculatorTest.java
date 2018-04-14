package disciplinecalculators;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscusThrowScoreCalculatorTest {
    private DiscusThrowScoreCalculator calculator = new DiscusThrowScoreCalculator();

    @Test (expected = IllegalArgumentException.class)
    public void minDistance() throws Exception {
        int actual = calculator.calculate(3.9);
        assertEquals(0, actual);
    }

    @Test
    public void minDistance0Points() throws Exception {
        int actual = calculator.calculate(4);
        assertEquals(0, actual);
    }

    @Test
    public void for50Meteres870Points() throws Exception {
        int actual = calculator.calculate(50);
        assertEquals(870, actual);
    }
}