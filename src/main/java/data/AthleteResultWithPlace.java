package data;

public class AthleteResultWithPlace {
    public final AthleteResult result;
    public final int fromPlace;
    public final int toPlace;

    public AthleteResultWithPlace(AthleteResult result, int fromPlace, int toPlace) {
        this.result = result;
        this.fromPlace = fromPlace;
        this.toPlace = toPlace;
    }
}
