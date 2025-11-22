package id_27344.q4;
import id_27344.utils.OutputHelper;

import java.util.Scanner;

public class InputHelper {

    public static int readInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            OutputHelper.printWithID(prompt);
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value <= 0) {
                    OutputHelper.printWithID("Value must be greater than 0. Try again.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                OutputHelper.printWithID("Invalid input! Enter a whole number.");
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
                OutputHelper.printWithID("Invalid input! Enter a valid number.");
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
            if (!name.isEmpty() && name.matches("[A-Za-z ]+")) break;
            OutputHelper.printWithID("Invalid input! Only letters and spaces are allowed.");
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
            OutputHelper.printWithID("Phone number must be exactly 10 digits. Try again.");
        }
        return phone;
    }

    public static String readDate(Scanner scanner, String prompt) {
        String date;
        while (true) {
            OutputHelper.printWithID(prompt);
            date = scanner.nextLine().trim();
            if (date.matches("\\d{4}-\\d{2}-\\d{2}")) break;
            OutputHelper.printWithID("Invalid date! Use YYYY-MM-DD format.");
        }
        return date;
    }

    public static String readRoomType(Scanner scanner, String prompt) {
        String type;
        while (true) {
            OutputHelper.printWithID(prompt);
            type = scanner.nextLine().trim();
            if (type.equalsIgnoreCase("Single") || type.equalsIgnoreCase("Double") || type.equalsIgnoreCase("Suite")) break;
            OutputHelper.printWithID("Invalid room type! Must be Single, Double, or Suite.");
        }
        return type;
    }

    public static int readNumberOfGuests(Scanner scanner, String prompt) {
        int guests;
        while (true) {
            OutputHelper.printWithID(prompt);
            try {
                guests = Integer.parseInt(scanner.nextLine());
                if (guests > 0) break;
                OutputHelper.printWithID("Number of guests must be greater than 0.");
            } catch (NumberFormatException e) {
                OutputHelper.printWithID("Invalid input! Enter a valid integer.");
            }
        }
        return guests;
    }

    public static String readText(Scanner scanner, String prompt) {
        String value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextLine().trim();
            // Allow letters, numbers, space, . , ; : -
            if (value.matches("[A-Za-z0-9 .,;:-]+")) break;
            System.out.println("Invalid input! Only letters, numbers and . , ; : - are allowed.");
        }
        return value;
    }
}


