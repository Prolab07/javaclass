package ConcurrencyTwo;

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    private static int number1 = 1;
    private static int number2 = 10;
    private static int maxnumber = 50;

    public static void main(String[] args) {
        onePotik();
        collablePotik();
    }

    // задача. потік генерує числа в діапазоні від 1 до 10, бескінечно, поки не згенерує число 5, і перериває роботу на цьому
    public static void onePotik() {
        Thread threadone = new Thread(() -> {
            Random random = new Random();
            boolean it = true;
            while (it) {
                int randomrezult = (random.nextInt(number2 - number1 + 1) + number1);
                System.out.println(randomrezult);
                if (randomrezult == 5) {
                    break;
                }
            }
        });

        threadone.start();
    }


    //задача: створити потік, який повертає рандомне число від 1 до 50. зробити пул з 10 потоків для виклику цього методу
    public static void collablePotik() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Callable<Integer> returnRandomInt = () -> {
            Random random = new Random();
            return (random.nextInt(maxnumber - number1 + 1) + number1);
        };
        try {
            Future<Integer> future = executorService.submit(returnRandomInt);
            Integer result = future.get();
            System.out.println("Random number" + " " + result);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
    }
}

