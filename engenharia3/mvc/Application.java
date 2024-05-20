package engenharia3.mvc;

import engenharia3.mvc.Composite.TaskModel;
import engenharia3.mvc.controller.TaskController;
import engenharia3.mvc.observer.TaskView;

public class Application {
 public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskController controller = new TaskController(model, null); 
        TaskView view = new TaskView(model, controller);
        controller = new TaskController(model, view); 

        view.interact();
    }
}