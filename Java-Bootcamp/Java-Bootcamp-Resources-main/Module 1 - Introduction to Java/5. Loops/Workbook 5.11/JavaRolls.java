import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        int diceRoll;
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();

        System.out.println("Great, here are the rules:\n");
        System.out.println("- If you roll a 6, the game stops.");
        System.out.println("- If you roll a 4, nothing happens.");
        System.out.println("- Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");

        while (true) {
            scan.nextLine();
            diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll);
            if (diceRoll == 6) {
                System.out.println("End of game");
                break;
            } else if (diceRoll == 4) {
                System.out.println("Zerp point. Keep rolling");
            } else {
                System.out.println("One point. Keep roling");
                score++;
            }
        }

        if (score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :(");
        }

        scan.close();
    }

    /**
     * Function name: rollDice
     * 
     * @return (int)
     * 
     *         Incide the function
     *         1. Return rundom number between 1 and 6
     */
    public static int rollDice() {
        double randomNumber = Math.random() * 6 + 1;
        return (int) randomNumber;
    }

}
