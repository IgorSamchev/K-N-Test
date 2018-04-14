import data.AthleteResultWithPlace;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class SortedResultsWriterImpl implements SortedResultsWriter {

    private final XmlResultFormatter xmlResultFormatter;

    public SortedResultsWriterImpl(XmlResultFormatter xmlResultFormatter) {
        this.xmlResultFormatter = xmlResultFormatter;
    }

    @Override
    public void write(List<AthleteResultWithPlace> athleteResultWithPlaces, String path) {
        File file = new File(path);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
            writer.newLine();
            writer.write("<results>");
            writer.newLine();

            for (AthleteResultWithPlace athleteResultWithPlace : athleteResultWithPlaces) {
                writer.write(xmlResultFormatter.format(athleteResultWithPlace));
                writer.newLine();
            }


            writer.write("</results>");
            writer.flush();
            writer.close();
        } catch (Exception ignore) {
        }
    }
}
