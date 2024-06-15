public class Lesson2 {
    public static void main(String[] args) {
        int a = 13;
        int b = 4;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println("Целочисленное деление " + a + " на " + b + " = " + (a / b));
        System.out.println("Остаток от деления " + a + " на " + b + " = " + (a % b));

        if(a % 2 == 0){
            System.out.println(a + " - четное");
        }
        else {
            System.out.println(a + " - нечетное");
        }
        if(b % 2 == 0){
            System.out.println(b + " - четное");
        }
        else {
            System.out.println(b + " - нечетное");
        }
    }
}
