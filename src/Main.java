import cw.Employee;
public class Main {
    private static Employee[] employees = new Employee[10];

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    public static int printSalaryAmount() {
        int sum = 0;
        for (Employee employee : employees) {
                sum += employee.getSalary();
            }
        return sum;
    }
    public static void printMinSalary() {
        int minSalary = employees[0].getSalary();
        String name = null;
        for(int i = 0; i<employees.length;i++) {
            if(minSalary>=employees[i].getSalary()) {
                minSalary=employees[i].getSalary();
                name = employees[i].getName();
            }
        }
        System.out.println("минимальную зарплату " + minSalary + " получает " + name);
    }
    public static void printMaxSalary() {
        int maxSalary = employees[0].getSalary();
        String name = null;
        for(int i = 0; i<employees.length;i++) {
            if(employees[i].getSalary()>maxSalary) {
                maxSalary=employees[i].getSalary();
                name = employees[i].getName();
            }
        }
        System.out.println("максимальную зарплату " + maxSalary + " получает " + name);
    }
    public static int printAvgSalary(){
        return (printSalaryAmount()/Employee.getCounter());
    }
    public static void printNameEmployees(){
        for (Employee employee : employees){
            System.out.print(employee.getName() + " ");
        }
    }

    public static void main(String[] args) {
            employees[0] = new Employee("Андрей", 1, 10000);
            employees[1] = new Employee("Иван", 2, 20000);
            employees[2] = new Employee("Павел", 3, 30000);
            employees[3] = new Employee("Ксения", 4, 40000);
            employees[4] = new Employee("Надежда", 5, 50000);
            employees[5] = new Employee("Анна", 1, 60000);
            employees[6] = new Employee("Вера", 2, 70000);
            employees[7] = new Employee("Даша", 3, 80000);
            employees[8] = new Employee("Пётр", 4, 90000);
            employees[9] = new Employee("Ника", 5, 100000);
            printAllEmployees();
            System.out.println("зарплата всех сотрудников: " + printSalaryAmount());
            printMinSalary();
            printMaxSalary();
            System.out.println("среднее значение зарплат = " + printAvgSalary());
            printNameEmployees();
        }
    }


