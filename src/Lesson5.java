public class Lesson5 {
    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 3, 6, 9};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
