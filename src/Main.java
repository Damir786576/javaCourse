public class Main {
    private static final Employee[] employees = new Employee[5]; // create method

    public static void main(String[] args) {
        // Write employees
        employees[0] = new Employee("Мария","Назарова" ,"Александровна", 1, 5000);
        employees[1] = new Employee("Дмитрий", "Заводской","Денисович", 2, 4500);
        employees[2] = new Employee("Александр","Андреев" ,"Иванович", 3, 4800);
        employees[3] = new Employee("Денис", "Борисов","Михайлович", 4, 4200);
        employees[4] = new Employee("Ваня","Петров","Сергеевич", 5, 5200);

        // Writing values to the console
        System.out.println("Все сотрудники");
        printEmployees();

        System.out.println("\nСумма расходов на заработную плату в месяц: " + TotalSalary());

        System.out.println("\nСотрудник с самой маленькой зарплатой " + FindMin());

        System.out.println("\nСотрудник с самой большой зарплатой " + FindMax());

        System.out.println("\nСредняя зарплата " + AverageSalary());

        System.out.println("\nФИО всех сотрудников: ");
        FullNames();
    }

    // write all Employee
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
            }
        }

    // total salary all Employees
    public static double TotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();

        }
        return totalSalary;
    }

    // find minimum salary and write Employee
    public static Employee FindMin() {
        Employee minSalaryEmployee = null;
        double minSalary = 999999999;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    // find maximum salary and write Employee
    public static Employee FindMax() {
        Employee maxSalaryEmployee = null;
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    // find average salary
    public static double AverageSalary() {
        double totalSalary = TotalSalary();
        int employeeCount = 0;

        for (Employee employee : employees) {
                employeeCount++;
            }
        return totalSalary / employeeCount;
    }

    // write FullName all Employee
    public static void FullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName());

        }
    }
}