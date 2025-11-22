package id_27344.q1;

import id_27344.utils.OutputHelper;

import java.util.Scanner;

public class InputHelper {

    public static int readInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            OutputHelper.printWithID(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (value > 0) { // check if greater than 0
                    break;
                } else {
                    OutputHelper.printWithID("Invalid input! Number must be greater than 0.");
                }
            } else {
                OutputHelper.printWithID("Invalid input! Please enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }
        return value;
    }


    public static String readDate(Scanner scanner, String prompt) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine().trim();
            // Regex: 4 digits-2 digits-2 digits
            if (value.matches("\\d{4}-\\d{2}-\\d{2}")) break;
            OutputHelper.printWithID("Invalid date format! Please use YYYY-MM-DD.");
        }
        return value;
    }

    public static String readText(Scanner scanner, String prompt) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine().trim();
            // Allow letters, numbers, space, . , ; : -
            if (value.matches("[A-Za-z0-9 .,;:-]+")) break;
            OutputHelper.printWithID("Invalid input! Only letters, numbers and . , ; : - are allowed.");
        }
        return value;
    }


    public static String readName(Scanner scanner, String prompt) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine().trim();
            if (value.matches("[A-Za-z ]+")) break;
            OutputHelper.printWithID("Invalid input! Only letters and spaces are allowed.");
        }
        return value;
    }


    public static double readDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            OutputHelper.printWithID(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                break;
            } else {
                OutputHelper.printWithID("Invalid input! Please enter a number.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static String readString(Scanner scanner, String prompt) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine();
            if (!value.trim().isEmpty()) break;
            OutputHelper.printWithID("Input cannot be empty!");
        }
        return value;
    }

    public static String readEmail(Scanner scanner, String prompt) {
        String value;
        while (true) {
            value = readString(scanner, prompt);
            if (value.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) break;
            OutputHelper.printWithID("Invalid email format!");
        }
        return value;
    }

    public static String readPhone(Scanner scanner, String prompt) {
        String value;
        while (true) {
            value = readString(scanner, prompt);
            if (value.matches("\\d{10}")) break;
            OutputHelper.printWithID("Phone must be 10 digits!");
        }
        return value;
    }

    public static String readGender(Scanner scanner, String prompt) {
        String value;
        while (true) {
            value = readString(scanner, prompt);
            if (value.equalsIgnoreCase("Male") || value.equalsIgnoreCase("Female") || value.equalsIgnoreCase("Other")) break;
            OutputHelper.printWithID("Gender must be Male, Female, or Other!");
        }
        return value;
    }

    public static String readShift(Scanner scanner, String prompt) {
        String value;
        while (true) {
            value = readString(scanner, prompt);
            if (value.equalsIgnoreCase("Day") || value.equalsIgnoreCase("Night")) break;
            OutputHelper.printWithID("Shift must be Day or Night!");
        }
        return value;
    }
}


