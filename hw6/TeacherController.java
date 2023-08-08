package hw4;

import java.util.List;
import java.util.Scanner;

class TeacherController {
    private TeacherService service;
    private TeacherView view;

    public TeacherController() {
        this.service = new TeacherService();
        this.view = new TeacherView();
    }

    public void createTeacher() {
        String[] teacherData = view.getTeacherData();
        service.createTeacher(teacherData[0], teacherData[1]);
    }

    public void editTeacher() {
        int index = view.getTeacherIndex();
        String[] teacherData = view.getTeacherData();
        service.editTeacher(index, teacherData[0], teacherData[1]);
    }

    public void displayTeacherList() {
        List<Teacher> teachers = service.getTeacherList();
        view.displayTeacherList(teachers);
    }
}
