import data.AthleteBenchmarks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParserImpl implements FileParser {

    private final LineParser lineParser;

    FileParserImpl(LineParser lineParser) {
        this.lineParser = lineParser;
    }

    @Override
    public List<AthleteBenchmarks> parse(File file) {

        ArrayList<AthleteBenchmarks> benchmarksList = new ArrayList<>();

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(file));
            while (fileReader.ready()) {
                String line = fileReader.readLine().trim();
                if (line.length() > 0) {
                    benchmarksList.add(lineParser.parse(line));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return benchmarksList;

    }
}
