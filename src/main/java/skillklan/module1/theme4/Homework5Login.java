package skillklan.module1.theme4;

public class Homework5Login {
    public static void main(String[] args) {
        String expected = "Login successful";
        String actual = "Logi successful";
        if (expected.equals(actual)) {
            System.out.println("Тест пройдено");
        } else {
            System.out.println("Тест не пройдено");
            System.out.println("Очікуваний результат: " + expected);
            System.out.println("Фактичний результат: " + actual);
        }
    }
}
