import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readCSVIntoPlant {

    public static Plant readCSVIntoArray(String pathToCSV) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCSV));
        Plant plant = new Plant();
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            plant.popularityRanking = Integer.parseInt(data[0]);
            // do something with the data
        }
        csvReader.close();
        return plant;
    }
}
