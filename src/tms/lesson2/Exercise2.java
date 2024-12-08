package tms.lesson2;

public class Exercise2 {

    public static void main(String[] args) {

        int res = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                res = res + 1;
            }

            if (i % 25 == 0) {
                res = res + 1;
            }
        }
        System.out.println(res);
        System.out.println("Finish");
    }
}
