import data.AthleteBenchmarks;

import java.io.File;
import java.util.List;

public interface FileParser {
    List<AthleteBenchmarks> parse(File file);
}
