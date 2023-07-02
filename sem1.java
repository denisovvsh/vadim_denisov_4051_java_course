import java.util.Scanner;

public class sem1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    //1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    static void task1(){
        int n = 5;

        //Вычисление треугольного числа
        int triangularNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
        }
        System.out.println("Треугольное число " + n + ": " + triangularNumber);

        //Вычисление факториала
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал " + n + ": " + factorial);
    }

    //2) Вывести все простые числа от 1 до 1000
    static void task2(){
        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
        }
    }

    //3) Реализовать простой калькулятор
    static void task3(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверная операция.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
