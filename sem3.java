import java.util.ArrayList;
import java.util.List;

public class sem3 {
    public static void main(String[] args) {
        // Исходный список целых чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        task1(numbers);
        task2(numbers);
        task3(numbers);
        task4(numbers);
    }

    static void task1(List<Integer> numbers) {
        // 1) Удаление чётных чисел
        numbers.removeIf(number -> number % 2 == 0);
        System.out.println("Список после удаления чётных чисел: " + numbers);
    }

    static void task2(List<Integer> numbers) {
        // 2) Нахождение минимального значения
        int min = numbers.stream()
            .min(Integer::compareTo)
            .orElseThrow(() -> new RuntimeException("List is empty"));
        System.out.println("Минимальное значение: " + min);
    }

    static void task3(List<Integer> numbers) {
        // 3) Нахождение максимального значения
        int max = numbers.stream()
            .max(Integer::compareTo)
            .orElseThrow(() -> new RuntimeException("List is empty"));
        System.out.println("Максимальное значение: " + max);
    }

    static void task4(List<Integer> numbers) {
        // 4) Нахождение среднего значения
        double average = numbers.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElseThrow(() -> new RuntimeException("List is empty"));
        System.out.println("Среднее значение: " + average);
    }
}