public class Main {

    private final static Employee[] EMPLOYEES = new Employee[6];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Алексеева Татьяна Николаевна", 2, 40_000);
        EMPLOYEES[1] = new Employee("Иванова Мария Вячеславовна", 1, 50_000);
        EMPLOYEES[2] = new Employee("Уваров Константин Юрьевич", 2, 48_000);
        EMPLOYEES[3] = new Employee("Беляев Федор Александрович", 1, 37_000);
        EMPLOYEES[4] = new Employee("Носов Владислав Павлович", 3, 60_000);
        EMPLOYEES[5] = new Employee("Пругло Мария Сергеевна", 3, 65_000);
        print();
        System.out.println("Затраты на зарплату за месяц составляют:" + calculateSalariesOfMounth());
        System.out.println("Сотрудник с минимальной зарплатой: " + findMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + findMaxSalary());
        System.out.println("Средняя зарплата сотрудников за месяц: " + calculateAverageSalary());
        printFullName();
    }

    private static void print() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int calculateSalariesOfMounth() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    private static Employee findMinSalary() {
        Employee employeeWithMinSalary = null;
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findMaxSalary() {
        Employee employeeWithMaxSalary = null;
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double calculateAverageSalary() {
        if (EMPLOYEES.length == 0) {
            return 0;
        } else return (double) calculateSalariesOfMounth() / EMPLOYEES.length;
    }

    private static void printFullName() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }

}
