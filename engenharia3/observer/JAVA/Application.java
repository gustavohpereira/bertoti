


public class Application {

    public static void main(String[] args) {
        DivulgadorVagas divulgadorVagas = new DivulgadorVagas();

        Estagio estagiario = new Estagio();
        Junior junior = new Junior();

        divulgadorVagas.subscribe(estagiario);
        divulgadorVagas.subscribe(junior);

        divulgadorVagas.addComment("Novo comentário 1");
        divulgadorVagas.addComment("Novo comentário 2");

        divulgadorVagas.unsubscribe(estagiario);

        divulgadorVagas.addComment("Novo comentário 3");
    }
}