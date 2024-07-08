package service;

import model.DB.DataBase;
import model.StudentGroup;
import model.User;
import model.impl.Student;
import model.impl.Teacher;

import java.time.LocalDate;
import java.util.List;

public abstract class BaseService<T extends User> implements UserService<T> {
    protected final List<T> usersDB;

    protected BaseService(List<T> usersDB) {
        this.usersDB = usersDB;
    }

    @Override
    public T getUserById(int id) throws Exception {
        return usersDB.stream()
                .filter(user -> getUserId(user) == id)
                .findFirst()
                .orElseThrow(() -> new Exception("Пользователь не найден"));
    }

    @Override
    public List<T> getAllUsers() {
        return usersDB;
    }

    protected abstract int getUserId(T user);
}

//    public Student createStudent(String firstName, String lastName, LocalDate birthDate, int idGroup) {
//        int id = DataBase.studentsDB.size() + 1;
//        Student student = new Student(id, firstName, lastName, birthDate, idGroup);
//        DataBase.studentsDB.add(student);
//        return student;
//    }
//    public Student getStudentById(int id) throws Exception {
//        Student student = DataBase.studentsDB.stream()
//                .filter(s -> s.getId() == id)
//                .findFirst().orElse(null);
//        if (student == null){
//            throw new Exception("Студент не найден");
//        }
//        return student;
//    }
//    public List<Student> getAllStudents(){
//        return DataBase.studentsDB;
//    }
//
//    public Teacher createTeacher(String firstName, String lastName, LocalDate birthDate, int groupId) {
//        int id = DataBase.teachersDB.size() + 1;
//        Teacher teacher = new Teacher(id, firstName, lastName, birthDate);
//        teacher.addGroupId(groupId);
//        DataBase.teachersDB.add(teacher);
//        return teacher;
//    }
//    public Teacher getTeacherById(int id) throws Exception {
//        Teacher teacher = DataBase.teachersDB.stream()
//                .filter(s -> s.getId() == id)
//                .findFirst().orElse(null);
//        if (teacher == null){
//            throw new Exception("Учитель не найден");
//        }
//        return teacher;
//    }
//    public List<Teacher> getAllTeachers(){
//        return DataBase.teachersDB;
//    }
//
//    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
//        StudentGroup studentGroup = new StudentGroup(teacher, students);
//        return studentGroup;
//    }
//    public StudentGroup getStudentGroupByTeacherId(int teacherId) throws Exception {
//        Teacher teacher = DataBase.teachersDB.stream()
//                .filter(t -> t.getId() == teacherId)
//                .findFirst().orElse(null);
//        if (teacher == null) {
//            throw new Exception("Учитель не найден");
//        }
//
//        List<Student> students = DataBase.studentsDB.stream()
//                .filter(s -> s.getGroupId() == teacher.getGroups().get(0))
//                .toList();
//
//        return new StudentGroup(teacher, students);
//    }
//}
