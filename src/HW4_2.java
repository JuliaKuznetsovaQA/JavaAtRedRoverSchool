import java.util.Arrays;

public class HW4_2 {
    public static void main(String[] args) {

        System.out.println("\n----------- Task 1 ------------");

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }

        System.out.println("\n----------- Task 2 ------------");

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 5) {
                System.out.println(array2[i]);
            }
        }

        System.out.println("\n----------- Task 3 ------------");

        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array3[i] + 15;
        }
        System.out.println(Arrays.toString(array3));
    }
}
