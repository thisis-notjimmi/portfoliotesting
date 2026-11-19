import java.util.Scanner;

public class threedarray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sections = 2;
    int students = 3;

    for (int s = 1; s <= sections; s++) {
      System.out.println("\nSECTION " + s);
      System.out.println("--------------------");
      double total = 0;

      for (int st = 1; st <= students; st++) {
        System.out.println("\nStudent " + st);
        double[] grades = new double[3];

        System.out.print("Java: ");
        grades[0] = sc.nextDouble();
        System.out.print("Database: ");
        grades[1] = sc.nextDouble();
        System.out.print("Networking: ");
        grades[2] = sc.nextDouble();

        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
          sum += grades[i];
        }
        double avg = sum / grades.length;
        total += avg;
        System.out.printf(
            "Student Average: %.2f%n", avg);
      }

      double secAvg = total / students;
      System.out.printf(
          "Section Average: %.2f%n", secAvg);
    }
    sc.close();
  }
}