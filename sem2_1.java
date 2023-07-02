/* 
1) Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: 
    {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} select * from students where 'name=Ivanov' and 'country=Russia' and...
 */

public class sem2_1 {
    public static void main(String[] args) {
        task1();
    }

    static void task1(){

        String jsonFilter = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        // Удаление фигурных скобок из JSON строки
        String cleanedJson = jsonFilter.substring(1, jsonFilter.length() - 1);

        // Разбиение строки по запятым для получения пар ключ-значение
        String[] keyValuePairs = cleanedJson.split(", ");

        // Создание StringBuilder для формирования части WHERE запроса
        StringBuilder whereClause = new StringBuilder();

        // Разбор пар ключ-значение
        for (String pair : keyValuePairs) {
            String[] parts = pair.split(":");
            String key = parts[0].replace("\"", "");
            String value = parts[1].replace("\"", "");

            // Проверка на null
            if (!"null".equals(value)) {
                // Добавление условия в часть WHERE запроса
                whereClause.append(key).append("=").append(escapeValue(value)).append(" AND ");
            }
        }

        // Удаление последнего " AND "
        if (whereClause.length() >= 5) {
            whereClause.delete(whereClause.length() - 5, whereClause.length());
        }

        // Формирование полного запроса
        String sqlQuery = "SELECT * FROM students WHERE " + whereClause.toString();

        System.out.println(sqlQuery);
    }

    // Метод для экранирования значения
    public static String escapeValue(String value) {
        return "'" + value + "'";
    }
}
