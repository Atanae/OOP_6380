package service;

import model.DB.DataBase;
import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;

import java.util.List;

public class StudentGroupService {
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return new StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroupByTeacherId(int teacherId) throws Exception {
        Teacher teacher = DataBase.teachersDB.stream()
                .filter(t -> t.getId() == teacherId)
                .findFirst().orElseThrow(() -> new Exception("Учитель не найден"));

        List<Student> students = DataBase.studentsDB.stream()
                .filter(s -> s.getGroupId() == teacher.getGroups().get(0))
                .toList();

        return new StudentGroup(teacher, students);
    }
}
