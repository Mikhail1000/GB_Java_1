package Java_2.lesson_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Пермь", "Москва", "Екатеринбург", "Тундра", "Нягань", "Москва", "Пермь", "Пермь", "Москва", "Пермь", "Тундра", "Пермь", "Москва", "Пермь", "Екатеринбург"};

        HashMap<String, Integer> cities = new HashMap<>();
        for (String str : array) {
            if (cities.containsKey(str)) {
                cities.put(str, cities.get(str) + 1);
            }
            else{
                cities.put(str, 1);
            }
        }
        System.out.println(cities);
        System.out.println();

        Phonebook phonebook = new Phonebook();
        phonebook.add("Васильев", "+79223654128");
        phonebook.add("Васильев", "+79223651478");
        phonebook.add("Петров", "+79265847478");
        phonebook.get("Васильев");
        phonebook.get("Петров");

    }
}
