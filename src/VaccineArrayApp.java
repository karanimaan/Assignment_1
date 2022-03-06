import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class VaccineArrayApp {

    public static void main(String[] args) throws FileNotFoundException {
        /*
        System.out.println("Enter the date:");
        Scanner terminalInput = new Scanner(System.in);
        String date = terminalInput.nextLine();
        System.out.println("Enter the list of countries (end with an empty line):");
        String[] countries = new String[9919]; int i = 0;
        String inputCountry;
        while (!(inputCountry = terminalInput.nextLine()).isBlank()) {
            countries[i++] = inputCountry;
        }
        terminalInput.close();
        */
        //temp
        String date = "2022-02-17";
        String[] countries = new String[] {"Norway, Suriname, South Namibia"};
        System.out.println("Results:");

        try (Scanner fileInput = new Scanner(new FileReader("data/vaccincations.csv"));) {
            while (fileInput.hasNextLine()) {
                String[] fields = fileInput.next().split(",");
                if (fields[1].equals(date)) {
                    for (String country : countries) {
                        if (fields[0].equals(country)) {
                            String numOfVaxs = fields[2];
                            System.out.println(country + " = " + numOfVaxs);
                        }
                    }
                }
            }
        }

    }
}