package disciplinecalculators;

import org.junit.Test;

import static org.junit.Assert.*;

public class PoleVaultScoreCalculatorTest {
    private PoleVaultScoreCalculator calculator = new PoleVaultScoreCalculator();

    @Test (expected = IllegalArgumentException.class)
    public void minDistance() throws Exception {
        int actual = calculator.calculate(0.99);
        assertEquals(0, actual);
    }

    @Test
    public void minDistance0Points() throws Exception {
        int actual = calculator.calculate(1);
        assertEquals(0, actual);
    }

    @Test
    public void for5Meters910Points() throws Exception {
        int actual = calculator.calculate(5);
        assertEquals(910, actual);
    }
}