import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        double randomGen = (Math.random()*(100-1)) + 1;
        int random = (int) randomGen;
        System.out.print("Can you guess the number between 1 and 100? ");
        Scanner scanner = new Scanner(System.in);
        boolean guess = false;
        int counter = 0;
        do {
        int userNum = scanner.nextInt();
            if (userNum < 1 || userNum > 100) {
                System.out.println("THAT'S OUT OF RANGE");
            } else if (userNum == random) {
                System.out.println("GOOD GUESS, YOU GOT IT!");
                guess = true;
            } else if (userNum > random) {
                System.out.println("LOWER");
            } else if (userNum < random) {
                System.out.println("HIGHER");
            }
            counter++;

            System.out.printf("You have guessed %d times!\n", counter);
        } while(!guess && counter<10);
    }
}
