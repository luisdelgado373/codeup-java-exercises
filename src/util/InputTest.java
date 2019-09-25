package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        String string = input.getString();
        System.out.println("String: " + string);

        boolean tOrF = input.yesNo();
        System.out.println("True or False: " + tOrF);

        int number1 = input.getInt(1, 50);
        System.out.println("number1: " + number1);

        int number = input.getInt();
        System.out.println("number: " + number);

        double doub1 = input.getDouble(1, 10);
        System.out.println("double1: " + doub1);

        double doub = input.getDouble();
        System.out.println("double: " + doub);
    }
}
