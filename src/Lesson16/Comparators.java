package Lesson16;

public class Comparators {

    public static final GenericComparator<Integer> MORE = new GenericComparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            if (a > b) return 1;
            if (a < b) return -1;
            return 0;
        }
    };

    public static final GenericComparator<Integer> ABS_MORE = new GenericComparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            return MORE.compare(Math.abs(a), Math.abs(b));
        }
    };

    public static final GenericComparator<String> LONGEST_STRING = new GenericComparator<String>() {
        @Override
        public int compare(String a, String b) {
            if (a.length() > b.length()) return 1;
            if (a.length() < b.length()) return -1;
            return 0;
        }
    };
}
