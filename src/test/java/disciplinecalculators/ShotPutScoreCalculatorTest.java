package disciplinecalculators;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShotPutScoreCalculatorTest {
    private ShotPutScoreCalculator calculator = new ShotPutScoreCalculator();

    @Test (expected = IllegalArgumentException.class)
    public void minDistance() throws Exception  {
        calculator.calculate(1.49);
    }

    @Test
    public void forMinDistance0points() throws Exception {
        int actual = calculator.calculate(1.5);
        assertEquals(0, actual);
    }

    @Test
    public void for16Meters851Points() throws Exception {
        int actual = calculator.calculate(16);
        assertEquals(851, actual);
    }
}