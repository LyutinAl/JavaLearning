import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Movie[] movieList = new Movie[] {
                new Movie("The Shawshank Redemption", "BlueRay", 9.2),
                new Movie("The Godfather", "BlueRay", 9.1),
                new Movie("The Godfather: Part II", "DVD", 9.0),
                new Movie("The Dark Knight", "BlueRay", 9.0),
                new Movie("Schindler's List", "DVD", 8.9),
                new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
                new Movie("Pulp Fiction", "DVD", 8.8),
                new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };
        Store storage = new Store();

        for (int i = 0; i < movieList.length; i++) {
            storage.setMovie(i, movieList[i]);
        }

        System.out.println("********************************MOVIE STORE*******************************");
        for (int i = 0; i < movieList.length; i++) {
            System.out.println(storage.getMovei(i));
        }

        while (true) {
            System.out.print("\n\nPlease choose an integer between 0 - 9: ");
            int index = scan.nextInt();
            System.out.print("Set a new rating for " + storage.movies[index].getName() + ": ");
            double newRating = scan.nextDouble();
            storage.movies[index].setRating(newRating);
            scan.nextLine();

            System.out.println("********************************MOVIE STORE*******************************");
            for (int i = 0; i < movieList.length; i++) {
                System.out.println(storage.getMovei(i));
            }

            System.out.print("\nTo edit another rating, type: 'continue':");
            if (!scan.nextLine().equals("continue")) {
                break;
            }
        }
        scan.close();
    }
}