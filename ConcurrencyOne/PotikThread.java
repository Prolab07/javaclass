package ConcurrencyOne;

public class PotikThread extends Thread{
    private final int threadNumber;
    private final String threadname;

    public PotikThread(String threadname, int threadNumber) {
        this.threadNumber = threadNumber;
        this.threadname = threadname;
    }

    @Override
    public void run() {
        System.out.println("Потік запущено" + " " + threadname + " " + threadNumber);
    }
}
