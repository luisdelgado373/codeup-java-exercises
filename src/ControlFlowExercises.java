import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        1a.
        int i = 5;
        while (i <= 15){
        System.out.println(i);
            i++;
        }

//        1b.
        int x = 0;
        do{
            System.out.println(x);
        x+=2;
        } while (x <= 100);

        int y = 100;
        do {
            System.out.println(y);
            y-=5;
        } while (y >= -10);

        long z = 2;
        do {
            System.out.println(z);
            z *= z;
        } while (z < 1000000);

//        1c.
        for(int a=5;a<=15;a++) {
            System.out.println(a);
        }
        for(int b=0;b<=100;b+=2) {
            System.out.println(b);
        }
        for(int c=100;c>=-10;c-=5) {
            System.out.println(c);
        }
        for(long d=2;d<1000000;d*=d) {
            System.out.println(d);
        }
//        2.
        for(int e=1;e<=100;e+=1){
            if((e%3==0) && (e%5==0)){
                System.out.println("FizzBuzz");
            }
            else if(e%3==0) {
                System.out.println("Fizz");
            } else if(e%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(e);
            }
        }

//        3.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1-5: ");
        int userInput = scanner.nextInt();
        System.out.println("Here is your table!");
        System.out.println("number\t|\t squared\t|\t cubed");
//
        for(int f=1;f<=userInput;f++) {
        int numSquared = f*f;
        int numCubed = numSquared*f;
            System.out.printf("%d\t\t|\t\t %d\t\t|\t\t %d\n", f, numSquared, numCubed);
        }

//        4.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a grade from 1-100: ");
        int grade = input.nextInt();
        String gradeLetter = "";
        if (grade < 59){
//            System.out.println("That's an F!!");
            gradeLetter = "F";
        } else if (grade < 66) {
//            System.out.println(("That's a D!"));
            gradeLetter = "D";
        } else if (grade < 79) {
//            System.out.println("That's a C.");
            gradeLetter = "C";
        } else if (grade < 87) {
//            System.out.println("That's a B!");
            gradeLetter = "B";
        } else if (grade < 100) {
//            System.out.println("That's an A!!");
            gradeLetter = "A";
        }
        System.out.println(gradeLetter);
    }
}