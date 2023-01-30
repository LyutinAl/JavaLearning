import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person al = new Person();
        al.name = "Al";
        al.nationality = "Russian";
        al.dateOfBirth = "13.06.1999";
        al.passport = new String[]{al.name, al.nationality, al.dateOfBirth};
        al.seatNumber = 1;


        System.out.println(al.name);
        System.out.println(al.nationality);
        System.out.println(al.dateOfBirth);
        System.out.println(Arrays.toString(al.passport));
        System.out.println(al.seatNumber);
    }
}
