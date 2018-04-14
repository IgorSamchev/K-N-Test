package disciplinecalculators;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Run100ScoreCalculatorTest {
    private Run100ScoreCalculator calculator = new Run100ScoreCalculator();

    @Test(expected = IllegalArgumentException.class)
    public void maxPossibleTimeIs18() throws Exception {
        int actual = calculator.calculate(18.1);
        assertEquals(0, actual);
    }

    @Test
    public void for18seconds0scores() throws Exception {
        int actual = calculator.calculate(18);
        assertEquals(0, actual);
    }

    @Test
    public void for11seconds861scores() throws Exception {
        int actual = calculator.calculate(11);
        assertEquals(861, actual);
    }
}