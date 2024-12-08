package tms.lesson4;

public class Massive1 {

    public static void main(String[] args) {

        int[] firstmass = new int[]{10, 3, 5, 4, 5, 1, 9, 11, 6};

        int[] secondmass = new int[]{2, 8, 10, 3, 9};

        for (int first : firstmass) {
            for (int second : secondmass) {
                if (first == second) {
                    System.out.println("Duplicate is detected: " + first);
                }
            }
        }
    }
}
