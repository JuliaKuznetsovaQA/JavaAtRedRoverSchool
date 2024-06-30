package HW9;

import HW9.employees.Employee;
import HW9.employees.Manager;
import HW9.months.MonthUtils;
import HW9.plates.LicensePlate;
import HW9.plates.LicensePlateMaker;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Maria", 22, "female", 100);

        System.out.println(emp1.getSalary(MonthUtils.SUMMER));

        Manager julia = new Manager("Julia", 33, "female", 600, 6);

        System.out.println(julia.getSalary(MonthUtils.ALL_MONTHS));

        LicensePlateMaker nyMaker = new LicensePlateMaker("NY", 1000);
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());

        LicensePlateMaker caMaker = new LicensePlateMaker("CA", 1550);
        System.out.println(caMaker.makeNextPlate().getPlate());
        System.out.println(caMaker.makeNextPlate().getPlate());
        System.out.println(caMaker.makeNextPlate().getPlate());
        System.out.println(caMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
    }
}
