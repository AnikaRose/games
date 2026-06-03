import java.util.*;

public class numGuess3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random gen = new Random();

        boolean playAgain = true;

        // OUTER LOOP: controls full game restart
        while (playAgain) {

            int numberToGuess = gen.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\n=================================");
            System.out.println("🎮 NEW GAME STARTED 🎮");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("=================================\n");

            // INNER LOOP: guessing part
            while (!guessedCorrectly) {

                System.out.print("Enter your guess: ");

                // check if input is valid integer
                if (!scan.hasNextInt()) {
                    System.out.println("❌ Invalid input! Please enter a number.");
                    scan.next(); // remove wrong input
                    continue;
                }

                int userGuess = scan.nextInt();

                // check range
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("⚠️ Please guess between 1 and 100.");
                    continue;
                }

                attempts++;

                // compare guess
                if (userGuess == numberToGuess) {
                    guessedCorrectly = true;
                }
                else if (userGuess > numberToGuess) {
                    System.out.println("📉 Too high!");
                }
                else {
                    System.out.println("📈 Too low!");
                }
            }

            // game result
            System.out.println("\n🎉 Congratulations! You guessed it!");
            System.out.println("You took " + attempts + " attempts.");

            // play again option
            System.out.print("\nDo you want to play again? (y/n): ");
            String choice = scan.next();

            if (choice.equalsIgnoreCase("y")) {
                playAgain = true;
            } else {
                playAgain = false;
            }
        }

        System.out.println("\nThanks for playing! 👋");
        scan.close();
    }
}
