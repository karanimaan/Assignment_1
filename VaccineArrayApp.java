import java.util.Scanner;

class VaccineArrayApp {

    public static void main(String[] args) {
        System.out.println("Enter the date:");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        System.out.println("Enter the list of countries (end with an empty line):");
        String[] countries = new String[9919]; int i = 0;
        String country;
        while ((country = scanner.next()) != "") {
            countries[i++] = country;
        }
        /*
        while (true) {
            country = scanner.next();
            if (country == "") {
                break;
            }
            else {
                countries[i++] = country;
            }
        }
        */
        scanner.close();
        System.out.println("Results:");

        Scanner scanner = new Scanner(new File("");
    }
}