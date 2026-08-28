import java.util.Scanner;
import java.util.Random;

public class NumGame {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int target = rand.nextInt(1,101);
        int guess = 0;
        int count = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("The number ranges from 1 to 100. Try to guess the number in as few attempts as possible.");

        System.out.println();

        while (guess != target) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            count++;

            System.out.println();

            if (guess == target){
                System.out.printf("%nCongratulations! You've guessed the number %d in %d attempts.%n", target, count);
            }
            else if (guess < target){
                System.out.println("Too low! Try again.");
            }
            else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Thank you for playing the Number Guessing Game!");

        sc.close();
    }
}