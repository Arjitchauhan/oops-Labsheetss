package lab_sheet_10.Q08;

import java.util.Stack;

class Task {
    private final int taskId;
    private final String description;

    Task(int taskId, String description) {
        this.taskId = taskId;
        this.description = description;
    }

    void display() {
        System.out.println("Task ID: " + taskId + ", Description: " + description);
    }
}

class TaskManager {
    private final Stack<Task> tasks = new Stack<>();

    void pushTask(Task task) {
        tasks.push(task);
    }

    Task popCompletedTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to complete.");
            return null;
        }
        return tasks.pop();
    }

    void displayRemainingTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No remaining tasks.");
            return;
        }
        for (Task task : tasks) {
            task.display();
        }
    }
}

public class TaskStack {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.pushTask(new Task(1, "Read assignment"));
        manager.pushTask(new Task(2, "Write code"));
        manager.pushTask(new Task(3, "Test program"));

        System.out.println("Completed task:");
        Task completed = manager.popCompletedTask();
        if (completed != null) {
            completed.display();
        }

        System.out.println("Remaining tasks:");
        manager.displayRemainingTasks();
    }
}
