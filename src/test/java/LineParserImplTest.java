import data.AthleteBenchmarks;
import org.junit.Test;

import static org.junit.Assert.*;

public class LineParserImplTest {
    @Test
    public void parse() {
        final LineParserImpl parser = new LineParserImpl();
        final AthleteBenchmarks actual = parser.parse("John Smith;" +
                "12.61;5.12;9.22;1.50;60.39;16.43;21.60;2.60;35.81;1.25.72");
        assertEquals("John Smith", actual.name);
        assertEquals(12.61, actual.run100InSeconds, 0);
        assertEquals(5.12, actual.longJumpsInMeters, 0);
        assertEquals(9.22, actual.shotPutInMeters, 0);
        assertEquals(1.5, actual.highJumpsInMeters, 0);
        assertEquals(60.39, actual.run400InSeconds, 0);
        assertEquals(16.43, actual.run110HurdlesInSeconds, 0);
        assertEquals(21.6, actual.discusThrowInMeters, 0);
        assertEquals(2.6, actual.poleVaultInMeters, 0);
        assertEquals(35.81, actual.javelinThrowInMeters,0);
        assertEquals(85.72, actual.run1500InSeconds,0);
    }
}