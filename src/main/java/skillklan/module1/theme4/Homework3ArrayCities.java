package skillklan.module1.theme4;

import java.util.ArrayList;
import java.util.List;

public class Homework3ArrayCities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(List.of("Лондон", "Берлін", "Київ"));
        cities.add("Жмеринка");
        for (String names : cities) {
            System.out.println(names);
        }
    }
}
