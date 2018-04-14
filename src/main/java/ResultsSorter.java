import data.AthleteResult;
import data.AthleteResultWithPlace;

import java.util.List;

public interface ResultsSorter {
    List<AthleteResultWithPlace> sort(List<AthleteResult> results);
}
