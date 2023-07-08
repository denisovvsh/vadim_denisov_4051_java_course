/* 
2 Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.
*/
public class sem4_2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Размер очереди: " + queue.size());
        System.out.println("Первый элемент: " + queue.first());
        
        int element = queue.dequeue();
        System.out.println("Извлеченный элемент: " + element);

        System.out.println("Размер очереди после извлечения: " + queue.size());
    }
}
