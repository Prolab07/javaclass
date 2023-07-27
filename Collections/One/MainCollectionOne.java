package Collections.One;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainCollectionOne {
    public static void main(String[] args){
        LinkedList <Integer> linkedlist = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            linkedlist.add(i);
        }
        ArrayList <Integer> arraylist = new ArrayList<>();
        for (int i = 0; i < 2000000; i++) {
            arraylist.add(i);
        }
        Student student = new Student("Olena", "Pavlenko", 18);
        Student student1 = new Student("Davidenko", "Oksana", 19);
        Student student2 = new Student("Petrakov", "Oleg", 20);

        ArrayList <Student> studentlist = new ArrayList<>();
        studentlist.add(student);
        studentlist.add(student1);
        studentlist.add(student2);

        System.out.println(studentlist);


    }
}
