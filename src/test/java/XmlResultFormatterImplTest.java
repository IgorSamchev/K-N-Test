import data.AthleteBenchmarks;
import data.AthleteResult;
import data.AthleteResultWithPlace;
import org.junit.Test;

import static org.junit.Assert.*;

public class XmlResultFormatterImplTest {
    @Test
    public void format() throws Exception {
        final AthleteResultWithPlace resultWithPlace = getAthleteResultWithPlace(1, 1);
        final String actual = new XmlResultFormatterImpl().format(resultWithPlace);
        assertEquals("<athlete " +
                "name=\"John Doe\" " +
                "run100=\"1.1\" " +
                "longJumps=\"2.2\" " +
                "shotPut=\"3.3\" " +
                "highJumps=\"4.4\" " +
                "run400=\"5.5\" " +
                "run110hurdles=\"6.6\" " +
                "discusThrow=\"7.7\" " +
                "poleVault=\"8.8\" " +
                "javelinThrow=\"9.9\" " +
                "run1500=\"10.1\" " +
                "score=\"123\" " +
                "place=\"1\" " +
                "/>", actual);
    }

    @Test
    public void formatWithPlaceRange() throws Exception {
        final AthleteResultWithPlace resultWithPlace = getAthleteResultWithPlace(2, 3);

        final String actual = new XmlResultFormatterImpl().format(resultWithPlace);

        assertEquals("<athlete " +
                "name=\"John Doe\" " +
                "run100=\"1.1\" " +
                "longJumps=\"2.2\" " +
                "shotPut=\"3.3\" " +
                "highJumps=\"4.4\" " +
                "run400=\"5.5\" " +
                "run110hurdles=\"6.6\" " +
                "discusThrow=\"7.7\" " +
                "poleVault=\"8.8\" " +
                "javelinThrow=\"9.9\" " +
                "run1500=\"10.1\" " +
                "score=\"123\" " +
                "place=\"2-3\" " +
                "/>", actual);
    }

    private AthleteResultWithPlace getAthleteResultWithPlace(int fromPlace, int toPlace) {
        final AthleteBenchmarks benchmarks = new AthleteBenchmarks();
        benchmarks.name = "John Doe";
        benchmarks.run100InSeconds = 1.1;
        benchmarks.longJumpsInMeters = 2.2;
        benchmarks.shotPutInMeters = 3.3;
        benchmarks.highJumpsInMeters = 4.4;
        benchmarks.run400InSeconds = 5.5;
        benchmarks.run110HurdlesInSeconds = 6.6;
        benchmarks.discusThrowInMeters = 7.7;
        benchmarks.poleVaultInMeters = 8.8;
        benchmarks.javelinThrowInMeters = 9.9;
        benchmarks.run1500InSeconds = 10.1;
        final AthleteResult result = new AthleteResult(benchmarks, 123);
        return new AthleteResultWithPlace(result, fromPlace, toPlace);
    }

}