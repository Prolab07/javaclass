package Stream.Api.Two;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

//задача создать лист с рандомными значениями и вывести их сумму
public class RandomApi {
    private static int random() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        List<Integer> randomlist = List.of(random(),random(),random(),random());
        //List<Integer> randomlistone = new ArrayList<>(random()); // надо разобраться
        Optional<Integer> sum = randomlist.stream().reduce((a, b) -> a+b);
        System.out.println(sum.get());
        System.out.println("Сумма" + " " + sum.get());

        System.out.println(randomlist);
        //System.out.println(randomlistone);
    }
}
