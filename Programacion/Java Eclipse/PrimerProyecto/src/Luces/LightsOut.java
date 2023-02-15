package Luces;
import java.util.Scanner;

public class LightsOut {
  static int[][] board = new int[5][5];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Inicializar el tablero
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        board[i][j] = 0;
      }
    }

    while (true) {
      System.out.println("Current board:");
      printBoard();
      System.out.print("Enter row and column: ");
      int row = sc.nextInt();
      int col = sc.nextInt();
      toggle(row, col);

      if (isSolved()) {
        System.out.println("You won!");
        break;
      }
    }
  }

  static void toggle(int row, int col) {
    // Cambiar el estado de la celda dada
    if (row >= 0 && row < 5 && col >= 0 && col < 5) {
      board[row][col] ^= 1;
      if (row > 0) {
        board[row - 1][col] ^= 1;
      }
      if (row < 4) {
        board[row + 1][col] ^= 1;
      }
      if (col > 0) {
        board[row][col - 1] ^= 1;
      }
      if (col < 4) {
        board[row][col + 1] ^= 1;
      }
    }
  }

  static boolean isSolved() {
    // Comprobar si todas las celdas son 0
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (board[i][j] != 0) {
          return false;
        }
      }
    }
    return true;
  }

  static void printBoard() {
    // Imprimir el tablero actual
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
}
