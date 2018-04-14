import data.AthleteResult;
import data.AthleteResultWithPlace;

import java.util.ArrayList;
import java.util.List;

public class ResultsSorterImpl implements ResultsSorter {


    @Override
    public List<AthleteResultWithPlace> sort(List<AthleteResult> results) {
        results.sort((o1, o2) -> {
            if (o1.totalScore == o2.totalScore) return 0;
            if (o1.totalScore < o2.totalScore) return 1;
            return -1;
        });

        final List<AthleteResultWithPlace> athleteResultsWithPlaces = new ArrayList<>();
        ArrayList<AthleteResult> groupWithSameScore = new ArrayList<>();
        groupWithSameScore.add(results.get(0));
        for (int place = 2; place <= results.size(); place++) {
            AthleteResult result = results.get(place - 1);
            if (groupWithSameScore.get(0).totalScore == result.totalScore) {
                groupWithSameScore.add(result);
            } else {
                addSameScoreGroupToResults(athleteResultsWithPlaces, groupWithSameScore, place - 1);
                groupWithSameScore = new ArrayList<>();
                groupWithSameScore.add(result);
            }
        }
        addSameScoreGroupToResults(athleteResultsWithPlaces, groupWithSameScore, results.size());

        return athleteResultsWithPlaces;
    }

    private void addSameScoreGroupToResults(
            List<AthleteResultWithPlace> athleteResultsWithPlaces,
            ArrayList<AthleteResult> groupWithSameScore,
            int lastPlaceInGroup
    ) {
        final int fromPlace = lastPlaceInGroup - groupWithSameScore.size() + 1;
        for (AthleteResult result : groupWithSameScore) {
            athleteResultsWithPlaces.add(new AthleteResultWithPlace(result, fromPlace, lastPlaceInGroup));
        }
    }
}
