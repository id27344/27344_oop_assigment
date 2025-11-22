package id_27344.q7;

import id_27344.utils.OutputHelper;

import java.util.Scanner;

public class InputHelper {

    public static int readInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value < 1) {
                    OutputHelper.printWithID("Value cannot be negative. Try again.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                OutputHelper.printWithID("Invalid input. Enter an integer.");
            }
        }
        return value;
    }

    public static double readDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            try {
                value = Double.parseDouble(scanner.nextLine());
                if (value < 0) {
                    OutputHelper.printWithID("Value cannot be negative. Try again.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                OutputHelper.printWithID("Invalid input. Enter a number.");
            }
        }
        return value;
    }

    public static String readString(Scanner scanner, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                OutputHelper.printWithID("Input cannot be empty. Try again.");
                continue;
            }
            break;
        }
        return input;
    }

    public static String readEmail(Scanner scanner, String prompt) {
        String email;
        while (true) {
            email = readString(scanner, prompt);
            if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
                OutputHelper.printWithID("Invalid email format. Try again.");
                continue;
            }
            break;
        }
        return email;
    }

    public static String readPhone(Scanner scanner, String prompt) {
        String phone;
        while (true) {
            phone = readString(scanner, prompt);
            if (!phone.matches("\\d{10}")) {
                OutputHelper.printWithID("Phone number must be 10 digits. Try again.");
                continue;
            }
            break;
        }
        return phone;
    }

    public static String readDate(Scanner scanner, String prompt) {
        return readString(scanner, prompt); // Could add regex validation if needed
    }
}


