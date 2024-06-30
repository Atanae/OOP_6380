package controller;

import model.Teacher;
import model.User;
import service.TeacherService;
import view.TeacherView;
import view.UserView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherController implements UserController {

    private UserView<Teacher> view = new TeacherView();
    private TeacherService teacherService = new TeacherService();
    private List<Teacher> teachers = new ArrayList<>();

    public TeacherController() {
        teachers.addAll(List.of(
                new Teacher("Иван", "Юрист", LocalDate.of(1980, 1, 1), 2),
                new Teacher("Игорь", "Авдошин", LocalDate.of(1950, 4, 3), 4)
        ));
    }

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public Teacher createTeacher(String firstName, String lastName, LocalDate birthDate, int id) {
        Teacher teacher = teacherService.createTeacher(firstName, lastName, birthDate, id);
        teachers.add(teacher);
        return teacher;
    }

    public void updateTeacher(Teacher teacher, String firstName, String lastName, LocalDate birthDate) {
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setBirthDate(birthDate);
    }

    public void sendOnConsole() {
        view.sendOnConsole(teachers);
    }
    public List<Teacher> getAllTeachers() {
        return teachers;
    }

}
