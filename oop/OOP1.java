package oop;

public class OOP1 {
    public static void main(String[] args) {
        System.out.println("Students:");
        Student Olena = new Student();
        Olena.setName("");
        Olena.setSurname("Pavlenko");
        Olena.setNumberTicket("98765432");

        Student Oleg = new Student();
        Oleg.setName("Oleg");
        Oleg.setSurname("Zotov");
        Oleg.setNumberTicket("number");

        System.out.println("name:");
        System.out.println(Olena.getName());
        System.out.println("username:");
        System.out.println(Olena.getSurname());
        System.out.println("numberTicket:");
        System.out.println(Olena.getNumberTicket());

        System.out.println(Oleg.getName());
        System.out.println("name:");
        System.out.println(Oleg.getSurname());
        System.out.println("username:");
        System.out.println(Oleg.getNumberTicket());
        System.out.println("numberTicket:");

        System.out.println("Teachers:");
        Teacher maths = new Teacher("leykova", "lecher", "professor", 27);
        Teacher physics = new Teacher("Vavilow", "lecher", "master", 14);

        System.out.println(maths.getSurname());
        System.out.println(maths.getPost());
        System.out.println(maths.getDegre());
        System.out.println(maths.getNumberRoom());

        System.out.println(physics.getSurname());
        System.out.println(physics.getPost());
        System.out.println(physics.getDegre());
        System.out.println(physics.getNumberRoom());

        Staff cheff = new Staff("rokov", 27);
        Staff waiter = new Staff("cook", "rukov");

        System.out.println(cheff.getUsername());
        System.out.println(cheff.getAge());

        System.out.println(waiter.getCategory());
        System.out.println(waiter.getUsername());
    }
}
