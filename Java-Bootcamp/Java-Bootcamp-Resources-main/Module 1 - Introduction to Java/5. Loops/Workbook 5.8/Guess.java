import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       int choise = getRandom(5);
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       int guess = scan.nextInt();
       
       while (choise != guess) {
        System.out.print("Guess again: ");
        guess = scan.nextInt();
       }
       System.out.println("You got it");
       
        
        scan.close();
    }
    /**
     * Function Name: getRandom
     * 
     * @param endRange (int)
     * @return (int)
     * 
     * Insied the function
     *  1. Return random int from 1 to endRange 
     * 
     */
    public static int getRandom(int endRange) {
        double decimal = Math.random() * endRange + 1;
        return (int) decimal;
    }

}
