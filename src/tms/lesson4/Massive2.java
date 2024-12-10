package tms.lesson4;

public class Massive2 {

    public static void main(String[] args) {

        int[] massive = new int[] {1, 20, 6, 8, 10, -5};

        int sum = 0;
        int maxEl = massive[0];
        int minEl = massive[0];

        for (int i = 0; i < massive.length; i++) {

             if (maxEl < massive[i]) {
                maxEl = massive[i];
            }
             if (minEl > massive[i]) {
                 minEl = massive[i];
             }

             sum = sum + massive[i];

        }

        System.out.println("Amount of elements is " + massive.length);
        System.out.println("Sum of all elements is " + sum);
        System.out.println("Maximal value of element is " + maxEl);
        System.out.println("Minimal value of element is " + minEl);

    }

}
