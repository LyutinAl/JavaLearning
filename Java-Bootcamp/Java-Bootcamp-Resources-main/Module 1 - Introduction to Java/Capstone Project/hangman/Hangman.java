import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra" };

    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a trailing escape
                                  // character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        char[] correctChars = randomWord().toCharArray();       // word to guess
        char[] printingChars = new char[correctChars.length];   // array for printing 
        byte gameState = 0;     // state of game equal to the number of wrong answers
        char guessChar = ' ';   // user guess character
        String misses = "";     // String of wrong characters
        boolean win = false;    // user win thes session

        for (int i = 0; i < printingChars.length; i++) {
            printingChars[i] = '_';
        }

        // main loop
        while (!win && gameState < 6) {
            printUI(printingChars, guessChar, gameState);
            

            // get user char
            guessChar = userInput(misses);
            
            // check gueschar in correct characters
            int[] positions = checkPosition(correctChars, guessChar);

            // update printing array
            if (positions.length > 0) {
                for (int i = 0; i < positions.length; i++) {
                    printingChars[positions[i]] = guessChar;
                }
            } else {
                misses = misses + guessChar;
                gameState++;
            }

            // check win
            win = checkWin(correctChars, printingChars);
            System.out.println(win + "\n" + Arrays.toString(correctChars) + "\n" + Arrays.toString(printingChars));
        }

        printUI(printingChars, guessChar, gameState);
        if (win) {
            System.out.println("\n\nGOOD WORK!");
        } else {
            System.out.println("\n\nRIP!");
            printPlaceholders(correctChars);
        }
    }

    /**
     * Function name: randomWord
     * 
     * @return (String)
     * 
     *         Inside function:
     *         1. Get and return random word from game array
     */
    public static String randomWord() {
        double randomNumber = Math.random() * words.length;
        return words[(int) randomNumber];
    }

    /**
     * Function name: printUI
     * 
     * @param printingChars
     * @param guesCharacter
     * @param gameState
     * 
     * Inside function:
     *  1. Print game interface
     */
    public static void printUI(char[] printingChars, char guesCharacter, byte gameState) {
        System.out.println("\n" + gallows[gameState]);
        printPlaceholders(printingChars);
    }

    /**
     * Function name: userInput
     * @param misses (String)
     * @return  (char)
     * 
     * Inside function:
     *  1. Print string from prew user inputs
     *  2. Return user input 
     */
    public static char userInput(String misses) {
        System.out.println("\n\nMissies: " + misses);
        System.out.print("\nGuess: ");
        return scan.next().charAt(0);
    }

    /**
     * Function name: checkPosition
     * 
     * @param correctChars  (char[])
     * @param guesCharacter (char)
     * @return (char[])
     * 
     * Inside fanction:
     *  1. Inside loop:
     *      - compare gues char with chars in correct array
     *      - if they the same append position in return array
     * 2. Return printing array
     */
    public static int[] checkPosition(char[] correctChars, char guesCharacter) {
        int[] positions = new int[0];
        for (int i = 0; i < correctChars.length; i++) {
            if (guesCharacter == correctChars[i]) {
                positions = updateIntArr(positions, i);
            }
        }
        return positions;
    }

    /**
     * Function name: checkWin
     * @param correctChars  (char[])
     * @param printingChars (char[])
     * @return (int[])
     * 
     * Inside function:
     *  1. Inside loop:
     *      - character equal check
     *      - if tru increase coincidence
     *  2. Win if array length equal coincidence
     */
    public static Boolean checkWin(char[] correctChars, char[] printingChars) {
        int coincidence = 0;
        for (int i = 0; i < correctChars.length; i++) {
            if (correctChars[i] == printingChars[i]) {
                coincidence++;
            } else {
                break;
            }
        }
        if (printingChars.length == coincidence) {
            return true;
        }
        return false;
    }

    /**
     * Function name: updateIntArr
     * @param oldArray  (int[])
     * @param addedInt  (int)
     * @return  (int[])
     * 
     * Inside function;
     *  1. Create new array and append addedInt
     *  2. Return new array reference point
     */
    public static int[] updateIntArr(int[] oldArray, int addedInt) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[oldArray.length] = addedInt;
        return newArray;
    }

    /**
     * Functio name: printPlaceholders
     * @param printingChars (char[])
     * 
     * Inside function:
     *  1. Print "Word: " + input char[] like string
     */
    public static void printPlaceholders(char[] printingChars) {
        System.out.print("Word: ");
        for (int i = 0; i < printingChars.length; i++) {
            System.out.print(printingChars[i] + " ");
        }
    }
}
