import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hi Timmy! Choose anumber to count to: ");
        int num = scan.nextInt();
        System.out.println("Great! Here's how it's done");

        for(int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}
