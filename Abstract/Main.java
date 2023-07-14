package Abstract;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit banana = new Banana();

        apple.color();
        banana.color();

        Human student = new Student("Otus", "learner");
        Human teacher = new Teacher("Popov", "lecher");

        student.occupation();
        student.name();
        teacher.occupation();
        teacher.name();
    }
}
