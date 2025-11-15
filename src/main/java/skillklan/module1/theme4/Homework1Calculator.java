package skillklan.module1.theme4;

public class Homework1Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();// TODO: створення об'єкта Calculator залишаємо — це правильно
        System.out.println(calc.add(4, 5));// TODO: вивід у консоль працює, але буде правильно перевірити результат у змінній перед виводом
    }
}

// TODO: Клас Calculator має бути в окремому файлі Calculator (Java convention: 1 клас = 1 файл)
// TODO: Клас Calculator має бути public, щоб його можна було використовувати в іншому файлі

    class Calculator {
        // TODO: метод add має бути public, щоб бути доступним з Homework1Calculator
        int add(int a, int b) {
            // TODO: можна скоротити: return a + b;
            int result = a + b;
            return result;
        }
    }

