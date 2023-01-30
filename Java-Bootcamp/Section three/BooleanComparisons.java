public class BooleanComparisons {
    public static void main(String[] args) {
        int camestryGrade = 95;
        int biologyGrade = 75;

        System.out.println(biologyGrade > camestryGrade);

        String sentence = "I love this corse!";
        String sentence2 = "I love this corse!";

        System.out.println(sentence.equals(sentence2)); // Only ths method used for string comparison
        System.out.println(!sentence.equals(sentence2));
        //                 ^ this means not equal for string
    }
    
}
