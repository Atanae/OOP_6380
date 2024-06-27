package controller;

import model.Stream;
import model.StudentGroup;
import service.StreamService;
import service.StudentGroupService;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private StudentGroupService studentGroupService;
    private StreamService streamService;

    public Controller(StudentGroupService studentGroupService, StreamService streamService) {
        this.studentGroupService = studentGroupService;
        this.streamService = streamService;
    }

    public Controller(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public void removeStudent(StudentGroup studentGroup, String name) {
        studentGroupService.removeStudentByName(studentGroup, name);
    }

    public void sortStudentsById(StudentGroup studentGroup) {
        studentGroupService.sortStudentsById(studentGroup);
    }

    public void sortStudentsByLastName(StudentGroup studentGroup) {
        studentGroupService.sortStudentsByLastName(studentGroup);
    }

    public void sortStreamsBySize(List<Stream> streams) {
        streamService.sortStreamsBySize(streams);
    }
}
