import classes.Funcionario;
import classes.remunerations.RemuneracaoAlta;
import classes.remunerations.RemuneracaoMedia;
import classes.remunerations.RemuneracaoPadrao;

public class Application {
     public static void main(String[] args) {
        Funcionario f = new Funcionario(1000, 10);


        f.setBonificacao(new RemuneracaoPadrao());
        int bonificacao = f.realizarbonificacao();
        System.out.println("Bonificação: " + bonificacao);

        // mudar estrategia para media
        f.setBonificacao(new RemuneracaoMedia());
        bonificacao = f.realizarbonificacao();
        System.out.println("Bonificação Media: " + bonificacao);

         // mudar estrategia para alta
         f.setBonificacao(new RemuneracaoAlta());
         bonificacao = f.realizarbonificacao();
         System.out.println("Bonificação Alta: " + bonificacao);
    }
}
