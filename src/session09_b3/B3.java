package session09_b3;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void showInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Lương cơ bản: " + baseSalary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Phòng ban: " + department);
    }
}

public class B3 {
    public static void main(String[] args) {
        Manager manager = new Manager("Trần Văn B", 15000000, "IT");
        manager.showInfo();
    }
}
