public class Junior implements Subscriber {

    @Override
    public void update(String context) {
        sendEmailToAdmin(context);
    }

    private void sendEmailToAdmin(String context) {
        // Enviar e-mail para o administrador com o novo comentário
    }
}