import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class VaccineArrayApp {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Enter the date:");
        Scanner terminalInput = new Scanner(System.in);
        String date = terminalInput.nextLine();
        System.out.println("Enter the list of countries (end with an empty line):");
        Record[] records = new Record[9919]; int recordCount = 0;
        String inputCountry;
        while (!(inputCountry = terminalInput.nextLine()).isBlank()) {
            records[recordCount++] = new Record(inputCountry, date);
        }
        terminalInput.close();


        System.out.println("Results:");
        for (Record record : records) {
            if (record == null)
                break;
            System.out.println(record.getCountry() + " = " + record.getVaxCount());
        }

    }
}