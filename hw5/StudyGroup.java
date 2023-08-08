package hw5;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;
    
    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }
    public List<Student> getStudent(){
        return students;
    }
    public void setStudent(Student student){
        students.add(student);
    }
}
