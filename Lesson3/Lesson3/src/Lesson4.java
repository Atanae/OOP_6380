import controller.StudentController;
import controller.TeacherController;
import model.Student;
import model.Teacher;

import java.time.LocalDate;
import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {
       new StudentController().sendOnConsole(getStudents());
       TeacherController teacherController = new TeacherController();
       teacherController.sendOnConsole();

        // Создание нового учителя
        Teacher newTeacher = teacherController.createTeacher("Анна", "Петрова", LocalDate.of(1990, 5, 10), 5);
        System.out.println("Создан новый учитель: " + newTeacher);

        // Редактирование учителя
        teacherController.updateTeacher(newTeacher, "Анна", "Иванова", LocalDate.of(1990, 5, 10));
        System.out.println("Обновленный учитель: " + newTeacher);

        // Отображение всех учителей после добавления нового
        teacherController.sendOnConsole();
    }

    private static List<Student> getStudents(){
        Student vova = new Student("Владимир", "Самбуренко", LocalDate.of(1964,11,19),1);      //, 3);
        Student tana = new Student("Татьяна", "Счастливая",LocalDate.of(1970,5,5),7);
        return List.of(vova, tana);
    }

}
