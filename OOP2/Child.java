package OOP2;

public class Child extends OOP2 {
    static {
        System.out.println("2 Child static method");
    }

    {
        System.out.println("5 Child block code");
    }

    public Child() {
        System.out.println("6 Child constructor");
    }
}
