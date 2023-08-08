package hw4;

import java.util.ArrayList;
import java.util.List;

class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void createTeacher(String name, String subject) {
        Teacher teacher = new Teacher(name, subject);
        teachers.add(teacher);
    }

    public void editTeacher(int index, String newName, String newSubject) {
        Teacher teacher = teachers.get(index);
        teacher.setName(newName);
        teacher.setSubject(newSubject);
    }

    public List<Teacher> getTeacherList() {
        return teachers;
    }
}
