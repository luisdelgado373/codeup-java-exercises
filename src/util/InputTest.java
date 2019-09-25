package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        String string = input.getString();
        System.out.println("Entered string is: " + string);

        boolean tOrF = input.yesNo();
        System.out.println(tOrF);

        int number = input.getInt(1, 50);
        System.out.println("Entered integer is: " + number);

        int number1 = input.getInt();
        System.out.println("Entered integer is: " + number1);

        double doub = input.getDouble(1, 10);
        System.out.println("Entered double is: " + doub);

        double doub1 = input.getDouble();
        System.out.println("Entered double is: " + doub1);
    }
}
