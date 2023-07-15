package Interfaces;
public class Pilot extends Humans implements Flying {
    @Override
    public void profession() {
        System.out.println("I am pilot");
    }

    @Override
    public void action() {
        System.out.println("I am flying");
    }
}
