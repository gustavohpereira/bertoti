package engenharia3.mvc.controller;

public interface ControllerInterface {
    void addTask(String task);
    void editTask(int taskId, String newDetails);
    void completeTask(int taskId);
    void deleteTask(int taskId);
}