package tms.lesson2;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float sum = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Enter your grade: ");
            float grade = scan.nextFloat();

            sum = sum + grade;

            System.out.println("Was entered: " + i);
            System.out.println("Arithmetic mean: " + sum/ i);
            System.out.println("Remains to enter: " + (10 - i));
        }
    }
}
