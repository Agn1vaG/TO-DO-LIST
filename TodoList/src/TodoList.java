import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Remove Task\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) {
                case 1: System.out.print("Enter task: "); tasks.add(sc.nextLine()); break;
                case 2: System.out.println("Tasks: " + tasks); break;
                case 3: System.out.print("Enter task number to remove: "); tasks.remove(sc.nextInt() - 1); break;
                case 4: return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
