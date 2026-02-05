package session09_b1;

class Person {
    protected String hoTen;
    protected int tuoi;

    public Person(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
    }
}

class Student extends Person {
    private String maSinhVien;
    private double diemTrungBinh;

    public Student(String hoTen, int tuoi, String maSinhVien, double diemTrungBinh) {
        super(hoTen, tuoi);
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }
}

public class B1 {
    public static void main(String[] args) {
        Student sv = new Student(" Bàng Trọng Tú ", 20, "SV001", 8.5);
        sv.hienThiThongTin();
    }
}
