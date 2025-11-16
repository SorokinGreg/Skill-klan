package skillklan.module1.theme4;

import java.util.ArrayList;
import java.util.List;

public class Homework3ArrayCities {
    public static void main(String[] args) {
        // TODO: краще не дублювати тип <String>, Java сама виведе (type inference).
        // Правильний варіант: new ArrayList<>(List.of("Лондон", "Берлін", "Київ"))
        ArrayList<String> cities = new ArrayList<String>(List.<String>of("Лондон", "Берлін", "Київ"));
        cities.add("Жмеринка");
        // TODO: Цикл for працює, але для списків краще використовувати for-each
        for (int i = 0; i < cities.size(); i++)
            System.out.println(cities.get(i));
    }
}
