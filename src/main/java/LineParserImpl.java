import data.AthleteBenchmarks;

public class LineParserImpl implements LineParser {
    @Override
    public AthleteBenchmarks parse(String line) {
        String[] benchmarks = line.split(";");
        String[] seconds = benchmarks[10].split("\\.");

        AthleteBenchmarks athleteBenchmarks = new AthleteBenchmarks();
        athleteBenchmarks.name = benchmarks[0];
        athleteBenchmarks.run100InSeconds = Double.parseDouble(benchmarks[1]);
        athleteBenchmarks.longJumpsInMeters = Double.parseDouble(benchmarks[2]);
        athleteBenchmarks.shotPutInMeters = Double.parseDouble(benchmarks[3]);
        athleteBenchmarks.highJumpsInMeters = Double.parseDouble(benchmarks[4]);
        athleteBenchmarks.run400InSeconds = Double.parseDouble(benchmarks[5]);
        athleteBenchmarks.run110HurdlesInSeconds = Double.parseDouble(benchmarks[6]);
        athleteBenchmarks.discusThrowInMeters = Double.parseDouble(benchmarks[7]);
        athleteBenchmarks.poleVaultInMeters = Double.parseDouble(benchmarks[8]);
        athleteBenchmarks.javelinThrowInMeters = Double.parseDouble(benchmarks[9]);
        athleteBenchmarks.run1500InSeconds = Double.parseDouble(seconds[0])*60
                + Double.parseDouble(seconds[1])
                + Double.parseDouble(seconds[2])/100;
        return athleteBenchmarks;
    }
}
