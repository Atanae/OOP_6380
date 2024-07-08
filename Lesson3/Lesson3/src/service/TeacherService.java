package service;

import model.DB.DataBase;
import model.impl.Teacher;

import java.time.LocalDate;
import java.util.List;

public class TeacherService extends BaseService<Teacher> {
    public TeacherService() {
        super(DataBase.teachersDB);
    }

    @Override
    protected int getUserId(Teacher user) {
        return user.getId();
    }

    @Override
    public Teacher createUser(String firstName, String lastName, LocalDate birthDate, int groupId) {
        int id = usersDB.size() + 1;
        Teacher teacher = new Teacher(id, firstName, lastName, birthDate);
        teacher.addGroupId(groupId);
        usersDB.add(teacher);
        return teacher;
    }
}
