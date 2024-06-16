import java.util.Arrays;

public class HW4_1 {
    public static void main(String[] args) {

        System.out.println("\n------------ Task 1 ------------");

        int[] m = new int[16];
        for (int i = 0; i < 16; i++) {
            m[i] = i;
        }
        System.out.println(Arrays.toString(m));

        System.out.println("\n------------ Task 2 ------------");

        int n = 0;
        while ((int) Math.pow(5, n) < 10000) {
            System.out.println("5 в степени " + n + " = " + (int) Math.pow(5, n));
            n ++;
        }

        System.out.println("\n------------ Task 3a ------------");

        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\n------------ Task 3b ------------");

        for (int i = 40; i <= 60 ; i = i + 4) {
            System.out.println(i);
        }
    }
}
