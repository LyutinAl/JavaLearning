public class Receipt {
    public static void main(String[] args) {
        String[] sortOfApples = {"Gala", "Granny Smith", "Macintosh"};
        double[] priceOfApples = {1.99, 1.49, 1.29};
        System.out.println("Here's your receipt:\n");

        for (int i = 0; i < priceOfApples.length; i++) {
            System.out.println("\t" + sortOfApples[i] + ": $" + priceOfApples[i]); // to be used in for loop.
        }
    }
}