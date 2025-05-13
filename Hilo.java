import java.util.Scanner;

public class Hilo{
    public static  void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain;

        do {
            int theNumber = (int) (Math.random() * 100 + 1);
            int guess = 0;
            int attempts = 0;

            System.out.println("Welcome to the Hi-Lo guessing game!");
            System.out.println("I'm thinking of a number between 1 and 100.");

            while (guess != theNumber) {
                System.out.print("Enter your guess: ");
                try {
                    guess = scan.nextInt();
                    attempts++;

                    if (guess < 1 || guess > 100) {
                        System.out.println("Please enter a number between 1 and 100!");
                        continue;
                    }

                    if (guess < theNumber) {
                        System.out.println(guess + " is too low, try again!");
                    } else if (guess > theNumber) {
                        System.out.println(guess + " is too high, try again!");
                    } else {
                        System.out.println(guess + " is correct! You won in " + attempts + " attempts!");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid number!");
                    scan.next(); // Clear the invalid input
                }
            }

            System.out.print("Would you like to play again? (y/n): ");
            playAgain = scan.next();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing! Goodbye!");
        scan.close();
    }
}
