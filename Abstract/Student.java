package Abstract;

public class Student extends Human {

    private String firstname;
    private String post;

    public Student(String firstname, String post) {
        this.firstname = firstname;
        this.post = post;
    }

    @Override
    public void occupation() {
        System.out.println("group");
    }

    @Override
    public void name() {
        System.out.println("pupil");
    }
}



