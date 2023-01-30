import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length and width of rectangle separated by a space");
        double length = scan.nextDouble();
        double width = scan.nextDouble();
        
        calculateArea(length, width);

        scan.close();
    }
    public static void calculateArea(double length, double width) {
        double area =  length * width;
        System.out.println("Area: " + area);        
    }
}
