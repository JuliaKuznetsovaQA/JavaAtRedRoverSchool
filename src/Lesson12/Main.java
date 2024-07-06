package Lesson12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== Set =======");

        Set<String> mySet = new HashSet<>();
        mySet.add("vasya");
        mySet.add("petya");
        mySet.add("vasya");
        mySet.add("nikolay");
        System.out.println(mySet.size());
        System.out.println(mySet);

        Set<Person> people = new HashSet<>();
        people.add(new Person("Vasya"));
        people.add(new Person("Vasya"));
        people.add(new Person("Ilya"));
        System.out.println(people.size());

        for (Person p : people) {
            System.out.println(p.name);
        }

        System.out.println("====== Map =======");

        Map<String, Person> people1 = new HashMap<>();
        people1.put("1x", new Person("Vasya"));
        people1.put("2x", new Person("Petr"));
        people1.put("20x", new Person("Nikolay"));
        System.out.println(people1);
        System.out.println(people1.get("20x"));
        System.out.println(people1.getOrDefault("2000xxx", new Person("AAAA")));
        System.out.println(people1);

        System.out.println("================================");

        for (String key: people1.keySet()) {
            System.out.println("Key = " + key + ", value = " + people1.get(key));
        }

        System.out.println("================================");

        Map<Character, Integer> charCounts = new HashMap<>();
        String str = "0ainmvaiyryu7b7tcoa8wudmc'-a-[w0aj998esytbvtrgvfvanoasaecni-0lkoihyt7bay7ycteledai";
        for (char c : str.toCharArray()) {
            int currentCount = charCounts.getOrDefault(c, 0);
            charCounts.put(c, currentCount + 1);
        }
        System.out.println(charCounts);

    }

    private static class Person {
        private final String name;

        private Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person " + name;
        }
    }
}
