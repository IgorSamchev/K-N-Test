package data;

import org.junit.Test;
import sun.awt.geom.AreaOp;

import static org.junit.Assert.*;

public class CalculatorsTest {


    @Test
    public void test() throws Exception {
        Calculators calculators = Calculators.run100;
        double z = calculators.calculate2();
        assertEquals(z, 60, 1);
    }

    @Test
    public void test2() throws Exception {
        Calculators calculators = Calculators.longJump;
        double x = calculators.calculate2();
        assertEquals(x, 58 , 0);

    }
}