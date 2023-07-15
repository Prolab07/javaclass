package Interfaces;

public class Mains {
    public static void main(String[] args) {
      Dravering sasha = new Draver();
      Flying kolay = new Pilot();

      sasha.action();
      kolay.action();
    }
}
