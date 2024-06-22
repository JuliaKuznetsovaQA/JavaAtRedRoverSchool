public class HW6_1 {
    public static void main(String[] args) {

        System.out.println("\n-------- Task 1 ---------");
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print("о");
            }
        }

        System.out.println("\n-------- Task 2 ---------");
        String s2 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("\n-------- Task 3 ---------");
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count3 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    count3++;
                }
            }
        }
        System.out.println(count3);

        System.out.println("\n-------- Extra Task ---------");
        String s4 = "Посмотрите как Рите нравится ритм";
        String str4 = s4.toLowerCase();
        int ind = 0;
        int start = 0;
        while (ind != -1) {
            ind = str4.indexOf("рит", start);
            if (ind != -1) {
                System.out.println(ind);
            }
            start = ind + 1;
        }
    }
}
