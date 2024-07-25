package btvn;

public class UndergraduateStudent extends Student {
    private String major;
    public UndergraduateStudent(String studentId, String name, int age, String major){
        super(studentId, name, age);
        this.major = major;
    }
    @Override
    public double calculateGPA() {
        double[] grades = {3.0,3.5,3.7,4.0};
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }
    public String toString(){
        return super.toString() + ", Major: " + major + ", GPA: " + calculateGPA();
    }
}
