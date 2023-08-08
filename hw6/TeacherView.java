package hw4;

import java.util.List;
import java.util.Scanner;

class TeacherView {
    public void displayTeacherList(List<Teacher> teachers) {
        for (int i = 0; i < teachers.size(); i++) {
            Teacher teacher = teachers.get(i);
            System.out.println((i + 1) + ". " + teacher.getName() + ": " + teacher.getSubject());
        }
    }

    public String[] getTeacherData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the teacher's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the subject they teach: ");
        String subject = scanner.nextLine();
        return new String[]{name, subject};
    }

    public int getTeacherIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the teacher's index: ");
        int index = scanner.nextInt() - 1;
        return index;
    }
}