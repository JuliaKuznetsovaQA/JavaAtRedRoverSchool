import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[n - 1 - i];
        }
        System.out.println(Arrays.toString(result));
    }
}
