public class DivulgadorVagas {

    private String mainState;
    private Subscriber[] subscribers;

    public DivulgadorVagas() {
        this.subscribers = new Subscriber[0];
    }

    public void subscribe(Subscriber subscriber) {
        Subscriber[] newSubscribers = new Subscriber[subscribers.length + 1];
        System.arraycopy(subscribers, 0, newSubscribers, 0, subscribers.length);
        newSubscribers[newSubscribers.length - 1] = subscriber;
        this.subscribers = newSubscribers;
    }

    public void unsubscribe(Subscriber subscriber) {
        Subscriber[] newSubscribers = new Subscriber[subscribers.length - 1];
        int i = 0;
        for (Subscriber s : subscribers) {
            if (!s.equals(subscriber)) {
                newSubscribers[i++] = s;
            }
        }
        this.subscribers = newSubscribers;
    }

    public void addComment(String comment) {
        this.mainState = mainState + " " + comment;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(mainState);
        }
    }
}