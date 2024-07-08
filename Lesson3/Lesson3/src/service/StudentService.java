package service;

import model.DB.DataBase;
import model.impl.Student;

import java.time.LocalDate;

public class StudentService extends BaseService<Student> {
    public StudentService() {
        super(DataBase.studentsDB);
    }

    @Override
    protected int getUserId(Student user) {
        return user.getId();
    }

    @Override
    public Student createUser(String firstName, String lastName, LocalDate birthDate, int groupId) {
        int id = usersDB.size() + 1;
        Student student = new Student(id, firstName, lastName, birthDate, groupId);
        usersDB.add(student);
        return student;
    }
}
