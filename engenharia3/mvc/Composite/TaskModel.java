package engenharia3.mvc.Composite;

import java.util.ArrayList;
import java.util.List;

import engenharia3.mvc.observer.TaskObserver;

public class TaskModel implements TaskSubject {
    private List<TaskObserver> observers;
    private List<Task> taskList;

    public TaskModel() {
        observers = new ArrayList<>();
        taskList = new ArrayList<>();
    }

    @Override
    public void registerObserver(TaskObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update("Task list updated");
        }
    }

    public void addTask(String taskDetails) {
        taskList.add(new Task(taskDetails));
        notifyObservers();
    }

    public void editTask(int taskId, String newDetails) {
        if (taskId >= 0 && taskId < taskList.size()) {
            taskList.get(taskId).editDetails(newDetails);
            notifyObservers();
        }
    }

    public void completeTask(int taskId) {
        if (taskId >= 0 && taskId < taskList.size()) {
            taskList.get(taskId).markComplete();
            notifyObservers();
        }
    }

    public void deleteTask(int taskId) {
        if (taskId >= 0 && taskId < taskList.size()) {
            taskList.remove(taskId);
            notifyObservers();
        }
    }

    public List<Task> getTasks() {
        return taskList;
    }
}