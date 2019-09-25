package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter string");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter a yes or no");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        int input;
        boolean isTrue = false;

        System.out.printf("give an integer between %d & %d", min, max);
        do {
            input = Integer.parseInt(scanner.nextLine());
            if (input > min && input < max) {
                isTrue = true;
            } else {
                System.out.println("Invalid input");
            }
        } while (!isTrue);
        return input;
    }

    public int getInt() {
        int input;
        System.out.println("Enter an integer");
        input = Integer.parseInt(scanner.nextLine());
        return input;
    }

    public double getDouble(double min, double max) {
        double input;
        boolean isTrue = false;

        System.out.printf("give a double between %f & %f", min, max);
        do {
            input = Double.parseDouble(scanner.nextLine());
            if (input > min && input < max) {
                isTrue = true;
            } else {
                System.out.println("Invalid input");
            }
        } while (!isTrue);
        return input;
    }

    public double getDouble() {
        double input;
        System.out.println("Enter a double");
        input = Double.parseDouble(scanner.nextLine());
        return input;
    }
}
