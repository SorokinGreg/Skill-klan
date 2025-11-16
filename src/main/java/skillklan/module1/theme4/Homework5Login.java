package skillklan.module1.theme4;

public class Homework5Login {
    public static void main(String[] args) {
        String expected = "Login successful";
        String actual = "Login successful";

        // TODO (1): НЕ можна порівнювати строки через == (це прям дуже часто питають на співбесідах. Чим відрізняється == від equals )
        // ЧОМУ?
        // == порівнює не текст, а ПОСИЛАННЯ на об’єкт у пам'яті.
        // В автоматизованому тестуванні це майже завжди дасть неправильний результат.
        // Правильний спосіб порівняти два рядки — метод .equals()
        if (expected == actual) {
            System.out.println("Тест пройдено");
        } else {
            System.out.println("Тест не пройдено");
        }

        // TODO (2): Як покращення можеш додати вивід expected і actual у разі помилки.
        // Це наблизить код до реальних автоматизованих тестів.
        //
        // Наприклад:
        //
        // else {
        //     System.out.println("Тест не пройдено");
        //     System.out.println("Очікувано: " + expected);
        //     System.out.println("Отримано: " + actual);
        // }
    }
}
