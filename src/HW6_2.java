public class HW6_2 {
    public static void main(String[] args) {

        System.out.println(sum(5, 1));
        System.out.println(diff(7, 2));
        System.out.println(multiply(5, 8));
        System.out.println(divide(21, 13));

    }
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int diff(int x, int y) {
        return x - y;
    }

    public static int multiply (int x, int y) {
        return x * y;
    }

    public static double divide (int x, int y) {
        return (double) Math.round(((1.0 * x) / y)*100) / 100;
    }
}
