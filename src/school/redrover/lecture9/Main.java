package school.redrover.lecture9;

public class Main {
    public static void main(String[] args) throws Exception {

        User user = new User("i_petrov");
        System.out.println(user.getFullName());
        user.setFullName("Ivan Petrov");

        System.out.println(user.getFullName());

    }
}
