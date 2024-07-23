package Lesson16;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1, -34, 0, 47, -6, 873, -999);
        System.out.println(findMax(ints));
        System.out.println(findMax(Collections.emptyList()));
        System.out.println(findMax(List.of(999)));

        System.out.println(findMin(ints));
        System.out.println(findMin(Collections.emptyList()));
        System.out.println(findMin(List.of(999)));

        System.out.println(findAbsMore(ints));

        List<String> strings = List.of("a", "234", "qwerqwerqwer", "uybcwi8u/o8 yf,n ye7wb/ffgt");
        System.out.println(findLongest(strings));
        System.out.println(findLongest(List.of("")));
        System.out.println(findLongest(Collections.emptyList()));

        List<Animal> animals = List.of(Animals.TIGER, Animals.ELEPHANT, Animals.BEAR, Animals.ANT);
        System.out.println(findHeaviest(animals));

        System.out.println(findUltimateGeneric(animals, Animals.LIFT_MAX_WEIGHT));

        System.out.println(findUltimateGeneric(animals, Animals.STRONGEST));
    }

    static <T> T findUltimateGeneric(List<T> elements, GenericComparator<T> comparator) {
        if (elements.size() == 0) return null;
        T champion = elements.get(0);
        for (int i = 0; i < elements.size(); i++) {
            if (comparator.compare(elements.get(i), champion) > 0) {
                champion = elements.get(i);
            }
        }
        return champion;
    }

    static Integer findMax(List<Integer> elements) {
        return findUltimateGeneric(elements, Comparators.MORE);
    }

    static Integer findMin(List<Integer> elements) {
        return findUltimateGeneric(elements, new IntegerLess());
    }

    static Integer findAbsMore(List<Integer> elements) {
        return findUltimateGeneric(elements, Comparators.ABS_MORE);
    }

    static String findLongest(List<String> elements) {
        return findUltimateGeneric(elements, Comparators.LONGEST_STRING);
    }

    static Animal findHeaviest(List<Animal> animals) {
        return findUltimateGeneric(animals, Animals.HEAVIEST);
    }
}
