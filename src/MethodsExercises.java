import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
//        int added = addition(1, 2);
//        int subtracted = subtraction(3, 4);
//        int multiplied = multiplication(5, 6);
//        int divided = division(8, 4);
//        int modulused = modulus(10, 7);
//        int userInput = getInteger(1, 10);
//        int factorialed = factorial(1, 10);
//        diceRoll();

//        1.==================
//        System.out.printf("Here are your numbers added: %d\n", added);
//        System.out.printf("Here are your numbers subtracted: %d\n", subtracted);
//        System.out.printf("Here are your numbers multiplied: %d\n", multiplied);
//        System.out.printf("Here are your numbers divided: %d\n", divided);
//        System.out.printf("Here is the remainder of your numbers divided by each other: %d\n", modulused);
//        =====================
    }
//        1.==================
//    public static int addition(int num1, int num2) {
//        return num1 + num2;
//    }
//    public static int subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
//    }
//    public static int division(int num1, int num2) {
//        return num1 / num2;
//    }
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//    }
//        =====================

//        2.==================
//    public static int getInteger(int min, int max) {
//        System.out.print("Enter a number between 1 and 10: ");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        if(input>min && input<=max){
//            System.out.println("That is a valid input");
//            return input;
//        } else {
//            System.out.println("That is an invalid input");
//            return getInteger(min,max);
//        }
//    }
//        =====================

//        3.===================
//    public static int factorial(int min, int max) {
//        System.out.print("Enter a number between 1 and 10: ");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        if(input>min && input<=max){
//            System.out.println("That is a valid input");
//                int answer = 1;
//            for(int i=1;i<=input;i++){
//                answer *= i;
//            }
//                System.out.println(answer);
//        System.out.print("Would you like to continue? Y/N: ");
//        Scanner userReply = new Scanner(System.in);
//        String reply = userReply.nextLine();
//        if(reply.equals("y")){
//            return factorial(min, max);
//        } else {
//            return 0;
//        }
//        } else {
//            System.out.println("That is an invalid input");
//            return factorial(min,max);
//        }
//    }
//        =====================

//        4.===================
//    public static void diceRoll() {
//        System.out.print("How many sides should each dice have? ");
//        Scanner userReply = new Scanner(System.in);
//        int diceSides = Integer.parseInt(userReply.nextLine());
//        double randomGen = (Math.random()*(diceSides-1)) + 1;
//        int random = (int) randomGen;
//        double randomGen2 = (Math.random()*(diceSides-1)) + 1;
//        int random2 = (int) randomGen2;
//        int dice1 = random;
//        int dice2 = random2;
//        System.out.printf("Your rolled a %d on one dice, and a %d on the other.\n", dice1, dice2);
//        System.out.print("Would you like to roll again? Y/N");
//        String answer = userReply.nextLine();
//        if(answer.equals("y")) {
//            diceRoll();
//        }
//    }
}
