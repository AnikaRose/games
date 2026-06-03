import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random gen = new Random();

        System.out.println("Rock = 1");
        System.out.println("Paper = 2");
        System.out.println("Scissors = 3");

        System.out.print("Enter your choice: ");
        int user = scan.nextInt();

        int computer = gen.nextInt(3) + 1;

        System.out.println("Computer chose: " + computer);

        if (user == computer) {
            System.out.println("It's a tie!");
        }
        else if ((user == 1 && computer == 3) ||
                 (user == 2 && computer == 1) ||
                 (user == 3 && computer == 2)) {
            System.out.println("You win!");
        }
        else {
            System.out.println("Computer wins!");
        }

        scan.close();
    }
}