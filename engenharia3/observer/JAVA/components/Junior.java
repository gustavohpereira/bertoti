public class Junior implements Subscriber {

    @Override
    public void update(String context) {
        System.out.println("Novo comentário: " + context);
    }

}