public class Employee {

    private String fullName;
    private int division;
    private int salary;
    private int id;
    private static int counter = 1;

    public Employee(String fullName, int division, int salary) {
        this.fullName = fullName;
        this.division = division;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return fullName + " отдел: " + division + " зарплата: " + salary;
    }
}