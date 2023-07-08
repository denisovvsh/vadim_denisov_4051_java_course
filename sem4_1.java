/* 
1 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
*/

import java.util.LinkedList;

public class sem4_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        LinkedList<Integer> reversedList = reverseLinkedList(list);
        System.out.println("Перевернутый список: " + reversedList);
    }
    
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (Integer element : list) {
            reversedList.addFirst(element);
        }
        return reversedList;
    }
}
