public class RandomNumbers {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.14)
        int[][] array = new int[100][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumber();                
            }
        }
        print2DArray(array);


    }

    /**
     * Function name: randomNumber
     * @return (int)
     * 
     * Inside the function
     *  1. get and return random number between 0 to 99
     */
    public static int randomNumber() {
        double randomNumber = Math.random() * 100;
        return (int)randomNumber;
    }

    /**
     * Function name: print2DArray
     * @param array
     * 
     * Inside the function:
     *  1. Nisted loop:
     *      - inner loop print 1 row separated column with 1 
     *      - after the iner loop rows separated by \n
     */
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
