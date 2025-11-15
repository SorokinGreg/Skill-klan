package skillklan.module1.theme4;

import java.util.ArrayList;
import java.util.List;

public class Homework3ArrayCities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>(List.<String>of("Лондон", "Берлін", "Київ"));
        cities.add("Жмеринка");
        for (int i = 0; i < cities.size(); i++)
            System.out.println(cities.get(i));
    }
}
