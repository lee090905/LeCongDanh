
package btvn;

public abstract class Student {
    private String studentId;
    private String name;
    private int age;
    public Student(String StudentId, String name, int age){
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }
    // khai báo phương thức calculateGPA
    public abstract double calculateGPA();
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Age: " + age;
    }
}
