import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {
        Shirt shirt = new Shirt(Size.SMALL, 49.99, "White", "NIKE");
        shirt.fold();
        productStore(shirt);

        Pants pants = new Pants(32, 32, 79.99, "RED", "LEVI'S");
        pants.fold();
        productStore(pants);
    }

    public static void productStore(Product product) {
        System.out.println("Thank for your purchasing " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ". " + "Your total comes to " + product.getPrice());
        product.wear();
    }

}
