package btvn;

import java.util.ArrayList;
public class University {
    private final ArrayList<Student> students;
    University(){
        students = new ArrayList<>();
    }
    public void addStudent(Student s){ students.add(s);}
    public void displayAllStudents() {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    public static void main(String[] args) {
        University university = new University();
        Student student1 = new InternationnalStuden("20021603", "A", 20,"VietNam");
        Student student2 = new GraduateStudent("20021555", "B", 20,  "big data trong AI");
        Student student3 = new UndergraduateStudent("20021566", "C", 20,"Công Nghệ Thông Tin");

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        university.displayAllStudents();

    }
}
