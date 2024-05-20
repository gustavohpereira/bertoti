package engenharia3.mvc.Composite;

import engenharia3.mvc.observer.TaskObserver;

public interface TaskSubject {
    void registerObserver(TaskObserver observer);
    void removeObserver(TaskObserver observer);
    void notifyObservers();
}