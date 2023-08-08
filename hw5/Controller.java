package hw5;

import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;
    
    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }
    
    public StudyGroup createStudyGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = getTeacher(teacherId);
        List<Student> students = getStudents(studentIds);
        
        return studyGroupService.createStudyGroup(teacher, students);
    }
    
    private Teacher getTeacher(int id) {
        return null;
    }
    
    private List<Student> getStudents(List<Integer> ids) {
        return null;
    }
}
