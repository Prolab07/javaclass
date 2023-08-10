package Stream.Api.One;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainStreamApiOne {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();

        Student ivan = new Student("Popov", 5.0F);
        Student yulay = new Student("Rebrov", 4.4F);
        Student ira = new Student("Zyb", 3.3F);
        Student kolay = new Student("Ivanov", 4.5F);
        Student lena = new Student("Tron", 4.9F);

        student.add(ivan);
        student.add(yulay);
        student.add(ira);
        student.add(kolay);
        student.add(lena);
        student.add(new Student("Kotov", 4.4F));
        student.add(new Student("Gonov", 4.2F));

        System.out.println();
        for (Student student1 : student) {
            System.out.println(student1);
        }

        List<Student> sortlastname = student.stream()
                .sorted(Comparator.comparing(Student::getLastname))
                .toList();

        System.out.println();
        sortlastname.forEach(System.out::println);

        List<Student> averagemark = student.stream()
                .sorted(Comparator.comparing(Student::getAveragemark))
                .toList();

        System.out.println();
        averagemark.forEach(System.out::println);
    }
}
