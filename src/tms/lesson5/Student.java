package tms.lesson5;

public class Student {

    public String name;
    public String surname;
    public int age;
    public int attendedLessons;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String uName, String uSurname, int uAge) {
        name = uName;
        surname = uSurname;
        age = uAge;
    }

    public Student(String name, String uSurname, int uAge, int uAtLesson) {
        this.name = name;
        surname = uSurname;
        age = uAge;
        attendedLessons = uAtLesson;
    }

    public String fullName () {
        return "Name and surname: " + name + " " + surname;
    }

    public void attend () {
        System.out.println(surname + " is attended " + attendedLessons + " lesson(s).");
    }

}
