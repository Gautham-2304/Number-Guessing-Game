import java.util.Scanner;
import java.util.Random;

public class NumGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int difficulty;

        System.out.println("Choose a difficulty level:");
        System.out.println("1. Easy (1-10)");
        System.out.println("2. Medium (1-50)");
        System.out.println("3. Hard (1-100)");
        System.out.print("Enter difficulty level: ");

        difficulty = sc.nextInt();

        int target;
        int maxNumber;

        switch (difficulty) {
            case 1 -> maxNumber = 10;
            case 2 -> maxNumber = 50;
            case 3 -> maxNumber = 100;
            default -> {
                System.out.println("Invalid difficulty level!");
                sc.close();
                return;
            }
        }

        target = rand.nextInt(maxNumber) + 1;

        System.out.println("\nWelcome to the Number Guessing Game!");
        System.out.println("The number ranges from 1 to " + maxNumber + ". Try to guess the number in as few attempts as possible.");

        int guess = 0;
        int count = 0;

        while (guess != target) {
            System.out.print("\nEnter your guess: ");
            guess = sc.nextInt();
            count++;

            if (guess == target) {
                System.out.printf(
                    "Congratulations! You've guessed the number %d in %d attempts.%n",
                    target, count
                );
            } else if (guess < target) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Thank you for playing the Number Guessing Game!");

        sc.close();
    }
}