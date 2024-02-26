package classes.remunerations;

public class RemuneracaoAlta implements RemunerationInterface {
    public int bonificar(int salario, int tempo) {
        return salario + (salario * tempo * 5);
    }
}