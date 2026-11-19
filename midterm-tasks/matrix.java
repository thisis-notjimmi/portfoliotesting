import java.util.Scanner;

public class matrix {

  static int readDigit(Scanner sc) {
    while (true) {
      if (sc.hasNextInt()) {
        int v = sc.nextInt();
        if (v >= 0 && v <= 9) return v;
        System.out.println("Invalid. Enter 0-9:");
      } else {
        System.out.println("Not a number. 0-9:");
        sc.next();
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int SIZE = 3;

    while (true) {
      int[][] m = new int[SIZE][SIZE];
      System.out.println("Enter 9 numbers (0-9):");

      for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
          m[i][j] = readDigit(sc);
        }
      }

      System.out.println("\nResults:");
      System.out.println("=====================");
      System.out.println("          Row Sum");
      for (int i = 0; i < SIZE; i++) {
        int rowSum = 0;
        for (int j = 0; j < SIZE; j++) {
          System.out.printf("%4d", m[i][j]);
          rowSum += m[i][j];
        }
        System.out.printf("%4d\n", rowSum);
      }

      System.out.print("\ncolumn sum:");
      for (int j = 0; j < SIZE; j++) {
        int colSum = 0;
        for (int i = 0; i < SIZE; i++) {
          colSum += m[i][j];
        }
        System.out.printf("%4d", colSum);
      }
      System.out.println();
      System.out.println("---------------------");

      int d1 = 0, d2 = 0;
      for (int i = 0; i < SIZE; i++) {
        d1 += m[i][i];
        d2 += m[i][SIZE - 1 - i];
      }
      System.out.printf("diag sum 1:%4d\n", d1);
      System.out.printf("diag sum 2:%4d\n", d2);
      System.out.println("=====================");

      while (true) {
        System.out.print("Try Again [y/n]: ");
        String c = sc.next();
        if (c.equalsIgnoreCase("y")) {
          System.out.println("Continuing...");
          break;
        } else if (c.equalsIgnoreCase("n")) {
          System.out.println("cool cool bye");
          return;
        } else {
          System.out.println("BRUH use y or n");
        }
      }
    }
  }
}