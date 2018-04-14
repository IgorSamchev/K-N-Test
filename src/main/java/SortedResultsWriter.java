import data.AthleteResultWithPlace;

import java.util.List;

public interface SortedResultsWriter {
    void write(List<AthleteResultWithPlace> athleteResultWithPlaces, String arg);
}
