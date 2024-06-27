package model;

import model.Student;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student>{

    private List<Student> students;
    private int index = 0;

    public StudentGroupIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }

    @Override
    public Student next() {
        return students.get(index++);
    }

    @Override
    public void remove() {
        if (index > 0)
            students.remove(--index);
    }
}
