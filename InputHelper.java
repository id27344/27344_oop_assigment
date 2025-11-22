package id_27344.q6;

import id_27344.utils.OutputHelper;

import java.util.Scanner;



import java.util.Scanner;

public class InputHelper {

    public static int readInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            OutputHelper.printWithID(prompt);
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value <= 0) {
                    OutputHelper.printWithID("Value cannot be zero or negative. Try again.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                OutputHelper.printWithID("Invalid number. Try again.");
            }
        }
        return value;
    }

    public static double readDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            OutputHelper.printWithID(prompt);
            try {
                value = Double.parseDouble(scanner.nextLine());
                if (value < 0) {
                    OutputHelper.printWithID("Value cannot be negative. Try again.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                OutputHelper.printWithID("Invalid number. Try again.");
            }
        }
        return value;
    }

    public static String readString(Scanner scanner, String prompt) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine().trim();
            if (!value.isEmpty()) break;
            OutputHelper.printWithID("Input cannot be empty. Try again.");
        }
        return value;
    }

    public static String readName(Scanner scanner, String prompt) {
        String name;
        while (true) {
            OutputHelper.printWithID(prompt);
            name = scanner.nextLine().trim();
            if (!name.isEmpty() && name.matches("[a-zA-Z ]+")) break;
            OutputHelper.printWithID("Name must contain only letters and spaces. Try again.");
        }
        return name;
    }

    public static String readEmail(Scanner scanner, String prompt) {
        String email;
        while (true) {
            OutputHelper.printWithID(prompt);
            email = scanner.nextLine().trim();
            if (email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) break;
            OutputHelper.printWithID("Invalid email format. Try again.");
        }
        return email;
    }

    public static String readPhone(Scanner scanner, String prompt) {
        String phone;
        while (true) {
            OutputHelper.printWithID(prompt);
            phone = scanner.nextLine().trim();
            if (phone.matches("\\d{10}")) break;
            OutputHelper.printWithID("Phone number must be 10 digits. Try again.");
        }
        return phone;
    }

    public static String readDate(Scanner scanner, String prompt) {
        String date;
        while (true) {
            OutputHelper.printWithID(prompt);
            date = scanner.nextLine().trim();
            if (date.matches("\\d{4}-\\d{2}-\\d{2}")) break;
            OutputHelper.printWithID("Date must be in format YYYY-MM-DD. Try again.");
        }
        return date;
    }
}



