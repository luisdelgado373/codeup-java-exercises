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
        boolean isTrue = false;

        System.out.printf("give an integer between %d & %d", min, max);
        input = Integer.parseInt(scanner.nextLine());
        if (input > min && input < max) {
            return input;
        } else {
            System.out.println("Out of range");
            return getInt(min, max);
        }
    }

    public int getInt() {
        int input;
        System.out.println("Enter an integer");
        input = Integer.parseInt(scanner.nextLine());
        return input;
    }

    public double getDouble(double min, double max) {
        double input;

        System.out.printf("give a double between %f & %f", min, max);
            input = Double.parseDouble(scanner.nextLine());
            if (input > min && input < max) {
                return input;
            } else {
                System.out.println("Out of range");
                return getDouble(min, max);
            }
    }

    public double getDouble() {
        System.out.println("Enter a double");
        return Double.parseDouble(scanner.nextLine());
    }
}
