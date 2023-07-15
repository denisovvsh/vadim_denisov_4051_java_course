/* 
1 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2 Создать множество ноутбуков.
3 Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, 
соответствующую необходимому критерию:
1 - ОЗУ

2 - Объем ЖД

3 - Операционная система

4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

import java.util.*;

public class sem6 {
    public static void main(String[] args) {
        Set<Notebook> notebooks = createNotebookSet();
        filterNotebooks(notebooks);
    }

    public static Set<Notebook> createNotebookSet() {
        // Создание множества ноутбуков
        Set<Notebook> notebooks = new HashSet<>();
        
        // Создание и добавление ноутбуков в множество
        Notebook notebook1 = new Notebook("Model 1", "Manufacturer 1", 1000.0, 2020, 8, 500, "Windows", "Gray");
        Notebook notebook2 = new Notebook("Model 2", "Manufacturer 2", 1500.0, 2021, 16, 1000, "macOS", "Silver");
        Notebook notebook3 = new Notebook("Model 3", "Manufacturer 3", 2000.0, 2022, 8, 750, "Linux", "Black");
        
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        
        return notebooks;
    }

    public static void filterNotebooks(Set<Notebook> notebooks) {
        // Создание критериев фильтрации
        Map<Integer, Object> filterCriteria = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите цифру, соответствующую критерию фильтрации:");
        System.out.println("1 - RAM");
        System.out.println("2 - Storage Capacity");
        System.out.println("3 - Operating System");
        System.out.println("4 - Color");
        
        int criterion = scanner.nextInt();
        scanner.nextLine(); // Считываем перевод строки после ввода цифры
        
        switch (criterion) {
            case 1:
                System.out.println("Введите минимальное значение RAM (в ГБ):");
                int ram = scanner.nextInt();
                filterCriteria.put(1, ram);
                break;
            case 2:
                System.out.println("Введите минимальное значение Storage Capacity (в ГБ):");
                int storageCapacity = scanner.nextInt();
                filterCriteria.put(2, storageCapacity);
                break;
            case 3:
                System.out.println("Введите желаемую операционную систему:");
                String operatingSystem = scanner.nextLine();
                filterCriteria.put(3, operatingSystem);
                break;
            case 4:
                System.out.println("Введите желаемый цвет:");
                String color = scanner.nextLine();
                filterCriteria.put(4, color);
                break;
            default:
                System.out.println("Некорректный ввод.");
                return;
        }
        
        // Фильтрация ноутбуков и вывод результатов
        Set<Notebook> filteredNotebooks = new HashSet<>();
        
        for (Notebook notebook : notebooks) {
            boolean passFilter = true;
            
            for (Map.Entry<Integer, Object> entry : filterCriteria.entrySet()) {
                int key = entry.getKey();
                Object value = entry.getValue();
                
                switch (key) {
                    case 1:
                        if (notebook.getRam() <= (int) value) {
                            passFilter = false;
                        }
                        break;
                    case 2:
                        if (notebook.getStorageCapacity() <= (int) value) {
                            passFilter = false;
                        }
                        break;
                    case 3:
                        if (!notebook.getOperatingSystem().equalsIgnoreCase((String) value)) {
                            passFilter = false;
                        }
                        break;
                    case 4:
                        if (!notebook.getColor().equalsIgnoreCase((String) value)) {
                            passFilter = false;
                        }
                        break;
                }
                
                if (!passFilter) {
                    break;
                }
            }
            
            if (passFilter) {
                filteredNotebooks.add(notebook);
            }
        }
        
        // Вывод результатов фильтрации
        System.out.println("Ноутбуки, отвечающие условиям фильтрации:");
        
        if (filteredNotebooks.isEmpty()) {
            System.out.println("Нет ноутбуков, удовлетворяющих условиям фильтрации.");
        } else {
            for (Notebook notebook : filteredNotebooks) {
                notebook.displayInfo();
                System.out.println("-----------------------");
            }
        }
    }
}

