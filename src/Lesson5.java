public class Lesson5 {
    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 3, 1, 9};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        System.out.println("----- SUM OF ARRAY ------");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        System.out.println("----- MAX OF 2D ARRAY ------");

        int [][] arr2d = {
            {1, 3, 6},
            {7, 9, 17},
            {3, 8, 23}
        };

        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] > max1) {
                    max1 = arr2d[i][j];
                }
            }
        }
        System.out.println(max1);

    }
}
