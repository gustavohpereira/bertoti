public class Estagio implements Subscriber {

    @Override
    public void update(String context) {
        System.out.println("Novo comentário: " + context);
    }
}