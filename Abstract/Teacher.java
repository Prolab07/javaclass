package Abstract;

public class Teacher extends Human {

    private String firstname;
    private String post;

    public Teacher(String firstname, String post) {
        this.firstname = firstname;
        this.post = post;
    }

    @Override
    public void occupation() {
        System.out.println("firstname");
    }

    @Override
    public void name() {
        System.out.println("post");
    }
}
