package session09_b5;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }
}

class OfficeEmployee extends Employee {
    private double baseSalary;

    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

class ProductionEmployee extends Employee {
    private int productCount;
    private double productPrice;

    public ProductionEmployee(String name, int productCount, double productPrice) {
        super(name);
        this.productCount = productCount;
        this.productPrice = productPrice;
    }

    @Override
    public double calculateSalary() {
        return productCount * productPrice;
    }
}

public class B5 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Vương Tuấn Linh", 10000000));
        employees.add(new ProductionEmployee("Đào Huy Hoàng", 300, 20000));
        employees.add(new ProductionEmployee("Nguyễn văn Sáng", 150, 30000));

        double totalSalary = 0;

        System.out.println("Danh sách lương nhân viên:");

        int index = 1;
        for (Employee e : employees) {
            double salary = e.calculateSalary();
            System.out.println(index + ". " + e.getName() + " - Lương: " + salary);
            totalSalary += salary;
            index++;
        }

        System.out.println("=> TỔNG LƯƠNG CÔNG TY: " + totalSalary);
    }
}
