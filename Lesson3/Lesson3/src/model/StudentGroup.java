package model;

import model.impl.Student;
import model.impl.Teacher;

import java.util.List;

public class StudentGroup {
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "УчебнаяГруппа: " +
                teacher +
                students +
                '\n';
    }

}
