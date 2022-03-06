import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Record {
    String country, date, vaxCount;

    public Record(String country, String date) throws FileNotFoundException {
        this.country = country;
        this.date = date;
        this.vaxCount = findVaxCount();
    }

    private String findVaxCount() throws FileNotFoundException {
        try (Scanner fileInput = new Scanner(new FileReader("data/vaccinations.csv"));) {
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                String[] fields = line.split(",");
                if (fields[0].equals(country) && fields[1].equals(date)) {
                    return fields[2];
                }
            }
        }
        return "<Not Found>";
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;
    }

    public String getVaxCount() {
        return vaxCount;
    }

}
