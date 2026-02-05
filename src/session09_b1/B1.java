package session09_b1;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}

class Student extends Person {
    private String studentId;
    private double avgScore;

    public Student(String name, int age, String studentId, double avgScore) {
        super(name, age);
        this.studentId = studentId;
        this.avgScore = avgScore;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + avgScore);
    }
}

public class B1 {
    public static void main(String[] args) {
        Student sv = new Student("Bàng Trọng Tú", 20, "SV001", 8.5);
        sv.showInfo();
    }
}
