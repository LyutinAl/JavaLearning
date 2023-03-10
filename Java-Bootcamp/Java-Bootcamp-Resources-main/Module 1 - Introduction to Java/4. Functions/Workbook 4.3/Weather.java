public class Weather {
    public static void main(String[] args) {
        double noon = 77; // temperature at noon in fahrenheit.
        double evening = 61; // temperature during the evening in fahrenheit
        double midnight = 55; // temperature at midnight in fahrenheit

        // Task 3 - Call the printTemperatures function.
        double noonCelcius = fahrenheitToCelsius(noon);
        double eveningCelcius = fahrenheitToCelsius(evening);
        double midnightCelcius = fahrenheitToCelsius(midnight);

        printTemperatures(noon, noonCelcius);
        printTemperatures(evening, eveningCelcius);
        printTemperatures(midnight, midnightCelcius);

    }

    // Task 1: Make a function here. See the doc comments below.

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * 
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     *         Inside the function:
     *         1. returns the temperature in celcius. C = (F - 32) * 5/9.
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    // Task 2: Make a function here. See the doc comments below.

    /**
     * Function name: printTemperatures – prints both temperature values.
     * 
     * @param fahrenheit (double)
     * 
     *                   Inside the function:
     *                   1. prints: F: <temperature in fahrenheit>.
     *                   2. prints: C: <temperature in celsius> .
     */
    public static void printTemperatures(double fahrenheit, double celcius) {
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + celcius + "\n");
    }

}