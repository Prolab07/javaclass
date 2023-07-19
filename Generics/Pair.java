package Generics;

public class Pair <Q,W> {
    private Q first;
    private W second;

    public Pair() {
        this.first = first;
        this.second = second;
    }

    public Pair(Q first, W second) {
        this.first = first;
        this.second = second;
    }

    public Q getFirst() {
        return first;
    }

    public void setFirst(Q first) {
        this.first = first;
    }

    public W getSecond() {
        return second;
    }

    public void setSecond(W second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
