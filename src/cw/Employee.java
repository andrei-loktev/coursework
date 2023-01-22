package cw;

public class Employee {
    private static int counter = 0;
    private String name;
    private int salary;
    private int department;
    private int id;

    public Employee (String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }
    public String getName() {return name;}
    public int getSalary() {return salary;}
    public int getDepartment() {return department;}
    public int getId() {return id;}

    public static int getCounter() {return counter;}

    public void setDepartment(int department) {this.department = department;}

    public void setSalary(int salary) {this.salary = salary;}

    @Override
    public String toString() {
        return "id:" + id +
                "; имя : " + name  +
                "; зарплата : " + salary +
                "; отдел : " + department +
                ";";
    }
}

