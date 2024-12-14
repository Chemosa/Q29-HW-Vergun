package tms.lesson2;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your value:");

        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        System.out.print("Factorial of your value is ");
        System.out.println(result);
    }
}
