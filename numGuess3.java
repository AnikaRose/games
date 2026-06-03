import java.util.*;

public class numGuess3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        boolean playAgain;

        // OUTER LOOP: Handles restarting the entire game
        do {
            int numberToGuess = gen.nextInt(100) + 1; 
            int attempts = 0;
            boolean hasWon = false;
            
            System.out.println("\n=========================================");
            System.out.println("🎮 NEW GAME STARTED! 🎮");
            System.out.println("=========================================");
            System.out.println("I'm thinking of a number between 1 and 100.\n");

            // INNER LOOP: Handles the current round's guesses
            while (!hasWon) {
                System.out.print("Enter your guess: ");
                
                if (!scan.hasNextInt()) {
                    System.out.println("❌ Invalid input. Try an integer!");
                    scan.next(); 
                    continue;
                }
                
                int userGuess = scan.nextInt();
                
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("⚠️ Stay between 1 and 100!");
                    continue;
                }
                
                attempts++;

                if (userGuess == numberToGuess) {
                    hasWon = true;
                } else if (userGuess > numberToGuess) {
                    System.out.println("📉 Too high!");
                } else {
                    System.out.println("📈 Too low!");
                }
            }

            // Round Victory Details
          System.out.println("\n🎉 SUCCESS! You got it in " + attempts + " tries.");
            
            // Ask the player if they want to go again
            System.out.print("Do you want to play another round? (y/n): ");
            String choice = scan.next();
            
            // Fix 1: Use .equalsIgnoreCase() to safely compare Strings (handles 'y' and 'Y')
            playAgain = choice.equalsIgnoreCase("y");

        // Fix 2: Properly close the do-while loop structure
        } while (playAgain);
        System.out.println("\nThanks for playing! Goodbye! 👋");
        scan.close();
    }
}
