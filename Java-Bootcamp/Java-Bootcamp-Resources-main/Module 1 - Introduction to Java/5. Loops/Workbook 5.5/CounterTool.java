import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");
        System.out.print("\n1. Pick a number to count by: ");
        int count = scan.nextInt();
        System.out.print("2. Pick a number to start counting from: ");
        int startNumber = scan.nextInt();
        System.out.print("3. Pick a number to count to: ");
        int endNumber = scan.nextInt();
        for (int i = startNumber; i <= endNumber; i += count) {
            System.out.print(i + " ");
        }
        scan.close();
    }
}
