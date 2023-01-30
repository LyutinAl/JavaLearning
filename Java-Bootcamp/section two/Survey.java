import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("\nWelcome. Thank you for taking the survey");
        
        Scanner scaner = new Scanner(System.in);
        int counter = 0;

        System.out.println("\nWhat is your name?");
        String name = scaner.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scaner.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scaner.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scaner.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scaner.nextInt();
        counter++;

        scaner.close();

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("\nThank you " + name + " for answering all " + counter + " questions");
        System.out.println("\nWeekly, you spend $" + (coffeeAmount * coffeePrice) + " on coffee");
        System.out.println("\nWeekly, you spend $" + (foodAmount * foodPrice) + " on food");

    }
}
