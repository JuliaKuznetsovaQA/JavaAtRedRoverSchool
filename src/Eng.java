public class Eng {
    public static void main(String[] args) {

        boolean itMoves = false;
        boolean shouldItMove = true;

        if (itMoves && !shouldItMove) {
            System.out.println("Use duct tape!");
        } else if (!itMoves && shouldItMove) {
            System.out.println("Use WD-40");
        } else {
            System.out.println("No problem!");
        }
    }
}
