package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Type something");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter Y/N or yes/no");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        int input;
        System.out.printf("Enter an integer between %d & %d\n", min, max);
        try {
            input = Integer.parseInt(scanner.nextLine());
            if (input >= min && input <= max) {
                return input;
            } else {
                System.out.println("Out of range");
                return getInt(min, max);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return getInt(min, max);
        }
    }

    public int getInt() {
        int input;
        System.out.println("Enter an integer");
        try {
            input = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return getInt();
        }
        return input;
    }

    public double getDouble(double min, double max) {
        double input;
        System.out.printf("give a double between %f & %f\n", min, max);
        try {
            input = Double.parseDouble(scanner.nextLine());
            if (input > min && input < max) {
                return input;
            } else {
                System.out.println("Out of range");
                return getDouble(min, max);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return getDouble(min, max);
        }
    }

    public double getDouble(String prompt) {
        double input;
        System.out.println(prompt);
        try {
            input = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return getDouble(prompt);
        }
        return input;
    }
}
