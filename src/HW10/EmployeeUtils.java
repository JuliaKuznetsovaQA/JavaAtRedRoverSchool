package HW10;

public class EmployeeUtils {

    static Employee getByName(Employee[] employees, String name) {

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getName().equals(name)) {
                return employees[i];
            }
        }
        return null;
    }

    static Employee getByPartialName(Employee[] employees, String partialName) {

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getName().toLowerCase().contains(partialName.toLowerCase())) {
                return employees[i];
            }
        }
        return null;
    }

    static double salaryBudget(Employee[] employees) {
        double overallSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            overallSalary += employees[i].getSalary();
            }
        return overallSalary;
    }

    static double minSalary(Employee[] employees) {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    static double maxSalary(Employee[] employees) {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    static int minNumberOfSubordinates(Manager[] managers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if(managers[i].getNumberOfSubordinates() < min) {
                min = managers[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    static int maxNumberOfSubordinates(Manager[] managers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if(managers[i].getNumberOfSubordinates() > max) {
                max = managers[i].getNumberOfSubordinates();
            }
        }
        return max;
    }

    static double maxBonus(Employee[] employees) {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            double bonus = employees[i].getSalary() - employees[i].getBaseSalary();
            if(bonus > max) {
                max = bonus;
            }
        }
        return max;
    }

    static double minBonus(Employee[] employees) {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            double bonus = employees[i].getSalary() - employees[i].getBaseSalary();
            if(bonus < min) {
                min = bonus;
            }
        }
        return min;
    }
}
