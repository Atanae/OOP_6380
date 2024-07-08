package view;

import controller.Controller;
import model.DB.DataBase;
import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class View {

    private final Controller controller = new Controller();

    public void start(){
        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Создать студента");
            System.out.println("2 - Найти студента по id");
            System.out.println("3 - Все студенты");
            System.out.println("4 - Создать преподавателя");
            System.out.println("5 - Найти преподавателя по id");
            System.out.println("6 - Все преподаватели");
            System.out.println("7 - Создать учебную группу");
            System.out.println("8 - Найти учебную группу по id преподавателя");
            System.out.println("0 - выход");

            switch (scanner.nextInt()) {
                case 1 -> createStudent();
                case 2 -> getStudentById();
                case 3 -> getAllStudents();
                case 4 -> createTeacher();
                case 5 -> getTeacherById();
                case 6 -> getAllTeachers();
                case 7 -> createStudentGroup();
                case 8 -> getStudentGroupByTeacherId();
                case 0 -> System.exit(0);// выход из приложения
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = scanner.nextLine();
        System.out.println("Введите дату рождения:");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Введите номер группы:");
        int groupId = scanner.nextInt();
        Student student = controller.createStudent(firstName, lastName, birthDate, groupId);
        System.out.println(student);
        return student;
    }
    private Student getStudentById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id студента: ");
        int id = scanner.nextInt();
        Student student = controller.getStudentById(id);
        System.out.println(student);
        return student;
    }
    private List<Student> getAllStudents(){
        List<Student> students = controller.getAllStudents();
        System.out.println(students);
        return students;
    }

    private Teacher createTeacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = scanner.nextLine();
        System.out.println("Введите дату рождения:");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Введите номер группы:");
        int groupId = scanner.nextInt();
        Teacher teacher = controller.createTeacher(firstName, lastName, birthDate, groupId);
        System.out.println(teacher);
        return teacher;
    }
    private Teacher getTeacherById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id преподавателя: ");
        int id = scanner.nextInt();
        Teacher teacher = controller.getTeacherById(id);
        System.out.println(teacher);
        return teacher;
    }
    private List<Teacher> getAllTeachers(){
        List<Teacher> teachers = controller.getAllTeachers();
        System.out.println(teachers);
        return teachers;
    }

    private void createStudentGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id преподавателя:");
        int teacherId = scanner.nextInt();
        StudentGroup studentGroup = controller.getStudentGroupByTeacherId(teacherId);
        if (studentGroup != null) {
            System.out.println("Учебная группа уже существует: " + studentGroup);
        } else {
            System.out.println("Учебная группа создана.");
        }
    }
    private void getStudentGroupByTeacherId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id преподавателя:");
        int id = scanner.nextInt();
        StudentGroup studentGroup = controller.getStudentGroupByTeacherId(id);
        if (studentGroup != null) {
            System.out.println(studentGroup);
        } else {
            System.out.println("Учебная группа не найдена");
        }
    }
}
