package model;

import model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup {
    public List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    @Override
    public String toString() {
        return "Группа студентов: \n" +
                students;
    }

    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }
}
