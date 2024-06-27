package service;

import model.Student;
import model.StudentComparator;
import model.StudentGroup;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentGroupService {

//    public void removeStudentByName(StudentGroup studentGroup, String name) {
//        Iterator<Student> iterator = studentGroup.iterator();
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            if (student.getFirstName().equals(name)) {
//                iterator.remove();
//            }
//        }
//    }
//
//    public void sortStudentsById(StudentGroup studentGroup) {
//        Collections.sort(studentGroup.getStudents());
//    }
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
