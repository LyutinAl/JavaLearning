import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String decision = scan.next();

        if (decision.equals("yes")) {
            // Task 2 - Print this if the decision is "yes"
            System.out.println("\nGreat! In one line" +
                    "\nHow much money do you have in your savings?" +
                    "\nAnd, how much do you owe in credit card debt?");
            int savings = scan.nextInt();
            int debt = scan.nextInt();

            System.out.println("\nHow many years have you worked for?");
            int numberOfWorkingYears = scan.nextInt();

            System.out.println("What is your name?");
            String name = scan.next();

            if (savings > 10000 && debt < 5000 && numberOfWorkingYears > 2) {
                System.out.println("Congratulations " + name + " You have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
        } else {
            System.out.println("\nOK. Have a nice day!");
        }
        scan.close();
    }
}
