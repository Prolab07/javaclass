package Interfaces;

public class Draver extends Humans implements Dravering {

    @Override
    public void profession() {
        System.out.println("I am driver");
    }

    @Override
    public void action() {
        System.out.println("I am drivering");
    }
}