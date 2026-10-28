import java.util.Scanner;

public class SiakadWhile07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grade;
        int pass = 0, fail = 0;
        int i = 1;
        int total;

        System.out.print("Enter the number of students: ");
        total = sc.nextInt();

        while (i <= total) {
            System.out.print("Enter the grade of the " + i + " student: ");
            grade = sc.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Re-enter a valid grade!");
                continue;
            }

            if (grade > 80 && grade <= 100) {
                System.out.println("The grade of the " + i + " student is A");
            } else if (grade > 73 && grade <= 80) {
                System.out.println("The grade of the " + i + " student is B+");
            } else if (grade > 65 && grade <= 73) {
                System.out.println("The grade of the " + i + " student is B");
            } else if (grade > 60 && grade <= 65) {
                System.out.println("The grade of the " + i + " student is C+");
            } else if (grade > 50 && grade <= 60) {
                System.out.println("The grade of the " + i + " student is C");
            } else if (grade > 39 && grade <= 50) {
                System.out.println("The grade of the " + i + " student is D");
            } else {
                System.out.println("The grade of the " + i + " student is E");
            }

            i++; // update counter di akhir loop
        }
        
    }
}