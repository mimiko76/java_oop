package hw4;

import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create teacher");
            System.out.println("2. Edit teacher");
            System.out.println("3. Display teacher list");
            System.out.println("4. Exit");
            System.out.print("Choose an action: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    controller.createTeacher();
                    break;
                case "2":
                    controller.editTeacher();
                    break;
                case "3":
                    controller.displayTeacherList();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

