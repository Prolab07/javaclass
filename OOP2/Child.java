package OOP2;

public class Child extends OOP2 {
    static {
        System.out.println("1 Child static method");
    }

    {
        System.out.println("2 Child block code");
    }

    public Child() {
        System.out.println("3 Child constructor");
    }
}
