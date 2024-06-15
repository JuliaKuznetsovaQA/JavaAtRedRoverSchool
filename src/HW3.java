public class HW3 {
    public static void main(String[] args) {

        System.out.println("----- Task 1 -------");

        int a = 22;
        int b = 15;
        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }


        System.out.println("\n----- Task 2 -------");

        a = 12;
        b = 14;

        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        System.out.println("\n----- Task 3 -------");

        int x = 41;

        if (x > 10) {
            System.out.println("больше 10");
        }
        if (x < 100) {
            System.out.println("меньше 100");
        }
        if ((x * 1.0 / 2) > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (5 < x && x <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }


    }
}
