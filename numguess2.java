 import java.util.*;
public class numguess2 {
   
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random gen = new Random();

        int secretNumber = gen.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scan.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } 
            else if (guess > secretNumber) {
                System.out.println("Too high!");
            } 
            else {
                System.out.println("Bravo! You win!");
                System.out.println("You guessed the number in " + attempts + " attempts.");
            }
        }

        scan.close();
    }
}