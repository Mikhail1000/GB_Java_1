package Java_2.lesson_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private ArrayList<Map<String, String>> book = new ArrayList<>();

    public void add(String lastName, String phoneNumber){
        Map<String, String> contact = new HashMap<>();
        contact.put(lastName, phoneNumber);
        book.add(contact);
    }

    protected void get(String lastName){
        for (Map<String, String> contact : book) {
            if (contact.containsKey(lastName)){
                System.out.println("Телефон " + lastName + "а: " + contact.get(lastName));
            }
        }
    }
}
