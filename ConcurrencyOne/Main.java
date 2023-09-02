package ConcurrencyOne;

public class Main {
    public static void main(String[] args) {
        PotikThread potik1 = new PotikThread("One", 1);
        PotikThread potik2 = new PotikThread("two", 2);

        runThreads(potik1, potik2);

        Thread thread3 = new Thread(() -> {
            System.out.println("potik 3");
        });
        thread3.start();

        Runnable potikfour = () -> {
            System.out.println("potik 4");
        };
        new Thread(potikfour).start();

    }

    private static void runThreads(Thread ... threads){
        for (Thread thread : threads) {
            thread.start();
        }
    }
}
