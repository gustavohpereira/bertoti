package engenharia3.mvc.observer;

import java.util.List;
import java.util.Scanner;

import engenharia3.mvc.Composite.Task;
import engenharia3.mvc.Composite.TaskModel;
import engenharia3.mvc.controller.ControllerInterface;

// TaskView.java
public class TaskView implements TaskObserver {
    private TaskModel model;
    private ControllerInterface controller;

    public TaskView(TaskModel model, ControllerInterface controller) {
        this.model = model;
        this.controller = controller;
        model.registerObserver(this);
    }

    @Override
    public void update(String message) {
        display();
    }

    public void display() {
        List<Task> tasks = model.getTasks();
        System.out.println("Task List:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.printf("%d. %s [%s]%n", i, task.getDetails(), task.isComplete() ? "Complete" : "Incomplete");
        }
    }

    public void interact() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an action: (1) Add Task (2) Edit Task (3) Complete Task (4) Delete Task (5) Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.println("Enter task details:");
                    String details = scanner.nextLine();
                    controller.addTask(details);
                    break;
                case 2:
                    System.out.println("Enter task ID to edit:");
                    int editId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.println("Enter new details:");
                    String newDetails = scanner.nextLine();
                    controller.editTask(editId, newDetails);
                    break;
                case 3:
                    System.out.println("Enter task ID to complete:");
                    int completeId = scanner.nextInt();
                    controller.completeTask(completeId);
                    break;
                case 4:
                    System.out.println("Enter task ID to delete:");
                    int deleteId = scanner.nextInt();
                    controller.deleteTask(deleteId);
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}