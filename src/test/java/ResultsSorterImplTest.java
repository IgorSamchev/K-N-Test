import data.AthleteBenchmarks;
import data.AthleteResult;
import data.AthleteResultWithPlace;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class ResultsSorterImplTest {
    @Test
    public void sort() throws Exception {
        final ResultsSorterImpl sorter = new ResultsSorterImpl();

        final AthleteResult low = new AthleteResult(null, 1);
        final AthleteResult high = new AthleteResult(null, 123);
        final List<AthleteResultWithPlace> actual = sorter.sort(asList(
                low,
                high
        ));

        assertEquals(123, actual.get(0).result.totalScore);
        assertEquals(1, actual.get(0).fromPlace);
        assertEquals(1, actual.get(0).toPlace);
        assertEquals(high, actual.get(0).result);

        assertEquals(1, actual.get(1).result.totalScore);
        assertEquals(2, actual.get(1).fromPlace);
        assertEquals(2, actual.get(1).toPlace);
        assertEquals(low, actual.get(1).result);
    }

    @Test
    public void sortWithSingleGroup() throws Exception {
        final ResultsSorterImpl sorter = new ResultsSorterImpl();
        final AthleteResult athleteResult1 = new AthleteResult(null, 123);
        final AthleteResult athleteResult2 = new AthleteResult(null, 123);

        final List<AthleteResultWithPlace> actual = sorter.sort(asList(athleteResult2, athleteResult1));

        assertEquals(123, actual.get(0).result.totalScore);
        assertEquals(1, actual.get(0).fromPlace);
        assertEquals(2, actual.get(0).toPlace);

        assertEquals(123, actual.get(1).result.totalScore);
        assertEquals(1, actual.get(1).fromPlace);
        assertEquals(2, actual.get(1).toPlace);
    }

    @Test
    public void sortWith2Groups() throws Exception {
        final ResultsSorterImpl sorter = new ResultsSorterImpl();

        final List<AthleteResultWithPlace> actual = sorter.sort(asList(
                new AthleteResult(null, 4),
                new AthleteResult(null, 3),
                new AthleteResult(null, 5),
                new AthleteResult(null, 3),
                new AthleteResult(null, 5)
        ));

        assertEquals(5, actual.get(0).result.totalScore);
        assertEquals(1, actual.get(0).fromPlace);
        assertEquals(2, actual.get(0).toPlace);

        assertEquals(5, actual.get(1).result.totalScore);
        assertEquals(1, actual.get(1).fromPlace);
        assertEquals(2, actual.get(1).toPlace);

        assertEquals(4, actual.get(2).result.totalScore);
        assertEquals(3, actual.get(2).fromPlace);
        assertEquals(3, actual.get(2).toPlace);

        assertEquals(3, actual.get(3).result.totalScore);
        assertEquals(4, actual.get(3).fromPlace);
        assertEquals(5, actual.get(3).toPlace);

        assertEquals(3, actual.get(4).result.totalScore);
        assertEquals(4, actual.get(4).fromPlace);
        assertEquals(5, actual.get(4).toPlace);
    }
}