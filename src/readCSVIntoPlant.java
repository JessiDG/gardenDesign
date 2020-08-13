import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;
public class ReadCSVIntoPlant
{
    public static void main(String[] args)
    {
        CSVReader reader = null;
        try
        {
            reader = new CSVReader(new FileReader("F:\\CSVDemo.csv"));
            String [] nextLine;
//read one line at a time
            while ((nextLine = reader.readNext()) != null)
            {
                for(String token : nextLine)
                {
                    System.out.println(token);
                }
                System.out.print("\n");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}