import java.util.Scanner;

public class ReturnValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter the length and width of rectangle separated by a space");
        //double length = scan.nextDouble();
        //double width = scan.nextDouble();
        
        System.out.println("Area: " + calculateArea(2.3, 3.6));
        System.out.println("Area: " + calculateArea(1.6, 2.4));
        System.out.println("Area: " + calculateArea(2.6, 4.2));

        calculateArea(-5, 15);


        // String englishExplanation = explainArea("English");
        // String frenchExplanation = explainArea("French");
        // String spanishExplanation = explainArea("Spanish");
        // String russianExplanation = explainArea("Russian");


        scan.close();
    }
    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("INVALID DEMENTIONS");
            System.exit(0);
        }
        double area =  length * width;
        return area;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "Language not available";
        }        
    }
}

// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"

