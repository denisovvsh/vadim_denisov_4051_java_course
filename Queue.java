import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() {
        return queue.removeFirst();
    }

    public T first() {
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}