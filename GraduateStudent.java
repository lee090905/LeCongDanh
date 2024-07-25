package btvn;

// Định nghĩa lớp GraduateStudent kế thừa từ Student
public class GraduateStudent extends Student {
    private String researchTopic;
    public GraduateStudent(String studentId, String name, int age, String researchTopic) {
        super(studentId, name, age);
        this.researchTopic = researchTopic;
    }
    @Override
    public double calculateGPA() {
        // Giả sử chúng ta có một mảng các điểm của sinh viên cao học
        double[] grades = {3.7, 3.8, 4.0, 3.9}; // Điểm mẫu, có thể thay đổi theo thực tế
        double total = 0.0;

        for (double grade : grades) {
            total += grade;
        }

        return total / grades.length;
    }
    public String toString(){
        return super.toString() + "ResearchTopic: " + researchTopic + ", GPA: " + calculateGPA();
    }
}
