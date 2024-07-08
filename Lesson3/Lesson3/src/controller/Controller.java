package controller;
import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;
import service.BaseService;
import service.StudentGroupService;
import service.StudentService;
import service.TeacherService;

import java.time.LocalDate;
import java.util.List;

public class Controller {

    private final StudentService studentService = new StudentService();
    private final TeacherService teacherService = new TeacherService();
    private final StudentGroupService studentGroupService = new StudentGroupService();

    public Student createStudent(String firstName, String lastName, LocalDate birthDate, int groupId) {
        return studentService.createUser(firstName, lastName, birthDate, groupId);
    }

    public Student getStudentById(int id) {
        try {
            return studentService.getUserById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Student> getAllStudents() {
        return studentService.getAllUsers();
    }

    public Teacher createTeacher(String firstName, String lastName, LocalDate birthDate, int groupId) {
        return teacherService.createUser(firstName, lastName, birthDate, groupId);
    }

    public Teacher getTeacherById(int id) {
        try {
            return teacherService.getUserById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Teacher> getAllTeachers() {
        return teacherService.getAllUsers();
    }

    public StudentGroup createStudentGroup(StudentGroup studentGroup) {
        return studentGroupService.createStudentGroup(studentGroup.getTeacher(), studentGroup.getStudents());
    }

    public StudentGroup getStudentGroupByTeacherId(int teacherId) {
        try {
            return studentGroupService.getStudentGroupByTeacherId(teacherId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
