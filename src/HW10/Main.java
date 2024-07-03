package HW10;

public class Main {
    public static void main(String[] args) {

        Manager julia = new Manager("Julia", 10000, 10);
        Manager oleg = new Manager("Oleg", 10000, 5);
        System.out.println(julia.getSalary());
        System.out.println(oleg.getSalary());
        Director vika = new Director("Vika", 10000, 20);
        Director sasha = new Director("Sasha", 10000);
        System.out.println(vika.getSalary());
        System.out.println(sasha.getSalary());

        Employee[] allEmployees = {julia, oleg, vika, sasha};
        Manager[] allManagers = {julia, oleg};

        System.out.println(EmployeeUtils.getByName(allEmployees, "Oleg"));
        System.out.println(oleg);
        System.out.println(EmployeeUtils.getByPartialName(allEmployees, "sa"));
        System.out.println(EmployeeUtils.getByPartialName(allEmployees, "j"));
        System.out.println(EmployeeUtils.salaryBudget(allEmployees));
        System.out.println(EmployeeUtils.minSalary(allEmployees));
        System.out.println(EmployeeUtils.maxSalary(allEmployees));
        System.out.println(EmployeeUtils.minNumberOfSubordinates(allManagers));
        System.out.println(EmployeeUtils.maxNumberOfSubordinates(allManagers));
        System.out.println(EmployeeUtils.maxBonus(allEmployees));
        System.out.println(EmployeeUtils.minBonus(allEmployees));

        System.out.println(julia);
        System.out.println(vika);
    }
}
