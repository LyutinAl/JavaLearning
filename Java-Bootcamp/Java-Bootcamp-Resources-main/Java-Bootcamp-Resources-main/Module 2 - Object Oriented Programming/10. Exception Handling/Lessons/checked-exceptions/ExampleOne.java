import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        
        //greetings.txt
        try {
            FileInputStream fis =  new FileInputStream("greetings.txt");
            Scanner scan = new Scanner(fis);
            System.out.println(scan.nextLine());
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Proccess complete");
        }
    }
    
}