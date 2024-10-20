import java.util.Objects;

public class Employee {
    private static int counter = 0;
    private final int id;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int department;
    private double salary;

    public Employee(String firstName, String middleName , String lastName, int department, double salary) {
        this.id = ++counter; // gives Employee id
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(middleName, employee.middleName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, department, salary);
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "id=" + id +
                ", Имя='" + firstName + '\'' +
                ", Фамилия='" + middleName + '\'' +
                ", Отчество='" + lastName + '\'' +
                ", Департамент='" + department + '\'' +
                ", Зарплата=" + salary +
                '}';
    }
}