import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int a = 8;
        do {
            System.out.println(a);
            a = a + 1;
        } while (a < 5);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int [] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] * 10;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
