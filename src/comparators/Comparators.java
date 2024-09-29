package comparators;

import airbnb.House;
import airbnb.Place;

import java.util.List;

public class Comparators {

    public static <T> T findBest(List<? extends T> elements, Comparator<? super T> comparator) {
        if (elements.isEmpty()) return null;
        T champion = elements.get(0);
        for (int i = 0; i < elements.size(); i++) {
            if (comparator.compare(elements.get(i), champion) > 0) {
                champion = elements.get(i);
            }
        }
        return champion;
    }


    public static final Comparator<House> BIGGEST_YARD = new Comparator<House>() {
        @Override
        public int compare(House a, House b) {
            double delta = a.getYardArea() - b.getYardArea();
            if(delta > 0) return 1;
            if(delta < 0) return -1;
            return 0;
        }
    };

    public static final Comparator<Place> MORE_EXPENSIVE = new Comparator<Place>() {
        @Override
        public int compare(Place a, Place b) {
            double delta = a.getDailyPrice() - b.getDailyPrice();
            if(delta > 0) return 1;
            if(delta < 0) return -1;
            return 0;
        }
    };
}
