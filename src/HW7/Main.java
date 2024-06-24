package HW7;

public class Main {
    public static void main(String[] args) {

        Person Julia = new Person();
        Julia.name = "Julia";
        Julia.gender = "female";
        Julia.age = 50;

        Person Oleg = new Person();
        Oleg.name = "Oleg";
        Oleg.gender = "male";
        Oleg.age = 60;

        Person alian = new Person();
        alian.name = "Roger Smith";
        alian.gender = "x";
        alian.age = 150;

        System.out.println(Oleg.getName());
        System.out.println(Julia.getName());
        System.out.println(alian.getName());

        Employee oleg = new Employee();
        oleg.name = "Oleg";
        oleg.salary = 1000;
        Employee kuzya = new Employee();
        kuzya.name = "Oleg";
        kuzya.salary = 800;
        Employee julia = new Employee();
        julia.name = "Julia";
        julia.salary = 1500;

        System.out.println(oleg.isSameName(kuzya));
        System.out.println(julia.isSameName(oleg));

        Employee[] employeeArray = {oleg, kuzya, julia};
        System.out.println(Salary.getSum(employeeArray));

    }
}
