public class HW5_1 {
    public static void main(String[] args) {

        System.out.println("\n-------- Task 1 ---------");

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        System.out.println("\n-------- Task 2 ---------");

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
            }
        }
        System.out.println(max);

        System.out.println("\n-------- Task 3 ---------");

        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < min) {
                min = array3[i];
            }
        }
        System.out.println(min);

        System.out.println("\n-------- Task 4 ---------");

        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 14, 9};
        int sum4 = 0;
        for (int i = 0; i < array4.length; i++) {
            sum4 += array4[i];
        }
        float avg = (float) Math.round((1.0 * sum4 / array4.length) * 100) / 100;
        System.out.println(avg);

        System.out.println("\n-------- Task 5 ---------");

        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum5 = 0;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                sum5 += array5[i][j];
            }
        }
        System.out.println(sum5);

        System.out.println("\n-------- Task 6 ---------");

        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max6 = Integer.MIN_VALUE;
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (array6[i][j] > max6) {
                    max6 = array6[i][j];
                }
            }
        }
        System.out.println(max6);
    }
}
