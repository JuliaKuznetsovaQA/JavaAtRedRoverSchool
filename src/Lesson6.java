public class Lesson6 {
    public static void main(String[] args) {

        String s = "Hello world!";
        System.out.println(s.indexOf("w"));
        String substr = s.substring(6, 9);
        System.out.println(substr);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
