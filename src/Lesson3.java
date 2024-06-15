public class Lesson3 {
    public static void main(String[] args) {
        int totalOranges = 10;
        int forCheburashka = 5;

        int forGena = totalOranges - forCheburashka;

        if (forCheburashka * 2 > totalOranges) {
            System.out.println("Какой жадный Чебурашка!");
            System.out.println("Da!");
        } else if (forGena * 2 > totalOranges) {
            System.out.println("Гена жадный!");
        } else {
            System.out.println("Молодцы оба!");
        }
        System.out.println("Всё!");

    }
}
