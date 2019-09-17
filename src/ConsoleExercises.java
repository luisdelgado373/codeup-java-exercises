import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
////        System.out.printf("The value of pi is approximately %f.", pi);
////        OR
//        System.out.println("The value of pi is approximately " + pi + ".");

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int userInput = scanner.nextInt();
////        System.out.println("You entered: --> \"" + userInput + "\" <--");
////        OR
//        System.out.printf("You entered: --> %d <--", userInput);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter '3' Words: ");
//        String w1 = scanner.next();
//        String w2 = scanner.next();
//        String w3 = scanner.next();
//        System.out.println("The words you entered are: ");
//        System.out.format("%S,\n", w1);
//        System.out.format("%S,\n", w2);
//        System.out.format("%S", w3);
//        OR
//        System.out.format("Word 1: %s%nWord 2: %s%nWord 3: %s", w1, w2, w3);
//        system will not allow less or more than 3 words

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        String userInput = scanner.nextLine();
//        System.out.format("Your sentence is: %s", userInput);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of classroom: ");
//        String lengthBefore = scanner.nextLine();
//        int length = Integer.parseInt(lengthBefore);
//        OR
        int length = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter width of classroom: ");
//        String widthBefore = scanner.nextLine();
//        int width = Integer.parseInt(widthBefore);
//        OR
        int width = Integer.parseInt(scanner.nextLine());
        System.out.printf("Length: %d. Width: %d.\n", length, width);
        int area = length * width;
        int perimeter = (length * 2) + (width * 2);
        System.out.printf("The area of the classroom is: %d.\n", area);
        System.out.printf("The perimeter of the classroom is: %d.\n", perimeter);
    }
}
