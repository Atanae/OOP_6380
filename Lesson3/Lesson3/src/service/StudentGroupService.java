package service;

import model.Student;
import model.StudentGroup;

import java.util.Collections;
import java.util.Comparator;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public void addStudent(Student student){
        studentGroup.students.add(student);
    }

    public void removeStudentByName(StudentGroup studentGroup, String name) {
        studentGroup.getStudents().removeIf(student -> student.getFirstName().equals(name));
    }

    public void sortStudentsById(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudents(), Comparator.comparingInt(Student::getId));
    }

    public void sortStudentsByLastName(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudents(), Comparator.comparing(Student::getLastName));
    }

}
