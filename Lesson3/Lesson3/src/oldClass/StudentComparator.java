package oldClass;

import model.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    // Сортировка по id
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }

}
