package engenharia3.mvc.controller;

import engenharia3.mvc.Composite.TaskModel;
import engenharia3.mvc.observer.TaskView;

public class TaskController implements ControllerInterface {
    private TaskModel model;
    private TaskView view;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void addTask(String taskDetails) {
        model.addTask(taskDetails);
    }

    @Override
    public void editTask(int taskId, String newDetails) {
        model.editTask(taskId, newDetails);
    }

    @Override
    public void completeTask(int taskId) {
        model.completeTask(taskId);
    }

    @Override
    public void deleteTask(int taskId) {
        model.deleteTask(taskId);
    }
}