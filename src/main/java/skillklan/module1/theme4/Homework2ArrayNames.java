package skillklan.module1.theme4;

public class Homework2ArrayNames {
    public static void main(String[] args) {
//        String[] arr = {"Борис, Іван, Руслан, Ірина, Олена"};//TODO якщо тут зрозумів в чому помилка, то видали цей коментар він тут не потрібен
        String[] arr = {"Борис", "Іван", "Руслан", "Ірина", "Олена"};
        // TODO: Цикл for написаний правильно, але краще використовувати for-each для читабельності.
        // TODO: Замість arr[n] краще використати for (String name : arr)
        for (int n = 0; n < arr.length; n++) {
            System.out.println(arr[n]);
        }
    }
}