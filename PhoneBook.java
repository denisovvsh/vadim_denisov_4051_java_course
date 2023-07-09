import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        // Если имя уже присутствует в книге, добавляем телефон к списку
        if (phoneBook.containsKey(name)) {
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            // Иначе создаем новую запись с одним телефоном
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }

    public void printPhoneBook() {
        // Создаем список записей из элементов
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());

        // Сортируем список по убыванию количества телефонов
        entries.sort(Comparator.comparingInt(entry -> entry.getValue().size()));
        Collections.reverse(entries);

        // Выводим отсортированные записи
        for (Map.Entry<String, List<String>> entry : entries) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            System.out.println("Имя: " + name);
            System.out.println("Телефоны: " + phoneNumbers);
        }
    }
}