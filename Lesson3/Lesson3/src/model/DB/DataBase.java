package model.DB;

import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static void fillDB() {
        Teacher teacher = new Teacher(1,"Наталья", "Максимова", LocalDate.of(1970, 02, 25));
        teacher.addGroupId(1);

        teachersDB.add(teacher);
        Student s1 = new Student(1, "Татьяна", "Авдошина", LocalDate.of(1970, 05, 05), 1);
        Student s2 = new Student(2, "Андрей", "Авдошин", LocalDate.of(1996, 8, 30), 1);
        studentsDB.add(s1);
        studentsDB.add(s2);
    }
}
