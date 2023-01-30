public class WhileLoops {
    public static void main(String[] args) {
        double choise = 0.01;
        double guess = 0.99;
        while (guess > choise) {
            guess = Math.random();
            System.out.println(guess);
        }
    }

}
