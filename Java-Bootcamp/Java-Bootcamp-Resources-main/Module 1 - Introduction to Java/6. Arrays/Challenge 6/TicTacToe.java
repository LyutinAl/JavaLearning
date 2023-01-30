import java.util.Scanner;

public class TicTacToe {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("\nLet's play tic tac toe");
    // Task 1: Create an array with three rows of '_' characters.
    char[][] board = {
        { '_', '_', '_' },
        { '_', '_', '_' },
        { '_', '_', '_' }
    };
    // Task 2: Call the function printBoard();
    printBoard(board);
    /*
     * { Task 3: Loop through turns.
     * 
     * if (X) turn {
     * Task 4: call askUser().
     * Task 5: populate the board using askUser's return value.
     * } else {
     * Task 4: call askUser().
     * Task 5: populate the board using askUser's return value. Then, print it.
     * 
     * }
     */
    for (int i = 0; i < 9; i++) {
      if (i % 2 == 0) {
        System.out.println("Turn: X");
        int[] spot = askUser(board);
        board[spot[0]][spot[1]] = 'X';
        printBoard(board);

      } else {
        System.out.println("Turn: O");
        int[] spot = askUser(board);
        board[spot[0]][spot[1]] = 'O';
        printBoard(board);
      }

      int chekWin = checkWin(board);
      if (chekWin == 3) {
        System.out.println("X wins");
        break;
      } else if (chekWin == -3) {
        System.out.println("O wins" + chekWin);
        break;
      } else if (i == 8) {
        System.out.println("It's a tie!");
      }
    }
    scan.close();
  }

  /**
   * Task 2 - Write a function that prints the board.
   * Function name - printBoard()
   * 
   * @param board (char[][])
   * 
   *              Inside the function:
   *              1. print a new line.
   *              2. print the board.
   *              • separate each row by two lines.
   *              • each row precedes a tab of space
   *              • each character in the grid has one space from the other
   *              character
   */
  public static void printBoard(char[][] boar) {
    System.out.print("\n");
    for (int i = 0; i < boar.length; i++) {
      System.out.print("\t");
      for (int j = 0; j < boar[i].length; j++) {
        System.out.print(boar[i][j] + " ");
      }
      System.out.print("\n\n");
    }
  }

  /**
   * Task 4 - Write a function that lets the user choose a spot
   * Function name – askUser
   * 
   * @param board (char[][] board)
   * @return spot (int[])
   * 
   *         Inside the function
   *         1. Asks the user: - pick a row and column number:
   *         2. Check if the spot is taken. If so, let the user choose again.
   *         3. Return the row and column in an int[] array.
   * 
   */
  public static int[] askUser(char[][] board) {
    System.out.println("Pick a row and column number");
    int row = scan.nextInt();
    int column = scan.nextInt();
    while (true) {
      if (row > 3 || row < 0 || column > 3 || column < 0) {
        System.out.println("Non-existent slot, please choose enother");
        row = scan.nextInt();
        column = scan.nextInt();
      } else {
        if (board[row][column] != '_') {
          System.out.println("That slot alreadey exist, please choose enother");
          row = scan.nextInt();
          column = scan.nextInt();
        } else {
          break;
        }
      }
    }
    int[] spot = { row, column };
    return spot;
  }

  /**
   * Task 6 - Write a function that determines the winner
   * Function name - checkWin
   * 
   * @param board (char[][])
   * @return count (int)
   * 
   *         Inside the function:
   *         1. Make a count variable that starts at 0.
   *         2. Check every row for a straight X or straight O (Task 7).
   *         3. Check every column for a straight X or straight O (Task 8).
   *         4. Check the left diagonal for a straight X or straight O (Task 9).
   *         5. Check the right diagonal for a straight X or straight O (Task 10).
   */
  public static int checkWin(char[][] board) {
    int counter = 0;
    
    for (int i = 0; i < board.length; i++) { // 0, 1, 2
      for (int j = 0; j < board[i].length; j++) { // Check row for a strighth
        if (board[i][j] == 'X') {
          counter++;
        } else if (board[i][j] == 'O') {
          counter--;
        }
      }
      if (counter == 3 || counter == -3) { // if stright X or O then return
        return counter;
      }
      counter = 0;
    }

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) { // Check column for a strighth
        if (board[j][i] == 'X') {
          counter++;
        } else if (board[i][j] == 'O') {
          counter--;
        }
      }
      if (counter == 3 || counter == -3) { // if stright X or O then return
        return counter;
      }
      counter = 0;
    }

    for (int i = 0; i < board.length; i++) { // Check left diagonal for a stright
      if (board[i][i] == 'X') {
        counter++;
      } else if (board[i][i] == 'O') {
        counter--;
      }
    }
    if (counter == 3 || counter == -3) { // if stright X or O then return
      return counter;
    }
    counter = 0;

    for (int i = board.length - 1; i >= 0; i--) { // Check right diagonal for a stright
      if (board[i][i] == 'X') {
        counter++;
      } else if (board[i][i] == 'O') {
        counter--;
      }
    }
    return counter;
  }
}
