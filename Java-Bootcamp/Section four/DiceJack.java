import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three number between 1 and 6");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        if (number1 < 1 || number2 < 1 || number3 < 1) {
            System.out.println("Numbers cannot be less then 1. Shutting game down");
            System.exit(0);
        }

        if (number1 > 6 || number2 > 6 || number3 > 6) {
            System.out.println("Numbers cannot be greater then 6. Shutting game down");
            System.exit(0);
        }

        int sumOfNumbers = number1 + number2 + number3;
        int sumDiceRolls = roll1 + roll2 + roll3;
        System.out.println("Dice sum = " + sumDiceRolls + ". Number sum = " + sumOfNumbers);

        if (checkWin(sumDiceRolls, sumOfNumbers)) {
            System.out.println("Congrats, you win");
        } else {
            System.out.println("Sorry, you loose");
        }

        scan.close();
    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6 + 1;
        randomNumber += 1;
        return (int) randomNumber;
    }

    public static boolean checkWin(int sumDiceRolls, int sumOfNumbers) {
        return (sumOfNumbers > sumDiceRolls && sumOfNumbers - sumDiceRolls < 3);
    }
}
