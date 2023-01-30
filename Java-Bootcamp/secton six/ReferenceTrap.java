import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = staffLastYear.clone();

        staffThisYear[2] = "Abby";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
