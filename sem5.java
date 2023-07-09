/* 
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
*/

public class sem5 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("John", "123456789");
        phoneBook.addContact("Alice", "987654321");
        phoneBook.addContact("John", "555555555");
        phoneBook.addContact("Alice", "111111111");
        phoneBook.addContact("Bob", "999999999");

        phoneBook.printPhoneBook();
    }
}
