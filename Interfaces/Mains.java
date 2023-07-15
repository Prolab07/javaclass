package Interfaces;


public class Mains {
    public static void main(String[] args) {
      Dravering sasha = new Draver();
      Flying kolay = new Pilot();

      Humans vasay = new Draver();
      Humans tolay = new Pilot();

      sasha.action();
      kolay.action();

      vasay.profession();
      tolay.profession();
    }
}
