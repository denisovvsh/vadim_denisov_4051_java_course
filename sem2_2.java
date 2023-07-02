import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class sem2_2 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};

        // Открываем лог-файл для записи
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            writer.write("Исходный массив: ");
            printArray(array, writer);

            // Производим сортировку пузырьком
            bubbleSort(array, writer);

            writer.write("Отсортированный массив: ");
            printArray(array, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bubbleSort(int[] array, BufferedWriter writer) throws IOException {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Меняем элементы местами
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Записываем промежуточный результат в лог-файл
                    writer.write("Итерация " + (i + 1) + ", Перестановка " + (j + 1) + ": ");
                    printArray(array, writer);
                }
            }
        }
    }

    public static void printArray(int[] array, BufferedWriter writer) throws IOException {
        for (int i = 0; i < array.length; i++) {
            writer.write(array[i] + " ");
        }
        writer.newLine();
    }
}
