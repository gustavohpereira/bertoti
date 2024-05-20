package engenharia3.mvc.Composite;

public class Task {
    private String details;
    private boolean isComplete;

    public Task(String details) {
        this.details = details;
        this.isComplete = false;
    }

    public String getDetails() {
        return details;
    }

    public void markComplete() {
        this.isComplete = true;
    }

    public void editDetails(String newDetails) {
        this.details = newDetails;
    }

    public boolean isComplete() {
        return isComplete;
    }
}