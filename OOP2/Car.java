package OOP2;

public class Car {
    private static final String NOT_SPECIFIED = "not specified";
    private String mark;
    private String model;
    private int year;

    {
        System.out.println("A new car is created");
    }

    public Car() {
        this.mark = NOT_SPECIFIED;
        this.model = NOT_SPECIFIED;
        this.year = 2000;
    }

    public Car(String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
