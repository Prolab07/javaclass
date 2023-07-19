package Generics;

import java.util.Arrays;

public class GenericWork {
    public static void main(String[] args) {
       Pair pair1 = new Pair("horoshaya", "ptichka");
       Pair pair2 = new Pair<>(17, 14);
       System.out.println(pair1);
       System.out.println(pair2);

       Pair pair = new Pair();
       pair.setSecond(7);
       pair.setFirst("seven");
       System.out.println(pair.getFirst() + " " + "/" + " " + pair.getSecond());
       pair.setFirst("one two three");
       System.out.println(pair.getFirst());
       pair.setSecond(123);
       System.out.println(pair.getSecond());
       int mass [] = {1, 3, 6};
       pair.setFirst(mass);
       Arrays.toString(mass);
       System.out.println(pair.getFirst());
       String mass1 [] = {"four", "five", "six" };
       pair.setSecond(mass1);
       Arrays.toString(mass1);
       System.out.println(pair.getSecond());
    }
}
