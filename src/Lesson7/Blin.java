package Lesson7;

public class Blin {
    int min;
    int max;

    String whoAreYou;

    void printWhoAreYou(int weight) {
        if (weight >= min && weight <= max) {
            System.out.println(whoAreYou);
        }
    }
}
