package tms.tms.lesson5;

public class MainApp {

    public static void main(String[] args) {

        Student olia = new Student("Olga", "Vergun");

        olia.attendedLessons = 6;
        String oliaFull = olia.fullName();
        System.out.println(oliaFull);
        olia.attend();

        Student anya = new Student("Anna", "Volkova", 25);

        anya.attendedLessons = 10;
        String anyaFull = anya.fullName();
        System.out.println(anyaFull);
        anya.attend();

        Student sasha = new Student("Alexander", "Gavrilov", 30, 1);

        String sashaFull = sasha.fullName();
        System.out.println(sashaFull);
        sasha.attend();

    }
}
