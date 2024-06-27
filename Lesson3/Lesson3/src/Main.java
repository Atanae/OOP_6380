import controller.Controller;
import model.Stream;
import model.Student;
import model.StudentGroup;
import model.StudentGroupIterator;
import service.StreamService;
import service.StudentGroupService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup();
        Student ivan = new Student("Иван", "Юрист", LocalDate.of(1980, 1,1), 2);
        Student igor = new Student("Игорь", "Авдошин", LocalDate.of(1950,4,3),4);
        Student masha = new Student("Машенька", "Медведева",LocalDate.of(2000,10,13),3);      //, 2);
        Student ira = new Student("Ира", "Поджидаева",LocalDate.of(1963,8,30),6);             //, 1);
        Student tochka = new Student("Точка", "Наша",LocalDate.of(2000,8,30),5);        //, 2);
        Student vova = new Student("Владимир", "Самбуренко",LocalDate.of(1964,11,19),1);      //, 3);
        Student tana = new Student("Татьяна", "Своя",LocalDate.of(1970,5,5),7);       //, 3);

        studentGroup.addStudent(ivan);
        studentGroup.addStudent(igor);
        studentGroup.addStudent(masha);
        studentGroup.addStudent(ira);
        studentGroup.addStudent(tochka);
        studentGroup.addStudent(tana);
        studentGroup.addStudent(vova);

//        System.out.println(studentGroup);

        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup.getStudents());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ArrayList<Student> students = new ArrayList<>(List.of(ivan, igor, masha, ira, tochka, tana, vova));

        StudentGroupService groupService = new StudentGroupService();
        StreamService streamService = new StreamService();
        Controller controller = new Controller(groupService, streamService);
        Collections.sort(students, (s1, s2) -> s1.id - s2.id); // Сортировка по id
        System.out.println("Сортировка по id");
        System.out.println(students);

        controller.removeStudent(studentGroup, "Машенька");
        System.out.println("Удалили студента Машенька");
//        for (Student student : studentGroup.getStudents()) {
//            System.out.println(student);
//        }
        System.out.println(students);

        System.out.println("Работа с группами");
        StudentGroup studentGroup1 = new StudentGroup();
        StudentGroup studentGroup2 = new StudentGroup();
        StudentGroup studentGroup3 = new StudentGroup();

        studentGroup1.addStudent(ivan);
        studentGroup1.addStudent(igor);

        studentGroup3.addStudent(masha);
        studentGroup3.addStudent(ira);

        studentGroup2.addStudent(tochka);
        studentGroup2.addStudent(vova);
        studentGroup2.addStudent(tana);

        List<Stream> streams = new ArrayList<>();
        streams.add(new Stream(List.of(studentGroup1, studentGroup2, studentGroup3)));
        streams.add(new Stream(List.of(studentGroup2)));
        streams.add(new Stream(List.of(studentGroup1, studentGroup3)));

    //    System.out.println(streams);

        System.out.println("Потоки до сортировки:");
        for (Stream stream : streams) {
            System.out.println("Поток с " + stream.getGroups().size() + " группами");
        }

        controller.sortStreamsBySize(streams);
        System.out.println("Потоки после сортировки:");
        for (Stream stream : streams) {
            System.out.println("Поток с " + stream.getGroups().size() + " группами");
        }

        System.out.println("Сортировка студентов по фамилии внутри групп:");
        // Список для отслеживания уже отсортированных групп
        List<StudentGroup> sortedGroups = new ArrayList<>();
        for (Stream stream : streams) {
            for (StudentGroup group : stream) {
                if (!sortedGroups.contains(group)) {
                    controller.sortStudentsByLastName(group);
                    sortedGroups.add(group);
                    System.out.println("Группа после сортировки по фамилии:");
                    System.out.println(group);
                }
            }
        }
    }
}
