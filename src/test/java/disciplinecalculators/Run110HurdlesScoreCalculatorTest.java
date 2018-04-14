package disciplinecalculators;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Run110HurdlesScoreCalculatorTest {
   private Run110HurdlesScoreCalculator calculator = new Run110HurdlesScoreCalculator();

    @Test(expected = IllegalArgumentException.class)
    public void maxPossibleTimeIs28_5() throws Exception {
        int actual = calculator.calculate(28.6);
        assertEquals(0, actual);
    }

    @Test
    public void for28_5Seconds0Points() throws Exception {
        int actual = calculator.calculate(28.5);
        assertEquals(0,actual);
    }

    @Test
    public void for19Seconds432Points() throws Exception {
        int actual = calculator.calculate(19);
        assertEquals(432,  432);
    }
}