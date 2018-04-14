import data.AthleteBenchmarks;
import data.AthleteResultWithPlace;

public class XmlResultFormatterImpl implements XmlResultFormatter {
    @Override
    public String format(AthleteResultWithPlace result) {
        final AthleteBenchmarks benchmarks = result.result.benchmarks;
        return new StringBuilder()
                .append("<athlete name=\"")
                .append(benchmarks.name)
                .append("\" run100=\"")
                .append(benchmarks.run100InSeconds)
                .append("\" longJumps=\"")
                .append(benchmarks.longJumpsInMeters)
                .append("\" shotPut=\"")
                .append(benchmarks.shotPutInMeters)
                .append("\" highJumps=\"")
                .append(benchmarks.highJumpsInMeters)
                .append("\" run400=\"")
                .append(benchmarks.run400InSeconds)
                .append("\" run110hurdles=\"")
                .append(benchmarks.run110HurdlesInSeconds)
                .append("\" discusThrow=\"")
                .append(benchmarks.discusThrowInMeters)
                .append("\" poleVault=\"")
                .append(benchmarks.poleVaultInMeters)
                .append("\" javelinThrow=\"")
                .append(benchmarks.javelinThrowInMeters)
                .append("\" run1500=\"")
                .append(benchmarks.run1500InSeconds)
                .append("\" score=\"")
                .append(result.result.totalScore)
                .append("\" place=\"")
                .append(place(result))
                .append("\" />")
                .toString();
    }

    private String place(AthleteResultWithPlace result) {
        return result.fromPlace == result.toPlace
                ? String.valueOf(result.fromPlace)
                : result.fromPlace + "-" + result.toPlace;
    }
}
