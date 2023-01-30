public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
 
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        if (wallet >= toyCar){
            System.out.println("Shure!");
        } else {
            System.out.println("Sorry, I only have " + (int)wallet);
        }
        wallet -= toyCar;
        
        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
        if (wallet >= nike){
            System.out.println("Shure!");
        } else {
            System.out.println("Sorry, I only have " + (int)wallet);
        }

    }
}
