import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String answer = scan.next();
        // Task 1: See if the user wants to play.

       //Task 2: Set up the game

        if (answer.equals("Yes") || answer.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            String userChoice = scan.next();
            String computerChoise = computerChoise();
            String gameResult = result(userChoice, computerChoise);
            printResult(userChoice, computerChoise, gameResult);
        } else {
            System.out.println("Darn, some other time...!");
        }
        scan.close();
    }

    // Task 3 – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and
     * scissors
     * 
     * @return a choice (String).
     * 
     *         Inside the function:
     *         1. Picks a random number between 0 and 2.
     *         2. if 0: returns the choice 'rock'
     *         if 1: returns the choice 'paper'
     *         if 2: returns the choice 'scissors'
     */
    public static String computerChoise() {
        int number = (int) (Math.random() * 3);
        switch (number) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                System.err.println("INVALID RANDOM NUMBER");
                System.exit(0);
                return "Wrong number";

        }
    }

    // Task 4 – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     * 
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @return result (String)
     * 
     *         Inside the function:
     * 
     *         1. result is "You win!" if:
     *
     *         You: "rock" Computer: "scissors"
     *         You: "paper" Computer: "rock"
     *         You: "scissors" Computer: "paper"
     *
     *         2. result is "You lose" if:
     * 
     *         Computer: "rock" You: "scissors"
     *         Computer: "paper" You: "rock"
     *         Computer: "scissors" You: "paper"
     *
     *         3. result is "It's a tie" if:
     * 
     *         Your choice equals computer choice.
     * 
     *         4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */
    public static String result(String yourCoice, String computerChoice) {
        String result = "";

        if (yourCoice.equals("rock") && computerChoice.equals("scissors")
                || yourCoice.equals("paper") && computerChoice.equals("rock")
                || yourCoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        } else if (yourCoice.equals("scissors") && computerChoice.equals("rock") ||
                yourCoice.equals("rock") && computerChoice.equals("paper") ||
                yourCoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourCoice.equals(computerChoice)) {
            result = "It's a tie";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
        return result;
    }
    // Task 5 – Write a function that prints your choice, the computer's, and the
    // result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice,
     * result)
     * 
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @param result         (String)
     * 
     *                       Inside the function:
     * 
     *                       1. prints everything:
     *                       – prints: You chose: <your choice>
     *                       – prints: The computer chose: <computer choice>
     *                       – prints: <result>
     */
    public static void printResult(String yourChoise, String computerChoise, String result) {
                System.out.println("You choise: " + yourChoise + "\nThe computer choise: " + computerChoise + "\n" + result);
    }

}
