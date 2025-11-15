package skillklan.module1.theme4;

public class Homework1Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(4, 5));
    }
}
    class Calculator {
        int add(int a, int b) {
            int result = a + b;
            return result;
        }
    }

