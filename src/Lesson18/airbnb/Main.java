package Lesson18.airbnb;

import Lesson18.airbnb.comparators.Comparators;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new Room(1, 2, 20.0).getInfo());

        List<House> houses = List.of(
                new House(11, 5, 200.0, 3, 2, 1000.0),
                new House(12, 8, 500.0, 6, 4, 10000.0)
        );

        List<Room> rooms = List.of(
                new Room(21, 1, 20.0),
                new Room(22, 2, 40.0)
        );

        List<Place> all = new ArrayList<>();
        all.addAll(houses);
        all.addAll(rooms);

//        System.out.println(Comparators.findBest(houses, Comparators.BIGGEST_YARD).getInfo());
//        System.out.println(Comparators.findBest(houses, Comparators.BIGGEST_YARD.reverse()).getInfo());
//
//        System.out.println(Comparators.findBest(all, Comparators.MORE_EXPENSIVE).getInfo());
//        System.out.println(Comparators.findBest(all, Comparators.MORE_EXPENSIVE.reverse()).getInfo());
//
//        System.out.println(Comparators.findBest(houses, Comparators.MORE_EXPENSIVE).getInfo());

                /*
                List<House> не подкласс List<Place>, хотя House - подкласс Place
                 */

//        printList(all);
        printList(rooms);

    }

    public static void printList(List<? extends Place> places) {
        for (Place place: places) {
            System.out.println(place.getInfo());
        }
    }
}
