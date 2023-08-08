package hw5;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 2000, 12345);
        Teacher teacher = new Teacher("Jane", 1985, 54321);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Birth Year: " + student.getBirthYear());
        System.out.println("Student ID: " + student.getStudentId());

        System.out.println("Teacher Name: " + teacher.getName());
        System.out.println("Teacher Birth Year: " + teacher.getBirthYear());
        System.out.println("Teacher ID: " + teacher.getTeacherId());
    }
}
