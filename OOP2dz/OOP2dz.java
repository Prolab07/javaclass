package OOP2dz;

public class OOP2dz {
    public static void main(String[] args){
        Avto Mers = new Mashina();
        Avto Bus = new Truck();
        Avto avto = new Bus();
        Truck avto1 = new Bus();
        Bus avto2 = new Bus();

        Mers.type();
        Bus.type();
        avto.type();
        avto1.type();
        avto2.type();
    }
}
