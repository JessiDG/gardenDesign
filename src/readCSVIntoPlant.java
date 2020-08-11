import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readCSVIntoPlant {

    public static String[][] readCSVIntoArray(String pathToCSV) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCSV));
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            // do something with the data
        }
        csvReader.close();
    }
}
