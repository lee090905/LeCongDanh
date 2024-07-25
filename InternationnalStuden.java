package btvn;

public class InternationnalStuden extends Student {
    private String country; // quốc gia

    public InternationnalStuden(String studentId, String name, int age, String country) {
        super(studentId, name, age);
        this.country = country;
    }
    @Override
    public double calculateGPA() {
        double[] grades = {3.7, 3.8, 4.0, 3.9}; // Điểm mẫu, có thể thay đổi theo thực tế
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }
    public String toString(){
        return super.toString() + ", Country: " + country + ", GPA: " + calculateGPA();
    }
}
